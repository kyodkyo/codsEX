import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class daily27 {
    public static void main(String[] args) {
        Solution.Tree root = new Solution.Tree("1");
        Solution.Tree rootChild1 = root.addChildNode(new Solution.Tree("2"));
        Solution.Tree rootChild2 = root.addChildNode(new Solution.Tree("3"));
        Solution.Tree leaf1 = rootChild1.addChildNode(new Solution.Tree("4"));
        Solution.Tree leaf2 = rootChild1.addChildNode(new Solution.Tree("5"));
        ArrayList<String> output = Solution.bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5"]

        leaf1.addChildNode(new Solution.Tree("6"));
        rootChild2.addChildNode(new Solution.Tree("7"));
        output = Solution.bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5", "7", "6"]
    }

    public static class Solution {
        public static ArrayList<String> bfs(Tree node) {
            Queue<Tree> queue = new LinkedList<>();
            ArrayList<String> list = new ArrayList<>();
            queue.add(node);

            while (queue.size() > 0) {
                Tree fNode = queue.poll();
                list.add(fNode.getValue());

                if (fNode.getChildrenNode() != null) {
                    queue.addAll(fNode.getChildrenNode());
                }
            }
            return list;
        }

        //아래 클래스의 내용은 수정하지 말아야 합니다.
        public static class Tree {
            private String value;
            private ArrayList<Tree> children;

            public Tree(String data) {
                this.value = data;
                this.children = null;
            }

            public Tree addChildNode(Tree node) {
                if (children == null) children = new ArrayList<>();
                children.add(node);
                return children.get(children.size() - 1);
            }

            public String getValue() {      //현재 노드의 데이터를 반환
                return value;
            }

            public ArrayList<Tree> getChildrenNode() {
                return children;
            }
        }
    }

}
