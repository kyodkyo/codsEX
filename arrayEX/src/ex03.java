import java.lang.module.FindException;

public class ex03 {
    public static void main(String[] args) {
        System.out.println(getNthElement(new int[]{1,3,5}, 1));
    }

    public static int getNthElement(int[] arr, int index){
        if(arr.length==0){
            return -1;
        }

        if(index>arr.length-1){
            return -2;
        }

        return arr[index];
    }
}
