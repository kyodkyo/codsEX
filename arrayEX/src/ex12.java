import java.util.Arrays;

public class ex12 {
    public static void main(String[] args) {
        int arrr[] = mergeArray(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(Arrays.toString(arrr));
    }

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int index = arr1.length + arr2.length;
        int[] myArr = new int[index];
        System.arraycopy(arr1, 0, myArr, 0, arr1.length);
        System.arraycopy(arr2, 0, myArr, arr1.length, arr2.length);
        return myArr;
    }
}
