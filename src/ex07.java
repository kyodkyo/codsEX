public class ex07 {
    public static void main(String[] args) {
        System.out.println(getLargestElement(new int[]{1,4,3}));
    }

    public static int getLargestElement(int[] arr){
        int max=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }

        return max;
    }
}
