public class ex09 {
    public static void main(String[] args) {
        System.out.println(getEvenNums(new int[]{1, 2, 3, 4}));
    }

    public static int[] getEvenNums(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for(int i=0; i< arr.length; i++){
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
}
