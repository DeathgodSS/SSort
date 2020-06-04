package setutility;

import java.util.HashSet;
import java.util.Set;

public class SetUtility {

    private SetUtility(){}

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        validator(set1, set2);
        HashSet<T> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        validator(set1, set2);
        HashSet<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static <T> Set<T> minus(Set<T> set1, Set<T> set2) {
        validator(set1, set2);
        HashSet<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    public static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        validator(set1, set2);
        return union(minus(set1, set2), minus(set2, set1));
    }

    private static <T> void validator(Set<T> set1, Set<T> set2){
        if (set1 == null) {
            throw new NullPointerException("null set in first argument");
        } else if (set2 == null) {
            throw new NullPointerException("null set in second argument");
        }
    }
}