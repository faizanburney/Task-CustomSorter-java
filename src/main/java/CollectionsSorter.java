
import java.util.*;

public class CollectionsSorter {

    public static void sort(List lst)
    {
        Collections.sort(lst,new EvenOddComparator());
    }
}
