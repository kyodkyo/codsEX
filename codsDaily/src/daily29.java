import java.util.ArrayList;
import java.util.Arrays;

public class daily29 {
    public static void main(String[] args) {
        int output = tiling(2);
        System.out.println(output); // --> 2

        output = tiling(4);
        System.out.println(output); // --> 5
    }

    public static int tiling(int num){
        ArrayList<Integer> memo = new ArrayList<>(Arrays.asList(0, 1, 2));
        return aux(num, memo);
    }

    public static int aux(int size, ArrayList<Integer> memo){
        if(memo.size() > size)
            return memo.get(size);
        memo.add(aux(size-1, memo) + aux(size-2, memo));
        return memo.get(size);
    }
}
