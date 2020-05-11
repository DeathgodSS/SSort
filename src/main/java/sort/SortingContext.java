package sort;

import sort.sortable.Sortable;

public class SortingContext {

    private Sortable sortable;

    public SortingContext(Sortable sortable) {
        this.sortable = sortable;
    }

    public void setSortable(Sortable sortable) {
        this.sortable = sortable;
    }

    public int[] sort(int[] arr) {
        return sortable.sort(arr);
    }
}
