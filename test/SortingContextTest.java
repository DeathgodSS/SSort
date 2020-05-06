import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sort.SortingContext;
import sort.sortable.impl.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class SortingContextTest {
    SortingContext sortingContext;
    int[] arr;
    int[] expected;

    @Before
    public void setUp() throws Exception {
        arr = new int[]{4, 7, 12, -1, 22, -7, 11, 6};
        expected = new int[]{-7, -1, 4, 6, 7, 11, 12, 22};
    }

    @After
    public void tearDown() throws Exception {
        sortingContext = null;
    }

    @Test
    public void testByBubbleSort() {

        sortingContext = new SortingContext(new BubbleSort());
        int[] actual = sortingContext.sort(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBySelectionSort() {

        sortingContext = new SortingContext(new SelectionSort());
        int[] actual = sortingContext.sort(arr);
        assertArrayEquals(expected, actual);
    }


}