public class daily41_X {
    public static void main(String[] args) {
        int output = binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6}, 2);
        System.out.println(output); // --> 2

        output = binarySearch(new int[]{4, 5, 6, 9}, 100);
        System.out.println(output); // --> -1
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (right + left) / 2;
            if (arr[middle] == target) return middle;
            if (target < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
