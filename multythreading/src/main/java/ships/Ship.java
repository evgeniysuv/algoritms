package ships;

public class Ship implements Runnable{
    private int capacity = 100;
    private final String name;
    private int containerCount;


    public Ship(String name, int containerCount) {
        this.name = name;
        this.containerCount = containerCount;
        if (containerCount > capacity)
            throw new IllegalArgumentException();
    }

    public Ship(int containerCount, int capacity) {
        this("Ship 1", containerCount);
        this.capacity = capacity;
    }

    public void loadContainer(int containerCount) {
        checkCapacity(containerCount, true);
        loading(containerCount);
        this.containerCount += containerCount;
    }

    public void unloadContainer(int containerCount) {
        checkCapacity(containerCount, false);
        loading(containerCount);
        this.containerCount -= containerCount;
    }

    private void checkCapacity(int containerCount, boolean isLoading) {
        if (isLoading && (this.containerCount + containerCount) > this.capacity) {
            throw new IllegalArgumentException();
        } else if (!isLoading && (this.containerCount - containerCount) < 0) {
            throw new IllegalArgumentException();
        }
    }

    private void loading(int containerCount) {
        for (int i = 0; i < containerCount; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Loading ship = " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {

    }
}
