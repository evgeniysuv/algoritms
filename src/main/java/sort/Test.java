package sort;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class Test {
    public static void main(String[] args) {
        Data x = new Data(1);
        Data y = new Data(2);


        swap(x, y);

        System.out.println("x = " + x + " y = " + y);
    }

    private static void swap(Data x, Data y) {
        Data temp = x;
        x.data = y.data;
//        x = y;
        y.data = temp.data;
    }

}
@AllArgsConstructor
@ToString
class Data{
    int data;
}
