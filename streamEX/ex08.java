import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ex08 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 32, 5};
        Integer output = findBiggestNumber(arr);
        System.out.println(output);
    }

    private static Integer findBiggestNumber(int[] arr) {
        if(arr.length==0){
            return null;
        }

        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        Integer max = stat.getMax();
        return max;
    }
}
