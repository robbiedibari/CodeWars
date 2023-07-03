package HashMapChallenge1;

/* Task:
    Given a list and a number, create a new list that contains each number of list at most N times, without re-ordering.
    For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since
    this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
    With list [20,37,20,21] and number 1, the result would be [20,37,21].
 */

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EnoughIsEnough {

    public static int[] deleteNth(int [] elements, int maxOccurrences){


        return null;
    }

    public static int hash(int [] arr, int key){
        return Math.abs(key % arr.length);
    }
}
