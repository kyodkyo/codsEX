import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
//        int output = thief(50, new int[]{10, 20, 50});
//        System.out.println(output); // 4
//
//        output = thief(100, new int[]{10, 20, 50});
//        System.out.println(output); // 10
//
//        output = thief(30, new int[]{5, 6, 7});
//        System.out.println(output); // 4
    }

    public static long thief(int target, int[] type) {
        long[] bag = new long[target + 1];

        bag[0] = 1;
        for(int i = 0; i < type.length; i++) {
            for(int j = 1; j <= target; j++)
                if(type[i] <= j)
                    bag[j] += bag[j-type[i]];
        }
        return bag[target];
    }
}
