package DescendingOrder;
import java.util.Arrays;

public class DescendingOrder {


    public static void main(String[] args) {
        int num = 1234456;
        System.out.println(sortDesc(num));
    }
    public static int sortDesc(final int num){
            String numStr = Integer.toString(num);
            char[] numArr = numStr.toCharArray();
            Arrays.sort(numArr);
            StringBuilder sb = new StringBuilder(String.valueOf(numArr));
            String reversed = sb.reverse().toString();
            return Integer.parseInt(reversed);

    }
}
