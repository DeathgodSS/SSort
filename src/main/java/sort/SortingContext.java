package sort;

import sort.sortable.Sortable;

public class SortingContext {

    private Sortable sortable;

    public SortingContext(Sortable sortable) throws InvalidObjectException{
        if (sortable == null) {
            throw new InvalidObjectException("The link does't contain an object");
        }
        this.sortable = sortable;
    }

    public void setSortable(Sortable sortable) throws InvalidObjectException{
        if (sortable == null) {
            throw new InvalidObjectException("The link does't contain an object");
        }
        this.sortable = sortable;
    }

    public int[] sort(int[] arr) {
        try {
            return sortable.sort(arr);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        return arr;
    }
}
