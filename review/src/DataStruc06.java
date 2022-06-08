import java.util.ArrayList;

public class DataStruc06 {
    public static void main(String[] args) {
        int result = countAdj(new int[][]{
                {0, 1},
                {2, 3},
                {3, 4},
                {3, 5},
        });
        System.out.println(result); // 2
    }

    static ArrayList<Integer>[] adjList;
    static boolean[] checked;
    public static int countAdj(int[][] edges){
        int node = 0;
        for(int[] row : edges){
            for(int i : row){
                if(node<i){
                    node = i;
                }
            }
        }

        checked = new boolean[node+1];
        adjList = new ArrayList[node+1];

        for(int i=0; i<adjList.length; i++){
            adjList[i] = new ArrayList<>();
        }

        for(int i=0; i<edges.length; i++){
            int from = edges[i][0];
            int to = edges[i][1];
            adjList[from].add(to);
            adjList[to].add(from);
        }

        int group = 0;
        for(int i=0; i<adjList.length; i++){
            if(!checked[i]){
                dfsCheck(i);
                group++;
            }
        }

        return group;
    }

    public static void dfsCheck(int num){
        if(checked[num]){
            return;
        }

        checked[num] = true;
        for(int i : adjList[num]){
            if(!checked[i]){
                dfsCheck(i);
            }
        }
    }
}
