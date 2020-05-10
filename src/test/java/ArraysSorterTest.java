import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraysSorterTest {

    @Test
    void sortTest1() {
        Integer [] arr = {1,2,4,3,7,16};
        Integer [] result = {1,3,7,2,4,16};
        runSortTest(arr,result);
    }

    // test for duplicate values
    @Test
    void sortTest2() {
        Integer [] arr = {1,3,4,5,2,4,5,8,9};
        Integer [] result = {1,3,5,5,9,2,4,4,8};
        runSortTest(arr,result);
    }

    // test for negative values
    @Test
    void sortTest3() {
        Integer [] arr = {4,6,2,1,-5,3,5,-22};
        Integer [] result = {-5,1,3,5,-22,2,4,6};
        runSortTest(arr,result);
    }

    // test for big values
    @Test
    void sortTest4() {
        Integer [] arr = {412121212,64212321,23234535,12321,23211234};
        Integer [] result = {12321, 23234535, 64212321, 23211234, 412121212};
        runSortTest(arr,result);
    }

    void runSortTest(Integer []  actual , Integer [] expected)
    {
        ArraysSorter.sort(actual);
        assertEquals(Arrays.toString(expected),
                Arrays.toString(actual),
                "your array"+ Arrays.toString(actual) +
                        "does not match " + Arrays.toString(expected));
    }


}