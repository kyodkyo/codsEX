public class daily14 {
    public static void main(String[] args) {
        boolean output = superIncreasing(new int[]{1, 3, 6, 13, 54});
        System.out.println(output); // --> true

        output = superIncreasing(new int[]{1, 3, 5, 9});
        System.out.println(output); // --> false
    }

    public static boolean superIncreasing(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length-1; i++){
            sum += arr[i];
            if(sum<arr[i+1]) continue;
            else return false;
        }
        return true;
    }
}
