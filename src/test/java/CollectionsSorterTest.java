import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsSorterTest {

    @Test
    void sortTest1() {
        List<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr,1, 2, 4, 3, 7, 16);
        List<Integer> result =new ArrayList<Integer>();
        Collections.addAll(result,1,3,7,2,4,16);
        runSortTest(arr,result);
    }

    // test for duplicate values
    @Test
    void sortTest2() {
        List<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr,1,3,4,5,2,4,5,8,9);
        List<Integer> result = new ArrayList<Integer>();
        Collections.addAll(result,1,3,5,5,9,2,4,4,8);
        runSortTest(arr,result);
    }

    // test for negative values
    @Test
    void sortTest3() {
        List<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr,4,6,2,1,-5,3,5,-22);
        List<Integer> result = new ArrayList<Integer>();
        Collections.addAll(result,-5,1,3,5,-22,2,4,6);
        runSortTest(arr,result);
    }

    // test for big values
    @Test
    void sortTest4() {
        List<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr,412121212,64212321,23234535,12321,23211234);
        List<Integer> result = new ArrayList<Integer>();
        Collections.addAll(result,12321, 23234535, 64212321, 23211234, 412121212);
        runSortTest(arr,result);
    }

    void runSortTest(List<Integer>  actual , List<Integer> expected)
    {
        CollectionsSorter.sort(actual);
        assertEquals(expected,
                actual,
                "your list"+ actual +
                        "does not match " + expected);
    }


}