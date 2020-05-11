package sort.sortable.impl;

import sort.EmptyArrayException;
import sort.InvalidArrayException;
import sort.sortable.*;

public class SelectionSort implements Sortable {

    @Override
    public int[] sort(int[] arr) {
        isNullArray(arr);
        isEmptyArray(arr);
        isSingleElementArray(arr);
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
    private void isNullArray(int[] arr) {
        if (arr == null) {
            throw new InvalidArrayException("The link does't contain an array");
        }
    }
    private void isEmptyArray(int[] arr) {
        if (arr.length == 0) {
            throw new EmptyArrayException("The array contains zero elements");
        }
    }
    private void isSingleElementArray (int[] arr) {
        if (arr.length == 1) {
            throw new EmptyArrayException("The array contains only one element");
        }
    }
}
