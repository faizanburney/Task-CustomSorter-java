import java.util.Comparator;

public class EvenOddComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        //same either odd or even
        if(o1%2 == o2%2)
        {// just return 0 in case internal sorting is not desired.
            if(o1<o2) //sort with in same even/odd
                return -1;
            else if(o2>01)
                return 1;
            else
                return 0;
        }else if(o1%2 == 0)
            return 1;
        else
            return -1;
    }
}
