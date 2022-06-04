import java.util.Arrays;

public class ex11 {
    public static void main(String[] args) {
        boolean output = or(new boolean[]{true, true, false});
        System.out.println(output);

        output = or(new boolean[]{false, false, false});
        System.out.println(output);
    }

    public static boolean or(boolean[] arr) {
        if (arr.length == 0) {
            return false;
        }

        boolean check = arr[0];
        boolean reArr = or(Arrays.copyOfRange(arr, 1, arr.length));

        if (check || reArr) {
            return true;
        } else {
            return false;
        }
    }
}
