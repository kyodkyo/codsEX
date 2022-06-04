import java.util.Arrays;

public class ex05 {
    public static void main(String[] args) {
        int output = arrSum(new int[]{-1, -2, 1, 3});
        System.out.println(output);
    }

    public static int arrSum(int[] ints) {
        if(ints.length==0){
            return 0;
        }

        int head = ints[0];
        int[] tail = Arrays.copyOfRange(ints, 1, ints.length);

        return head + arrSum(tail);
    }
}
