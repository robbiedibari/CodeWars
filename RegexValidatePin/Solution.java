package RegexValidatePin;

public class Solution {
    public static void main(String[] args) {
        System.out.println(validatePin("0000"));
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("00i0"));
        System.out.println(validatePin("1111"));
        System.out.println(validatePin("123456"));
        System.out.println(validatePin("098765"));
        System.out.println(validatePin("000000"));
        System.out.println(validatePin("090909"));
        System.out.println(validatePin("323"));
    }


    public static boolean validatePin(String pin){
        boolean isDigit = pin.matches("\\d+");
        if(isDigit){
        char [] arr = pin.toCharArray();
        return arr.length == 4 || arr.length == 6;
        }else
            return false;
    }

}
