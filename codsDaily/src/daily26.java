import java.util.ArrayList;

public class daily26 {
    public static void main(String[] args) {
        Solution.tree root = new Solution.tree("1");
        Solution.tree rootChild1 = root.addChildNode(new Solution.tree("2"));
        Solution.tree rootChild2 = root.addChildNode(new Solution.tree("3"));
        Solution.tree leaf1 = rootChild1.addChildNode(new Solution.tree("4"));
        Solution.tree leaf2 = rootChild1.addChildNode(new Solution.tree("5"));
        ArrayList<String> output = Solution.dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "5", "3"]

        leaf1.addChildNode(new Solution.tree("6"));
        rootChild2.addChildNode(new Solution.tree("7"));
        output = Solution.dfs(root);
        System.out.println(output); // --> ["1", "2", "4", "6", "5", "3", "7"]
    }

    public static class Solution {
        public static ArrayList<String> dfs(tree node) {
            ArrayList<String> list = new ArrayList<>();
            list.add(node.getValue());

            if(node.getChildrenNode()!=null){
                for(int i=0; i<node.getChildrenNode().size(); i++){
                    ArrayList<String> childrens = dfs(node.getChildrenNode().get(i));
                    list.addAll(childrens);
                }
            }

            return list;
        }


        public static class tree {
            private String value;
            private ArrayList<tree> children;

            public tree(String data) {
                this.value = data;
                this.children = null;
            }

            public tree addChildNode(tree node) {
                if(children == null) children = new ArrayList<>();
                children.add(node);
                return children.get(children.size() - 1);
            }

            public String getValue() {
                return value;
            }

            public ArrayList<tree> getChildrenNode() {
                return children;
            }
        }
    }

}
