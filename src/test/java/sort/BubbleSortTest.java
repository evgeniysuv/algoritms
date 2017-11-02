package sort;

import org.junit.Test;

import static sort.BubbleSort.Direction.DESC;

public class BubbleSortTest {
    @Test
    public void sort() throws Exception {
        String[] strings = new String[10];
        BubbleSort.sort(strings);
    }

    @Test
    public void sortDesc() throws Exception {
        String[] strings = new String[10];
        BubbleSort.sort(strings, DESC);
    }
}
