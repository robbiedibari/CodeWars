package MIxedSum;

import java.util.ArrayList;
import java.util.List;



public class MixedSum{
    public static void main(String[] args) {
        List <Object> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add("10");
        list.add("5");

        System.out.println(sum(list));
    }

    public static int sum (List<?> mixed){
        int sumList = 0;

        List<Integer> ListInteger = new ArrayList<>();

        for(Object item: mixed){
            if(item instanceof Integer){
                ListInteger.add((Integer)item);
            } else if(item instanceof String){
                try{
                    ListInteger.add(Integer.parseInt((String) item));
                } catch(NumberFormatException e){

                }
            }
        }
//        for(int i  = 0; i < ListInteger.size(); i++){
//            sumList = sumList + ListInteger.get(i);
//        }

        for(int number : ListInteger){
            sumList += number;
        }



       return sumList;

    }
}
