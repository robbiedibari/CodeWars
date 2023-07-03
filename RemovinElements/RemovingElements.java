package RemovinElements;



public class RemovingElements {
    public static void main(String[] args) {
        Object[] array = {1, "Two", 3, "Four", 5, "Six", 7, "Eight", 9, "Ten"};

        // Print the original array
        System.out.println("Original Array: ");
        printArr(array);

        // Remove every second element
        Object[] modifiedArray = removeEveryOther(array);

        // Print the modified array
        System.out.println("Modified Array: ");
        printArr(modifiedArray);

    }
    public static Object[] removeEveryOther(Object[] arr) {

        Object[] newArr = new Object[(arr.length + 1) / 2]; // Calculate the new size of the array

        for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }

    public static void printArr (Object [] arr){
       for(Object obj : arr){
           System.out.print(obj + " ");
       }
        System.out.println();
    }
}
