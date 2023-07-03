import java.util.ArrayList;
import java.util.Arrays;

public class JadenCase {
    public static void main(String[] args) {
        String value = "la macchina di bettega";
        String value1 = " ";
        System.out.println(toJadenCase(value));
        System.out.println(toJadenCase(value1));

    }


    public static  String toJadenCase(String phrase) {
        if(phrase == null || phrase.isEmpty()) {
            return null;
        }
        // TODO put your code below this comment
        StringBuilder str = new StringBuilder();
        // Capitalize the first Character.
        boolean capitalized = true;

        char[] newArr = phrase.toCharArray();


        for(char values : newArr) {

            if(Character.isWhitespace(values)) {
                capitalized = true; // Set Flag to capitalize next character
            } else {
                if(capitalized) {
                values = Character.toUpperCase(values);// Capitalize character
                capitalized = false;// set flag to false
                }
            }
            str.append(values); // append character to result.

        }

        return str.toString();
    }

}
