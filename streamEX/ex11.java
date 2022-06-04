import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = makeElementDouble(list);
        System.out.println(output);
    }

    private static List<Integer> makeElementDouble(List<Integer> list) {
        return list.stream().map(x->x*2).collect(Collectors.toList());
    }
}
