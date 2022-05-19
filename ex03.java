import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex03 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = filterNum(list);
        System.out.println(output);
    }

    private static List<Integer> filterNum(List<Integer> list) {

        return list.stream().filter(x -> x%2==0).collect(Collectors.toList());
    }
}
