package Anagram;

import java.util.Arrays;

public class Kata {
    public static boolean isAnagram(String test, String original){
        String str = test.toLowerCase();
        String str2 = original.toLowerCase();
        boolean result = false;

        if(str.length() == str2.length()){
            char [] str1 = str.toCharArray();
            char [] str3 = str2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str3);

            result = Arrays.equals(str1,str3);
        }

        return result;

    }

    public static void main(String[] args) {
        String a = "care";
        String b = "race";

        System.out.println(isAnagram(a,b));
    }
}
