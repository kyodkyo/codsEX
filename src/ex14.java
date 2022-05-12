import java.util.Arrays;

public class ex14 {
    public static void main(String[] args) {
        int arr[] = getElementsUpTo(new int[]{1, 3, 5, 7, 9}, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getElementsUpTo(int[] arr, int num){
        int[] myArr = new int[num];
        System.arraycopy(arr, 0, myArr, 0, num);
        return myArr;
    }
}
