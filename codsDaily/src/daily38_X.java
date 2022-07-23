public class daily38_X {
    public static void main(String[] args) {
        int[] output = mergeSort(new int[]{3, 1, 21});
        System.out.println(output); // --> [1, 3, 21]
    }

    public static int[] mergeSort(int[] arr) {
        sort(arr);
        return arr;
    }

    public static int[] sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void sort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);

        int leftIdx = left;
        int rightIdx = mid + 1;
        int index = left;

        while(leftIdx <= mid && rightIdx <= right) {
            if(temp[leftIdx] <= temp[rightIdx]) {
                arr[index++] = temp[leftIdx++];
            } else {
                arr[index++] = temp[rightIdx++];
            }
        }

        for(int i=0; i<=mid-leftIdx; i++) {
            arr[index+i] = temp[leftIdx+i];
        }
    }
}
