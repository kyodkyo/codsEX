import java.lang.reflect.Array;
import java.util.ArrayList;

public class ex06 {
    public static void main(String[] args) {
        int result = connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {4, 5},
        });
        System.out.println(result); // 3

        int result2 = connectedVertices(new int[][]{
                {0, 1},
                {2, 3},
                {3, 4},
                {3, 5},
        });
        System.out.println(result2); // 2
    }

    static ArrayList<Integer>[] adjList;
    static boolean[] checked;
    public static int connectedVertices(int[][] edges) {

        //노드 개수 찾기
        int count = 0;
        for(int i=0; i<edges.length; i++){
            for(int j=0; j<edges[i].length; j++){
                if(count< edges[i][j]){
                    count = edges[i][j];
                }
            }
        }

        adjList = new ArrayList[count+1];
        for(int i=0; i<count+1; i++){
            adjList[i] = new ArrayList<>();
        }

        //인접리스트 생성
        for(int i=0; i<edges.length; i++){
            int from = edges[i][0];
            int to = edges[i][1];
            adjList[from].add(to);
            adjList[to].add(from);
        }

        int result = 0;  // 그룹 개수
        checked = new boolean[count+1];  //dfs 확인을 위한 bool배열
        for(int i=0; i<=count; i++){
            if(!checked[i]){     //아직 지나가지 않은 정점이면
                dfsCheck(i);
                result++;
            }
        }
        return result;
    }

    private static void dfsCheck(int num) {
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
