import java.util.Arrays;
import java.util.List;

public class ex07 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "김자바");
        String[] output = filterName(names);
        System.out.println(output);
    }

    private static String[] filterName(List<String> names) {
        if(names.size()==0){
            return new String[]{};
        }

        return names.stream().distinct().filter(x -> x.startsWith("김")).sorted().toArray(String[]::new);
    }
}
