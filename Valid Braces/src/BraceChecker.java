import java.util.Stack;

public class BraceChecker {
    public static boolean isValid(String braces){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < braces.length(); i++) {
            char symbol = braces.charAt(i);


            if (symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);
            }

            if (stack.isEmpty())
                return false;

            char check;
            switch (symbol) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;

            }
        }
                return stack.isEmpty();

        }

    public static void main(String[] args) {
        String a = "(){}[]";
        String b = "([{}])";
        String c = "(}";
        String d = "[(])";
        String e = "[({})](]";

        System.out.println(isValid(a));
        System.out.println(isValid(b));
        System.out.println(isValid(c));
        System.out.println(isValid(d));
        System.out.println(isValid(e));

    }

}

