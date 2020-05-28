package testSort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sort.EmptyArrayException;
import sort.InvalidArrayException;
import sort.sortable.impl.BubbleSort;

import static org.junit.Assert.*;

public class BubbleSortTest {

    private BubbleSort bubbleSort;
    private int[] arr;
    private int[] notInitializedArr;
    private int[] emptyArr;
    private int[] singleElementArr;
    private int[] expected;

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
        arr = new int[]{4, 7, 12, -1, 22, -7, 11, 6};
        notInitializedArr = null;
        emptyArr = new int[]{};
        singleElementArr = new int[]{42};
        expected = new int[]{-7, -1, 4, 6, 7, 11, 12, 22};
    }

    @After
    public void tearDown() {
        bubbleSort = null;
    }

    @Test
    public void testSort() {
        int[] actual = bubbleSort.sort(arr);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = InvalidArrayException.class)
    public void testSortWithNotInitializedArray() {
        bubbleSort.sort(notInitializedArr);
    }

    @Test(expected = EmptyArrayException.class)
    public void testEmptyArraySort() {
        int[] actual = bubbleSort.sort(emptyArr);
    }

    @Test(expected = EmptyArrayException.class)
    public void testSingleElementArraySort() {
        int[] actual = bubbleSort.sort(singleElementArr);
    }
}
