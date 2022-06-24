import java.util.Arrays;

public class daily21 {
    public static void main(String[] args) {
        int output = largestMultiple(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = largestMultiple(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }

    public static int largestMultiple(int[] arr){
        Arrays.sort(arr);
        int i = arr.length-1;
        int result = arr[i] * arr[i-1] * arr[i-2];
        int mmp = arr[0]*arr[1]*arr[i];
        if(mmp>result){
            result = mmp;
        }
        return result;

        /**
             Arrays.sort(arr);
             int i = arr.length-1;

             int right = arr[i] * arr[i-1] * arr[i-2];
             int left = arr[0] * arr[1] * arr[i];

             int result=right;
             if(left>right) result = left;

             return result;
         */


        /**
             Arrays.sort(arr);
             int i = arr.length;
             int result = arr[i] * arr[i-1] * arr[i-2];
             if(arr[0]*arr[1]*arr[i]>result){
             result = arr[0] * arr[1] * arr[i];
             }
             return result;
         */
    }
}
