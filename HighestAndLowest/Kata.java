package HighestAndLowest;

import java.lang.reflect.Array;

public class Kata {
    public static void main(String[] args) {
       String numbers = " 1 2 3 4 5 6 7 8 47";
        System.out.println(highAndLow(numbers));
       }


    public static String highAndLow(String numbers){
        String [] values = numbers.trim().split("\\s+");
        int max = Integer.parseInt(values[0]);
        int min = Integer.parseInt(values[0]);

        for( int i = 0; i < values.length; i++){
          int n = Integer.parseInt(values[i]);
          if(n > max){
              max = n;
          } if(n < min){
              min = n;
            }
    }
        return max + " " + min;
    }
}