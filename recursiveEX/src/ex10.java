import java.util.Arrays;

public class ex10 {
    public static void main(String[] args) {
        boolean output = and(new boolean[]{true, true, true});
        System.out.println(output);

        output = and(new boolean[]{true, true, false});
        System.out.println(output);
    }

    public static boolean and(boolean[] arr){
        if(arr.length==0){
            return true;
        }
        boolean check = arr[0];
        boolean reArr = and(Arrays.copyOfRange(arr, 1, arr.length));

        if(check && reArr){
            return true;
        } else{
            return false;
        }
    }
}
