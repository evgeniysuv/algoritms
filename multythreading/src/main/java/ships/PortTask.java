package ships;

public class PortTask implements Runnable {

    private Port port;
    private Ship ship;
    private int cargoCount;
    private Port.Process loadingType;

    public PortTask(Port port, Ship ship, int cargoCount, Port.Process loadingType) {
        this.port = port;
        this.ship = ship;
        this.cargoCount = cargoCount;
        this.loadingType = loadingType;
    }

    @Override
    public void run() {
        port.processShip(ship, cargoCount, loadingType);
    }
}
