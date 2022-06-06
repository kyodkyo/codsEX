import java.util.Arrays;

public class Recur06 {
    public static void main(String[] args) {
        int output = multipleOfArray(new int[]{-1, 4, 2, -7});
        System.out.println(output);
    }

    public static int multipleOfArray(int[] arr){
        if(arr.length==1){
            return arr[0];
        }

        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return head * multipleOfArray(tail);
    }
}
