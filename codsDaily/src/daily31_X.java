import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class daily31_X {
    public static void main(String[] args) {
        ArrayList<String> output1 = powerSet("abc");
        System.out.println(output1); // ["", "a", "ab", "abc", "ac", "b", "bc", "c"]

        ArrayList<String> output2 = powerSet("jjump");
        System.out.println(output2); // ["", "j", "jm", "jmp", "jmpu", "jmu", "jp", "jpu", "ju", "m", "mp", "mpu", "mu", "p", "pu", "u"]
    }

    public static ArrayList<String> powerSet(String str) {
        String deduplStr = deduplicated(str);
        Stack<String> stack = new Stack<>();
        ArrayList<String> result = new ArrayList<>();

        result = pickOrNot(stack, 0, deduplStr, result);

        Collections.sort(result);
        return result;
    }

    public static String deduplicated(String str) {
        String result = "";

        for (int index = 0; index < str.length(); index++) {
            if (str.indexOf(str.charAt(index)) == index) {
                result += str.charAt(index);
            }
        }

        String[] sorted = result.split("");
        Arrays.sort(sorted);
        result = String.join(",", sorted).replaceAll(",", "");
        return result;
    }

    public static ArrayList<String> pickOrNot(Stack<String> stack, int idx, String subset, ArrayList<String> result) {
        if (idx >= subset.length()) {
            result.add(stack.toString()
                    .replaceAll("\\[", "")
                    .replaceAll("]", "")
                    .replaceAll(",", "")
                    .replaceAll(" ", ""));
            return result;
        } else {
            stack.push(Character.toString(subset.charAt(idx)));
            pickOrNot(stack, idx + 1, subset, result);

            stack.pop();
            pickOrNot(stack, idx + 1, subset, result);
        }
        return result;
    }
}
