import java.util.ArrayList;
import java.util.Stack;

public class ex01 {
    public static void main(String[] args) {
        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        ArrayList<Stack> output = browserStack(actions, start);

        System.out.println(output); // [["A"], ["B"], ["A", "D"]]

        String[] actions2 = new String[]{"B", "-1", "B", "A", "C", "-1", "-1", "D", "-1", "1", "E", "-1", "-1", "1"};
        String start2 = "A";
        ArrayList<Stack> output2 = browserStack(actions2, start2);

        System.out.println(output2); // [["A", "B"], ["D"], ["E"]]
    }

    public static ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        if (start.charAt(0) < 'A' || start.charAt(0) > 'Z') {
            current.push("false");
            result.add(current);
            return result;
        }
        current.add(start);

        for (int i = 0; i < actions.length; i++) {
            if (actions[i].equals("-1")) {
                if(!prevStack.empty()) {
                    nextStack.push(current.pop());
                    current.push(prevStack.pop());
                }
            }
            else if (actions[i].equals("1")) {
                if(!nextStack.empty()){
                    prevStack.push(current.pop());
                    current.push(nextStack.pop());
                }
            }
            else {
                prevStack.push(current.pop());
                current.push(actions[i]);
                nextStack.clear();
            }
        }
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);
        return result;
    }
}
