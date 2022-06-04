import java.util.Arrays;

public class ex12 {
    public static void main(String[] args) {
        int[] temperature = {25, 29, 30, 31, 26, 30, 33};
        boolean output = isHot(temperature);
        System.out.println(output);
    }

    private static boolean isHot(int[] temperature) {
        if(temperature.length!=7){
            return false;
        }

        long day =  Arrays.stream(temperature).filter(x->x>=30).count();
        if(day>=3){
            return true;
        } else{
            return false;
        }
    }
}
