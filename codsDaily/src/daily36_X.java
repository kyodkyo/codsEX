public class daily36_X {
    public static void main(String[] args) {
        int[] output = insertionSort(new int[]{3, 1, 21});
        System.out.println(output); // --> [1, 3, 21]
    }

    public static int[] insertionSort(int[] arr) {
        for (int index = 1; index < arr.length; index++) {
            int target = index;
            while (target > 0 && arr[target - 1] > arr[target]) {
                int temp = arr[target - 1];
                arr[target - 1] = arr[target];
                arr[target] = temp;
                target--;
            }
        }
        return arr;
    }
}
