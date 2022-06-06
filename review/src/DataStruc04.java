import java.util.Arrays;

public class DataStruc04 {
    public static void main(String[] args) {
        int[][] output1 = adjacencyMatrix(new int[][]{
                {0, 3, 0},
                {0, 2, 0},
                {1, 3, 0},
                {2, 1, 0},
        });

        System.out.println(output1);
        /*
         * [
         *  [0, 0, 1, 1],
         *  [0, 0, 0, 1],
         *  [0, 1, 0, 0],
         *  [0, 0, 0, 0]
         * ]
         */

        int[][] output2 = adjacencyMatrix(new int[][]{
                {0, 2, 0},
                {2, 4, 1},
                {1, 3, 1},
                {2, 1, 0},
        });

        System.out.println(output2);
        /*
         * [
         *  [0, 0, 1, 0, 0],
         *  [0, 0, 0, 1, 0],
         *  [0, 1, 0, 0, 1],
         *  [0, 1, 0, 0, 0],
         *  [0, 0, 1, 0, 0],
         * ]
         */
    }

    public static int[][] adjacencyMatrix(int[][] arr){
        int size = 0;
        for(int[] row : arr){
            for(int element : row){
                if(size<element) size = element;
            }
        }

        int[][] matrix = new int[size+1][size+1];
        for(int i=0; i<arr.length; i++){
            matrix[arr[i][0]][arr[i][1]] = 1;
            if(arr[i][2]==1){
                matrix[arr[i][1]][arr[i][0]] = 1;
            }
        }

        return matrix;
    }
}

/*
-------(위의 두번째 for문을 리팩토링 하기 전 코드)-------
    if(arr[i][2]==0){
        matrix[arr[i][0]][arr[i][1]] = 1;
    }
    else if(arr[i][2]==1){
        matrix[arr[i][0]][arr[i][1]] = 1;
        matrix[arr[i][1]][arr[i][0]] = 1;
    }
 */
