import java.util.Arrays;

public class Recur07 {
    public static void main(String[] args) {
        int output = lengthOfArr(new int[] {1, 3, 5, 7, 9});
        System.out.println(output);
    }

    public static int lengthOfArr(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return 1 + lengthOfArr(tail);
    }
}
