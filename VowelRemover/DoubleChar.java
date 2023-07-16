package VowelRemover;

public class DoubleChar {
    public static void main(String[] args) {
        String str = "Hello!";
        System.out.println(doubleChar(str));
    }
    public static String doubleChar(String s){
        StringBuilder newStr = new StringBuilder();
        for(int i  = 0; i < s.length(); i++){
            char c = s.charAt(i);
            newStr.append(c).append(c);
    }
       String result = newStr.toString();
        return result;

    }
}
