import java.util.Arrays;

public class ex07 {
    public static void main(String[] args) {
        int output = arrLength(new int[]{1, -2, 1, 3});
        System.out.println(output);
    }

    public static int arrLength(int[] ints) {
        if(ints.length==0){
            return 0;
        }
        return 1 + arrLength(Arrays.copyOfRange(ints, 1, ints.length));
    }
}
