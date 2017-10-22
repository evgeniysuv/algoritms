package sort;

import static sort.BubbleSort.Direction.ASC;

public class BubbleSort {
    private BubbleSort() {
        throw new IllegalStateException();
    }

    public static void sort(int[] data) {
//        sort(data, DESC);
        sort(data, ASC);
    }

    public static void sort(int[] data, Direction direction) {
        for (int out = data.length - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (direction == ASC) {
                    if (data[in] > data[in + 1])
                        swap(data, in, in + 1);
                } else {
                    if (data[in] < data[in + 1])
                        swap(data, in + 1, in);
                }

            }
        }

    }


    private static void swap(int[] data, int position1, int position2) {
        int temp = data[position1];
        data[position1] = data[position2];
        data[position2] = temp;
    }

    enum Direction {
        ASC, DESC
    }

    public static void main(String[] args) {
        int[] ints = {1, 4, 2, 5, 3, 7, 8,  6, 0, 9};
        BubbleSort.sort(ints);
        for (int i = 0; i < ints.length - 1; i++) {
            System.out.print(ints[i]);
        }
        System.out.println();
    }
}
