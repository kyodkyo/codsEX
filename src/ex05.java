import java.util.LinkedList;
import java.util.Queue;

public class ex05 {
    public static void main(String[] args) {
        boolean result = getDirections(new int[][]
                        {
                                {0, 1, 0, 0},
                                {0, 0, 1, 0},
                                {0, 0, 0, 1},
                                {0, 1, 0, 0}
                        },
                0,
                2
        );
        System.out.println(result); // true

        boolean result2 = getDirections(new int[][]
                        {
                                {0, 1, 0, 0, 0},
                                {0, 0, 0, 1, 0},
                                {0, 1, 0, 0, 0},
                                {0, 1, 1, 0, 0},
                                {1, 1, 1, 1, 0}
                        },
                1,
                4
        );
        System.out.println(result2); // false
    }

    public static boolean getDirections(int[][] matrix, int from, int to) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] checked = new boolean[100];

        queue.offer(from);
        checked[from] = true;

        while(!queue.isEmpty()){
            int temp = queue.poll();

            for(int i=0; i< matrix.length; i++){
                if(matrix[temp][i]==1 && checked[i]==false){
                    queue.offer(i);
                    checked[i] = true;
                }
            }
        }
        return checked[to];
    }
}
