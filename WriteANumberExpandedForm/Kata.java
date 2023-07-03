package WriteANumberExpandedForm;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        int test = 12;
        int test2 = 12300;

        System.out.println(expandedForm(test));


    }
    public static String expandedForm(int num) {
        StringBuilder expandedForm = new StringBuilder();


        int multiplier = 1;
        while (num > 0){
            int digit = num % 10;
            if(digit != 0){
                if(expandedForm.length() > 0)
                expandedForm.insert(0," + ");

                expandedForm.insert(0,digit * multiplier);
            }
            num /= 10;
            multiplier *=10;
        }

        return expandedForm.toString();
    }
}