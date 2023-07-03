import java.lang.Math;

public class NextPerfectSquare {
    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
        System.out.println(findNextSquare(625));
        System.out.println(findNextSquare(114));
    }

    public static long findNextSquare(long sq) {
        if (!isPerfectSquare(sq)) {
            return -1;
        } else {
            double squareRoot = Math.sqrt(sq);
            double FindNext = (squareRoot + 1) * (squareRoot + 1);
            return (long) FindNext;
        }
    }

    public static boolean isPerfectSquare(long sq) {
        double parsingValue = (double) sq;
        parsingValue = Math.sqrt(sq);

        if ((int) (parsingValue * 10.0) % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
