package BinaryAddition;

public class UnderstandingBinaryAddition {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        do {
            int sum = a ^ b;
            int carry = (a & b) << 1;
            a = sum;
            b = carry;

        }while(b != 0);
        String result = Integer.toBinaryString(a);



        System.out.println( a ^ b);
        System.out.println(result);
    }

}
