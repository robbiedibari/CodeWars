package Stream;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class LearningStream {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(5);list.add(5);list.add("Frafra");list.add("Blabla");list.add(223);list.add(8);
        System.out.println(list);
        List<Object> integerList = list.stream().filter(obj -> obj instanceof Integer)
                .map(a -> (Integer) a)
                .collect(Collectors.toList());
        System.out.println(integerList);

    }
}
