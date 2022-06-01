import java.util.Arrays;

public class ex15 {
    public static void main(String[] args) {
        int[] myArr = getAllEmenets(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(myArr));
    }

    public static int[] getAllEmenets(int[] arr) {
        if (arr.length == 0) {
            return new int[]{};
        }

        int[] result = Arrays.copyOfRange(arr, 1, arr.length);
        return result;
    }
}
