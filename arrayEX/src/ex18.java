import java.util.Arrays;

public class ex18 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(10)));
    }

    public static int[] fibonacci(int num){
        int[] rArr = new int[num+1];

        for(int i=0; i<num+1; i++){
            if(i==0 || i==1){
                rArr[i] = i;
            } else {
                rArr[i] = rArr[i - 1] + rArr[i - 2];
            }
        }
        return rArr;



    }
}
