import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class enoughIsEnough {
    public static int [] deleteNth (int[] elements, int maxOccurrences){

        List<Integer>result = new ArrayList<>();
        Map<Integer,Integer> count = new HashMap<>();

        for(int num : elements){
            if(count.getOrDefault(num, 0) < maxOccurrences){
                result.add(num);
                count.put(num, count.getOrDefault(num,0) + 1);
            }
        }

        int [] newArr = new int[result.size()];
        for(int i  = 0; i < result.size(); i++){
            newArr[i] = result.get(i);
        }

        return newArr;

    }
    public static void main(String[] args) {
        int [] arr1 = {20,37,21};
        int [] arr2 = {1,1,3,3,7,2,2,2};
        int [] arr3 = {1,2,3,1, 1, 2, 2, 3, 3, 4, 5};
        int [] arr4 ={1, 1, 1, 1, 1 };
        int [] arr5 ={};

        printArr(deleteNth(arr1,1));
        printArr(deleteNth(arr2,2));
        deleteNth(arr3,3);
        deleteNth(arr4,5);
        deleteNth(arr5,5);

    }
    public static void printArr(int [] arr){
        for(int num : arr){
            System.out.print(num+ " ");
        }
        System.out.println();
    }
}
