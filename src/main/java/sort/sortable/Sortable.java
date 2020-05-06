package sort.sortable;

public interface Sortable {

    int[] sort(int[] arr);

    default void swap(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
}
