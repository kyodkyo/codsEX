public class daily34_X {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 1;

        System.out.println(matrix[0][0]); // --> 1
        System.out.println(matrix[3][2]); // --> 15

        int[][] rotatedMatrix = rotateMatrix(matrix, K);
        System.out.println(rotatedMatrix[0][0]); // --> 13
        System.out.println(rotatedMatrix[3][2]); // --> 8
    }


    public static int[][] rotateMatrix(int[][] matrix, int K) {
        if(matrix == null || matrix.length == 0) return matrix;

        int N = matrix.length;
        int M = matrix[0].length;

        int rotateNum = K % 4;
        if(rotateNum == 0) return matrix;
        int[][] rotated = rotateNum % 2 == 1 ? new int[M][N] : new int[N][M];

        for(int row = 0; row < rotated.length; row++) {
            for(int col = 0; col < rotated[row].length; col++) {
                if(rotateNum == 1) {
                    rotated[row][col] = matrix[N - col - 1][row];
                } else if(rotateNum == 2) {
                    rotated[row][col] = matrix[N - row - 1][M - col - 1];
                } else {
                    rotated[row][col] = matrix[col][M - row - 1];
                }
            }
        }
        return rotated;
    }
}
