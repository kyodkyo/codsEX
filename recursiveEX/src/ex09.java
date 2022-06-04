
import java.util.Arrays;

public class ex09 {
    public static void main(String[] args) {
        int[] output = take(2, new int[]{1, -2, 1, 3});
        System.out.println(output);

        output = take(5, new int[]{1, -2, 1, 3});
        System.out.println(output);
    }

    public static int[] take(int num, int[] arr){
        if(num == 0 || arr.length == 0) return new int[]{};
        int[] head = Arrays.copyOfRange(arr, 0, 1);
        int[] tail = take(num - 1, Arrays.copyOfRange(arr, 1, arr.length));

        int[] dest = new int[head.length + tail.length];
        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);
        return dest;
    }
}
