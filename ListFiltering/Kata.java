package ListFiltering;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        List<Object> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("bwfer");
        list.add(4);
        List<Object> newList = filterList(list);
        System.out.println(newList);
        FilterList2ndSolution(list);
        System.out.println(list);
    }
    public static List<Object> filterList(final List<Object> list){
        List<Object>filteredList = new ArrayList<>(); // Create an empty list to store the filtered list
        for(Object element: list){ // iterate thorugh each element
            if(element instanceof Integer ){ // if the element is an integer;
                filteredList.add((Integer)element);// add the element to the filtered list
            }
        }
        return filteredList;
    }
    public static List<Object>FilterList2ndSolution(final List<Object> list){
        Iterator<Object> iterator = list.iterator(); // Create an interator for the input list
        while(iterator.hasNext()){ // iterate through the input list
            Object element = iterator.next();// get the next element
            if(element instanceof String){ // if the element is in a string remove it.
                iterator.remove();
            }
        }
        return list;
    }
}
