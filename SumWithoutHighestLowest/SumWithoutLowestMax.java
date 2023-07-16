package SumWithoutHighestLowest;
import java.util.ArrayList;

public class SumWithoutLowestMax {
    public static void main(String[] args) {
        int [] arr = {1 , 2 ,3 , 5 ,6 ,7 ,8 ,9};
        int [] test = {6, 2, 1, 8, 10};

        System.out.println(sum(test));
    }


    public static int sum (int [] numbers){

        if(numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;


        for(int i = 0; i < numbers.length; i++){
             if (min > numbers[i])
               min = numbers[i];

            if(max < numbers[i])
                max = numbers[i];

            sum += numbers[i];
        }
        return sum - (min + max);
    }
}
