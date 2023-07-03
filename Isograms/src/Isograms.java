import java.util.HashSet;
import java.util.Set;

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function
that determines wheter a string that contains only letter is an isogram. Assume the empty string is an isogram.ignore letter case
 */
public class Isograms {
    public static boolean isIsogram(String str){
        Set<Character> set = new HashSet<>();  // Create a set<Character> to keep track of the characters we've seen so far
        for(char c : str.toLowerCase().toCharArray()){ // we loop to each character in the string using toCharArray() method
            if(!set.add(c)){ // if add return false it means that the charachter is already inside the set. Í
                return false;
            }
        }
        return true;
        }

    public static void main(String[] args) {
        String z = "Dermatoglyphics";
        String a = "isogram";
        String b ="moose";
       String c ="isIsogram";
       String d ="aba";
       String e ="moOse";
       String f ="thumbscrewjapingly";
       String h = "";

        System.out.println(isIsogram(z));
        System.out.println(isIsogram(a));
        System.out.println(isIsogram(b));
        System.out.println(isIsogram(c));
        System.out.println(isIsogram(d));
        System.out.println(isIsogram(e));
        System.out.println(isIsogram(f));
        System.out.println(isIsogram(h));
    }
    }



