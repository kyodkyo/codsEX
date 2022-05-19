import java.util.Arrays;
import java.util.List;

public class ex06 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "박해커");
        String[] output = makeUniqueNameArray(names);
        System.out.println(output);
    }

    private static String[] makeUniqueNameArray(List<String> names) {
        return names.stream().distinct().sorted().toArray(String[]::new);
    }
}
