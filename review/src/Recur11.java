import java.util.Arrays;

public class Recur11 {
    public static void main(String[] args) {
        boolean output = checkLogic2(new boolean[]{true, true, false});
        System.out.println(output);
    }

    public static boolean checkLogic2(boolean[] arr){
        if(arr.length==0){
            return false;
        }

        boolean head = arr[0];
        boolean[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        if(head || checkLogic2(tail)) {
            return true;
        }

        return false;
    }
}
