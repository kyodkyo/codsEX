import java.util.Arrays;

public class Recur05 {
    public static void main(String[] args) {
        int output = sumOfArray(new int[]{-1, 4, 2, -7});
        System.out.println(output);
    }

    public static int sumOfArray(int[] arr){
        if(arr.length==0){
            return 0;
        }

        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return head + sumOfArray(tail);
    }


}
