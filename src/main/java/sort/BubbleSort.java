package sort;

import static sort.BubbleSort.Direction.ASC;

public class BubbleSort {
    private BubbleSort() {
        throw new IllegalStateException();
    }

    public static <T extends Comparable> void sort(T[] data) {
        sort(data, ASC);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Comparable> void sort(T[] data, Direction direction) {
        if (isArrayContainsNullElements(data))
            return;

        for (int out = data.length - 1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                switch (direction) {
                    case ASC:
                        if (data[in].compareTo(data[in + 1]) > 0)
                            swap(data, in, in + 1);
                        break;
                    case DESC:
                        if (data[in].compareTo(data[in + 1]) < 0)
                            swap(data, in + 1, in);
                        break;
                }
            }
        }
    }

    private static <T extends Comparable> boolean isArrayContainsNullElements(T[] data) {
        for (T element : data) {
            if (element == null)
                return true;
        }
        return false;
    }

    private static <T extends Comparable> void swap(T[] data, int position1, int position2) {
        T temp = data[position1];
        data[position1] = data[position2];
        data[position2] = temp;
    }

    public enum Direction {
        ASC, DESC
    }
}
