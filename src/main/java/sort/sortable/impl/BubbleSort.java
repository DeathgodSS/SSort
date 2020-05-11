package sort.sortable.impl;

import sort.EmptyArrayException;
import sort.InvalidArrayException;
import sort.sortable.*;

public class BubbleSort implements Sortable {

    @Override
    public int[] sort(int[] arr) {
        isNullArray(arr);
        isEmptyArray(arr);
        isSingleElementArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
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
