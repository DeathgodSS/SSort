import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sort.InvalidObjectException;
import sort.SortingContext;
import sort.sortable.Sortable;
import sort.sortable.impl.*;

import static org.junit.Assert.*;

public class SortingContextTest {

    private SortingContext sortingContext;
    private Sortable sortable;
    private int[] arr;
    private int[] expected;

    @Before
    public void setUp() {
        sortable = null;
        arr = new int[]{4, 7, 12, -1, 22, -7, 11, 6};
        expected = new int[]{-7, -1, 4, 6, 7, 11, 12, 22};
    }

    @After
    public void tearDown() {
        sortingContext = null;
    }

    @Test
    public void testByBubbleSort() throws InvalidObjectException {
        sortingContext = new SortingContext(new BubbleSort());
        int[] actual = sortingContext.sort(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBySelectionSort() throws InvalidObjectException {
        sortingContext = new SortingContext(new SelectionSort());
        int[] actual = sortingContext.sort(arr);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = InvalidObjectException.class)
    public void testWithNotInitializedSortObject() throws InvalidObjectException {
        sortingContext = new SortingContext(sortable);
    }
}