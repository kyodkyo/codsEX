import java.util.Arrays;

public class ex06 {
    public static void main(String[] args) {
        int output = arrProduct(new int[]{1, -2, 1, 3});
        System.out.println(output);
    }

    public static int arrProduct(int[] ints) {
        if(ints.length==0){
            return 1;
        }

        int head = ints[0];
        int[] tail = Arrays.copyOfRange(ints, 1, ints.length);

        return head*arrProduct(tail);
    }
}
