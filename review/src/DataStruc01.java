import java.util.ArrayList;
import java.util.Stack;

public class DataStruc01 {
    public static void main(String[] args) {
        String[] pages = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        ArrayList<Stack> output = pageMove(pages, start);
        System.out.println(output); // [["A"], ["B"], ["A", "D"]]

        pages = new String[]{"B", "-1", "B", "A", "C", "-1", "-1", "D", "-1", "1", "E", "-1", "-1", "1"};
        String start2 = "A";
        ArrayList<Stack> output2 = pageMove(pages, start2);
        System.out.println(output2); // [["A", "B"], ["D"], ["E"]]
    }

    public static ArrayList<Stack> pageMove(String[] pages, String start){
        Stack<String> prev = new Stack<>();
        Stack<String> current = new Stack<>();
        Stack<String> next = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        if(start.charAt(0)<'A' || start.charAt(0)>'Z'){

            result.add(current);
            return result;
        }

        current.push(start);

        for(String page : pages){
            if(page.equals("-1")){
                if(!prev.empty()){
                    next.push(current.pop());
                    current.push(prev.pop());
                }
            } else if(page.equals("1")){
                if(!next.empty()){
                    prev.push(current.pop());
                    current.push((next.pop()));
                }
            } else {
                prev.push(current.pop());
                current.push(page);
                next.clear();
            }
        }

        result.add(prev);
        result.add(current);
        result.add(next);

        return result;
    }
}
