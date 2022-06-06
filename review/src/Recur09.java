import java.util.Arrays;

public class Recur09 {
    public static void main(String[] args) {
        int[] output = newArr(2, new int[]{4, -2, 3, 7});
        System.out.println(Arrays.toString(output));
    }

    public static int[] newArr(int num, int[] arr){
        if(num>arr.length || arr.length==0){
            return arr;
        }

        if(num==arr.length){
            return arr;
        }

        int[] head = Arrays.copyOfRange(arr, 0, arr.length-1);

        return newArr(num, head);
    }
}
