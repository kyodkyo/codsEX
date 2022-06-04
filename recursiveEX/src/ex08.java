import java.util.Arrays;

public class ex08 {
    public static void main(String[] args) {
        int[] output = drop(2, new int[]{1, -2, 1, 3});
        System.out.println(output);

        output = drop(5, new int[]{1, -2, 1, 3});
        System.out.println(output);
    }

    public static int[] drop(int i, int[] ints) {
        if(i==0){
            return ints;
        }

        if(i> ints.length){
            return new int[]{};
        }
        else{
            int[] result = Arrays.copyOfRange(ints, 1, ints.length);
            return drop(i-1, result);
        }
    }
}
