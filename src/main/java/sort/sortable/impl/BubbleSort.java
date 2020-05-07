package sort.sortable.impl;

import sort.InvalidObjectException;
import sort.sortable.*;

public class BubbleSort implements Sortable {

    @Override
    public int[] sort(int[] arr) throws InvalidObjectException {
        if (arr == null) {
            throw new InvalidObjectException("The link does't contain an array");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }
}
