import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class daily12 {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }

    public static int[] reverseArr(int[] arr){
        if(arr.length==0){
            return arr;
        }

        int head = arr[0];
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 1, arr.length));

        int[] result = new int[tail.length+1];
        System.arraycopy(tail, 0, result, 0, tail.length);
        result[result.length-1] = head;

        return result;
    }
}
