import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sort.sortable.impl.BubbleSort;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {
    private BubbleSort bubbleSort;
    private int[] arr;
    private int[] expected;

    @Before
    public void setUp() throws Exception {
        bubbleSort = new BubbleSort();
        arr = new int[]{4, 7, 12, -1, 22, -7, 11, 6};
        expected = new int[]{-7, -1, 4, 6, 7, 11, 12, 22};
    }

    @After
    public void tearDown() throws Exception {
        bubbleSort = null;
    }

    @Test
    public void testSort() {
        int[] actual = bubbleSort.sort(arr);
        assertArrayEquals(expected, actual);
    }
}