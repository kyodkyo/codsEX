import java.util.Arrays;

public class ex13 {
    public static void main(String[] args) {
        int arr[] = getElementsAfter(new int[]{1, 3, 5, 7, 9}, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getElementsAfter(int[] arr, int num) {
        int[] myArr = new int[arr.length-num];
        System.arraycopy(arr, num, myArr, 0, myArr.length);
        return myArr;
    }

}

