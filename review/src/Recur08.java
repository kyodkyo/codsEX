import java.util.Arrays;

public class Recur08 {
    public static void main(String[] args) {
        int[] output = removeElements(2, new int[]{1, 3, -2, 7});
        System.out.println(Arrays.toString(output));
    }

    public static int[] removeElements(int num, int[] arr){
        if(num>=arr.length){
            return new int[]{};
        }
        if(num==0){
            return arr;
        }
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return removeElements(num-1, tail);
    }
}
