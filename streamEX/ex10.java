import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex10 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("김코딩", "박해커");
        List<String> list2 = Arrays.asList("최자바", "이스프링");
        List<String> output = mergeTwoStream(list1, list2);
        System.out.println(output);
    }

    private static List<String> mergeTwoStream(List<String> list1, List<String> list2) {

        return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
    }
}
