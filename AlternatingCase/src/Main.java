public class Main {
    public static void main(String[] args) {
        String test = "Hello World";
        System.out.println(alternateCase(test));
    }

    public static String alternateCase(String string) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (Character.isUpperCase(c)) {
                str.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                str.append(Character.toUpperCase(c));

            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}