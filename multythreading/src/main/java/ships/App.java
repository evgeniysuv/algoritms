package ships;

/**
 * Клиент для работы порта.
 * Корабли могут заходить в порт для разгрузки / загрузки контейнеров.
 * Количество контейнеров, находятся в текущий момент в порту и на корабле,
 * должно быть неотъемлемой и не превышать заданную грузоподъемность судна и емкость порта.
 * В порту работает несколько причалов. В одном причале может стоять только один корабль.
 * Корабль может загружаться у причала, разгружаться или выполнять оба действия.
 */
public class App {
    public static void main(String[] args) {

        Port port = new Port(30, 2);
        Ship ship  = new Ship("Ship 1", 10);
        Ship ship2  = new Ship("Ship 2", 10);
        Ship ship3  = new Ship("Ship 3", 10);

        PortTask portTask = new PortTask(port, ship, 10, Port.Process.LOADING);
        PortTask portTask2 = new PortTask(port, ship2, 10, Port.Process.LOADING);
        PortTask portTask3 = new PortTask(port, ship3, 10, Port.Process.LOADING);

        port.executeTask(portTask);
        port.executeTask(portTask2);
        port.executeTask(portTask3);
    }

}
