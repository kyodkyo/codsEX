public class ex02 {
    public static void main(String[] args) {
        System.out.println(getLastElement(new int[]{1, 2, 3, 4, 5}));
    }

    public static int getLastElement(int[] arr){
        if(arr.length==0){
            return -1;
        }

        return arr[arr.length-1];
    }
}
