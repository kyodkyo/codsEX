import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex13 {
    public static void main(String[] args) {
        List<String> male = Arrays.asList("김코딩", "최자바", "김코츠");
        List<String> female = Arrays.asList("박해커", "김유클", "김코딩");
        List<String> output = findPeople(male, female, "김");
        System.out.println(output);
    }

    private static List<String> findPeople(List<String> male, List<String> female, String lastName) {
        Stream<String> result = Stream.concat(male.stream(), female.stream());
        return result.distinct().filter(x->x.startsWith(lastName)).sorted().collect(Collectors.toList());
    }
}
