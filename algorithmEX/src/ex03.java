public class ex03 {
    public static void main(String[] args) {
        int[][] board1 = new int[][]{
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };
        Integer output1 = boardGame(board1, "RRDLLD");
        System.out.println(output1); // 4


        int[][] board2 = new int[][]{
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 0}
        };
        Integer output2 = boardGame(board2, "UUUDD");
        System.out.println(output2); // null

        int[][] board3 = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}
        };
        Integer output3 = boardGame(board3, "DDRRRUDUDUD");
        System.out.println(output3); // 0
    }

    public static Integer boardGame(int[][] board, String op) {
        int x = 0, y = 0;
        int sum = 0;
        for(int i=0; i<op.length(); i++){
            switch (op.charAt(i)){
                case 'U' : 
                    x -= 1; break;
                case 'R' :
                    y += 1; break;
                case 'D' :
                    x += 1; break;
                case 'L' :
                    y -= 1; break;
                default:
                    break;
            }

            if(x>=0 && y>=0){
                sum += board[x][y];
            } else{
                return null;
            }
        }
        return sum;
    }
}
