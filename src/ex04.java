public class ex04 {
    public static void main(String[] args) {
        int[][] output1 = createMatrix(new int[][]{
                {0, 3, 0},
                {0, 2, 0},
                {1, 3, 0},
                {2, 1, 0}
        });
        System.out.println(output1);

        int[][] output2 = createMatrix(new int[][]{
                {0, 2, 0},
                {2, 4, 1},
                {1, 3, 1},
                {2, 1, 0}
        });
        System.out.println(output2);

    }

    public static int[][] createMatrix(int[][] edges){
        int count = 0;
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                if (count < edges[i][j]) {
                    count = edges[i][j];
                }
            }
        }

        int[][] result = new int[count + 1][count + 1];
        for (int i = 0; i < edges.length; i++) {
            if (edges[i][2] == 0) {
                result[edges[i][0]][edges[i][1]] = 1;
            } else if (edges[i][2] == 1) {
                result[edges[i][0]][edges[i][1]] = 1;
                result[edges[i][1]][edges[i][0]] = 1;
            }
        }

        return result;
    }
}
