import java.util.Arrays;

public class ArraysSorter {

    public static void sort(Integer [] arr)
    {
        Arrays.sort(arr,new EvenOddComparator());
    }
}
