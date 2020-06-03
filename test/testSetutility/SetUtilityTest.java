package testSetutility;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import setutility.SetUtility;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SetUtilityTest {

    SetUtility<Integer> setUtility = new SetUtility<>();

    HashSet<Integer> set1 = new HashSet<>(7);
    HashSet<Integer> set2 = new HashSet<>(7);
    HashSet<Integer> nullSet1 = null;
    HashSet<Integer> nullSet2 = null;
    HashSet<Integer> expectedUnion = new HashSet<>();
    HashSet<Integer> expectedIntersection = new HashSet<>();
    HashSet<Integer> expectedMinus = new HashSet<>();
    HashSet<Integer> expectedDifference = new HashSet<>();


    @Before
    public void setUp() {
        for (int i = 1; i < 8; i++) {
            set1.add(i);
        }

        for (int i = 3; i < 10; i++) {
            set2.add(i);
        }

        for (int i = 1; i < 10; i++) {
            expectedUnion.add(i);
        }

        for (int i = 3; i < 8; i++) {
            expectedIntersection.add(i);
        }

        for (int i = 1; i < 3; i++) {
            expectedMinus.add(i);
        }

        for (int i = 1; i < 10; i++) {
            if ((i >= 3) && (i <= 7)) continue;
            expectedDifference.add(i);
        }
    }

    @After
    public void tearDown() {
    }

    @Test
    public void union() {
        Set<Integer> actual = setUtility.union(set1, set2);
        assertEquals(actual, expectedUnion);
    }

    @Test
    public void unionNegativeCase() {
        Set<Integer> actual = setUtility.union(set1, set2);
        assertNotEquals(actual, expectedIntersection);
    }

    @Test
    public void intersection() {
        Set<Integer> actual = setUtility.intersection(set1, set2);
        assertEquals(actual, expectedIntersection);
    }

    @Test
    public void intersectionNegativeCase() {
        Set<Integer> actual = setUtility.intersection(set1, set2);
        assertNotEquals(actual, expectedUnion);
    }

    @Test
    public void minus() {
        Set<Integer> actual = setUtility.minus(set1, set2);
        assertEquals(actual, expectedMinus);
    }

    @Test
    public void minusNegativeCase() {
        Set<Integer> actual = setUtility.minus(set1, set2);
        assertNotEquals(actual, expectedDifference);
    }

    @Test
    public void difference() {
        Set<Integer> actual = setUtility.difference(set1, set2);
        assertEquals(actual, expectedDifference);
    }

    @Test
    public void differenceNegativeCase() {
        Set<Integer> actual = setUtility.difference(set1, set2);
        assertNotEquals(actual, expectedMinus);
    }

    @Test(expected = NullPointerException.class)
    public void exceptionNullFirstArgumentCase() {
        setUtility.difference(nullSet1, set2);
    }

    @Test(expected = NullPointerException.class)
    public void exceptionNullSecondArgumentCase() {
        setUtility.difference(set1, nullSet2);
    }
}