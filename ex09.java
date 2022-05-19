import java.util.Arrays;

public class ex09 {
    public static void main(String[] args) {
        String[] strArr = {"codestates", "java", "backend", "programming"};
        int output = findLongestLength(strArr);
        System.out.println(output);
    }

    private static int findLongestLength(String[] strArr) {

        return Arrays.stream(strArr).mapToInt(String::length).max().getAsInt();
    }
}
