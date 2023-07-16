package StrayNumber;

public class StrayNumber {
    public static void main(String[] args) {
        int [] numbers = {1, 1, 1, 1, 2};
        int [] numbers2 = {1,17,17,17,17,17,17};
        int [] numbers3 = {8, 1, 1 ,1, 1};
        System.out.println(stray(numbers2));
    }
    static int stray (int [] numbers){
        int numNonEqual = numbers[1];

        for(int i = 0; i < numbers.length; i++){
            if(numNonEqual != numbers[i])
                return numbers[i];
        }

        return 0;
    }
}
