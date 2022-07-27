import java.util.PriorityQueue;

public class daily39_X {
    public static void main(String[] args) {
        int[] output = heapSort(new int[]{5, 4, 3, 2, 1});
        System.out.println(output); // --> [1, 2, 3, 4, 5]

        output = heapSort(new int[]{3, 1, 21});
        System.out.println(output); // --> [1, 3, 21]

        output = heapSort(new int[]{4, 10, 3, 5, 1});
        System.out.println(output); // --> [1, 3, 4, 5, 10]
    }

    public static int[] heapSort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for(int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
        }

        return arr;
    }
}
