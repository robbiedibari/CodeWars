package RemoveStringSpaces;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "A H B e l l a !";
        System.out.println(noSpace(str));
    }
    public static String noSpace(final String x) {

        return x.replaceAll(" ", "");
    }
}
