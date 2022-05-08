public class ex01 {
    public static void main(String[] args) {
        System.out.println(getFirstElement(new int[]{1,2,3,4,5}));
    }

    public static int getFirstElement(int[] arr){
        if(arr.length==0){
            return -1;
        }
        return arr[0];
    }
}
