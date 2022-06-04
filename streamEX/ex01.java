import java.util.Arrays;
import java.util.List;

public class ex01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int output = computeSumOfAllElements(list);
        System.out.println(output);
    }

    private static int computeSumOfAllElements(List<Integer> list) {
        if(list.size()==0){
            return 0;
        }
        return list.stream().mapToInt(x -> x).sum();

        /*
        IntSummaryStatistics stat = list.stream().mapToInt(x->x).summaryStatistics();
        int sum = stat.getSum();
        return sum;
         */
    }
}
