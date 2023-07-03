package SmallestInteger;

public class SmallestIntegerFinder {
    public static void main(String[] args) {
        int[] bella = {1, 2, 3, 4, 5, 6, -3};
        System.out.println(findSmallestInt(bella));
        int[] bella1 = {-124, -12453, -100,-19435, -1103, 12423, -122, -1212};
        System.out.println(findSmallestInt(bella1));
    }

    public static int findSmallestInt(int[] args) {
        int smallest = 99999;

        for (int i = 0; i < args.length - 1; i++) {
            if (args[i] < smallest) {
                smallest = args[i];
            }
        }
        return smallest;
    }
}
