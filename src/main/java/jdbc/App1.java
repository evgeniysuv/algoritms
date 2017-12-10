package jdbc;

public class App1 {
    public static void main(String[] args) {
        Object[] ref = new Object[1];
        while (true) {
            ref[0] = new Object[]{ref};
            ref = (Object[]) ref[0];
        }
    }
}

class Data {
    static void print() {
        System.out.println("hello");
    }
}