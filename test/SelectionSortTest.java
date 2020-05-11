import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sort.InvalidObjectException;
import sort.sortable.impl.SelectionSort;

import static org.junit.Assert.*;

public class SelectionSortTest {

    private SelectionSort selectionSort;
    private int[] arr;
    private int[] notInitializedArr;
    private int[] expected;

    @Before
    public void setUp() {
        selectionSort = new SelectionSort();
        arr = new int[]{4, 7, 12, -1, 22, -7, 11, 6};
        notInitializedArr = null;
        expected = new int[]{-7, -1, 4, 6, 7, 11, 12, 22};
    }

    @After
    public void tearDown() {
        selectionSort = null;
    }

    @Test
    public void testSort() {
        int[] actual = selectionSort.sort(arr);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = InvalidObjectException.class)
    public void testSortWithNotInitializedArray() {
        selectionSort.sort(notInitializedArr);
    }
}