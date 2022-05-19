import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ex02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double output = computeAverageOfNumbers(list);
        System.out.println(output);
    }

    private static double computeAverageOfNumbers(List<Integer> list) {
        if(list.size()==0){
            return 0;
        }
        IntSummaryStatistics stat = list.stream().mapToInt(x->x).summaryStatistics();
        double avg = stat.getAverage();
        return avg;
    }
}
