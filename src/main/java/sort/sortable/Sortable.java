package sort.sortable;

import sort.InvalidObjectException;

public interface Sortable {

    int[] sort(int[] arr) throws InvalidObjectException;

    default void swap(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
}
