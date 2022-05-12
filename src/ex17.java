import java.util.Arrays;

public class ex17 {
    public static void main(String[] args) {
        int[] abc = {1, 2, 3, 4};
        int[] result = getElements(abc, 1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getElements(int[] arr, int index) {
        if (arr.length < index) {
            return arr;
        }

        int count = 0;
        int[] rArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            rArr[count] = arr[i];
            count++;
        }
        return rArr;
    }
}
