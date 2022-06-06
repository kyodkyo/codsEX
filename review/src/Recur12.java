import java.util.Arrays;

public class Recur12 {
    public static void main(String[] args) {
        int[] output = reArr(new int[]{1, 3, 5, 7, 9});
        System.out.println(Arrays.toString(output));
    }

    public static int[] reArr(int[] arr){
        if(arr.length==0){
            return arr;
        }

        int head = arr[0];
        int[] tail = reArr(Arrays.copyOfRange(arr, 1, arr.length));

        int[] result = new int[tail.length+1];
        result[result.length-1] = head;
        System.arraycopy(tail, 0, result, 0, tail.length);

        return result;
    }
}
