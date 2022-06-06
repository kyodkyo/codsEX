import java.util.LinkedList;
import java.util.Queue;

public class DataStruc05 {
    public static void main(String[] args) {
        boolean result = findMatrix(new int[][]
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

        boolean result2 = findMatrix(new int[][]
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

    public static boolean findMatrix(int[][] matrix, int from, int to){
        Queue<Integer> wayList = new LinkedList<>();
        boolean[] bool = new boolean[10];

        wayList.offer(from);
        bool[from] = true;

        while(!wayList.isEmpty()){
            int go = wayList.poll();

            for(int i=0; i<matrix.length; i++){
                if(matrix[go][i]==1 && bool[i]==false){
                    wayList.offer(i);
                    bool[i] = true;
                }
            }
        }

        return bool[to];
    }
}
