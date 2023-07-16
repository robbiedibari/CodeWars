package VowelRemover;

import java.util.Stack;

public class Solution {
    public static String shortcut(String input){
        String output = input.toLowerCase();
        String newOutput = output.replaceAll("[aeiou]","");
        return newOutput;
        }




    public static void main(String[] args) {
        String name = "codewars";
        System.out.println(shortcut(name));

    }
}
