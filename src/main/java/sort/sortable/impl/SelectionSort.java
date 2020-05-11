package sort.sortable.impl;

import sort.InvalidObjectException;
import sort.sortable.*;

public class SelectionSort implements Sortable {

    @Override
    public int[] sort(int[] arr) {
        if (arr == null) {
            throw new InvalidObjectException("The link does't contain an array");
        }
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            swap(arr, i, index);
        }
        return arr;
    }
}
