public class daily35_X {
    public static void main(String[] args) {
        int[] output = quickSort(new int[]{3, 1, 21});
        System.out.println(output); // --> [1, 3, 21]
    }

    public static int[] quickSort(int[] arr) {
        if (arr.length == 0) return arr;

        int left = 0;
        int right = arr.length - 1;
        return sort(arr, left, right);
    }
    
    public static int[] sort(int[] arr, int left, int right) {
        int part = partition(arr, left, right);
        if (left < part - 1) arr = sort(arr, left, part - 1);
        if (right > part) arr = sort(arr, part, right);

        return arr;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];

        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
