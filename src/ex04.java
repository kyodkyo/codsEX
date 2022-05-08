public class ex04 {
    public static void main(String[] args) {
        System.out.println(computeSum(new int[]{1, 2, 3}));
    }

    public static int computeSum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}
