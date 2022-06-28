import java.util.Arrays;

public class daily22 {
    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{2, 1, 3});
        System.out.println(Arrays.toString(output)); // --> [1, 2, 3]
    }

    public static int[] swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }

    public static int[] bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int count = 0;

            for(int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1]) {
                    arr = swap(arr, j, j+1);
                    count++;
                }
            }
            if(count==0) break;
        }
        return arr;
    }
}
