package BinaryAddition;

import java.util.Arrays;

/*
Implement a function that adds two numbers together and returns their sum in binary. The conversion can be done before, or after the addition.

The binary number returned should be a string.

Examples:(Input1, Input2 --> Output (explanation)))

1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)

 */
public class BinaryAdditions {
    public static void main(String[] args) {
        System.out.println(binaryAddition(100,3));
    }
    public static String binaryAddition(int a, int b) {
//        String binaryA = Integer.toBinaryString(a);
//        String binaryB = Integer.toBinaryString(b);
//
//        int maxLength = Math.max(binaryA.length(),binaryB.length());
//        binaryA = String.format("%" + maxLength + "s", binaryA).replace(' ','0');
//        binaryB = String.format("%" + maxLength + "s",binaryB).replace(' ', '0');
//
//        int sum = Integer.parseInt(binaryA,2) + Integer.parseInt(binaryB,2);
//        String binarySum = Integer.toBinaryString(sum);
//
//            return binarySum;
//            int sum, carry;
//            do {
//                sum = a ^ b;             // XOR operation to get the sum without carrying
//                carry = (a & b) << 1;    // AND operation followed by left shift to get the carry
//                a = sum;
//                b = carry;
//            } while (b != 0);           // repeat until there is no more carry
//            return Integer.toBinaryString(a);  // return the binary sum as a string
        return Integer.toBinaryString(a + b);
        }


    }


