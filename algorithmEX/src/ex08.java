import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ex08 {
    public static void main(String[] args) {
        int M = 4;
        int N = 8;
        ArrayList<Integer[]> output = dividing(M, N);
        System.out.println(output);
        // [[1, 4, 8], [2, 2, 4], [4, 1, 2]]
    }

    public static ArrayList<Integer[]> dividing(int M, int N) {
        int gcf = divisor(M, N); //gcf : 최대공약수
        int sqrt = (int)Math.floor(Math.sqrt(gcf)); //sqrt : 제곱근

        ArrayList<Integer[]> result = new ArrayList<>();
        
        for(int i=1; i<=sqrt; i++){
            if(gcf%i == 0) {
                result.add(new Integer[]{i, M/i, N/i});
                if(i*i < gcf)
                    result.add(new Integer[]{gcf/i, M/(gcf/i), N/(gcf/i)});
            }
        }

        Collections.sort(result, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });

        return result;
    }

    public static int divisor(int M, int N) {
        if(M%N==0) return N;
        return divisor(N, M%N);
    }
}