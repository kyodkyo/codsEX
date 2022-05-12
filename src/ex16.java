import java.util.Arrays;

public class ex16 {
    public static void main(String[] args) {
        int[] output = getAllElements(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(output));
    }

    public static int[] getAllElements(int[] arr) {
        if (arr.length == 0) {
            return new int[]{};
        }

        int[] result = Arrays.copyOfRange(arr, 0, arr.length - 1);
        return result;
    }
}
