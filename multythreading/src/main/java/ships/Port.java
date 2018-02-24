package ships;


import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static ships.Port.Process.LOADING;

public class Port {
    private static final int MAX_CAPACITY = 100;

    private int containersCount;
    private ExecutorService dockService;


    public Port(int containersCount, int dockCount) {
        if (dockCount <= 0 || containersCount <= 0)
            throw new IllegalArgumentException();
        dockService = Executors.newFixedThreadPool(dockCount);
        this.containersCount = containersCount;
    }

    public void executeTask(PortTask portTask) {
        dockService.execute(portTask);
    }

    public void processShip(@NotNull Ship ship, int cargoCount, @NotNull Process process) {
        if (process == LOADING) {
            checkPortCapacity(cargoCount, false);
            ship.loadContainer(cargoCount);
            synchronized (this) {
                this.containersCount -= cargoCount;
            }
        } else {
            checkPortCapacity(cargoCount, true);
            ship.unloadContainer(cargoCount);
            synchronized (this) {
                this.containersCount += cargoCount;
            }
        }
    }

    private synchronized void checkPortCapacity(int containerCount, boolean isLoading) {
        if (isLoading && (this.containersCount + containerCount) > MAX_CAPACITY) {
            throw new IllegalArgumentException();
        } else if (!isLoading && (this.containersCount - containerCount) < 0) {
            throw new IllegalArgumentException();
        }
    }

    public enum Process {
        LOADING,
        UNLOADING
    }
}
