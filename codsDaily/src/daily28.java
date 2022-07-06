import java.util.Stack;

public class daily28 {
    public static void main(String[] args) {
        boolean output = balancedBrackets("[](){}");
        System.out.println(output); // --> true

        boolean output2 = balancedBrackets("[({})]");
        System.out.println(output2); // --> true

        boolean output3 = balancedBrackets("[(]{)}");
        System.out.println(output3); // --> false
    }

    public static boolean balancedBrackets(String str) {
        if(str.length()==0){
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.empty() || stack.peek() != '('){
                    return false;
                } else {
                    stack.pop();
                }
            }
            else if(c==']'){
                if(stack.empty() || stack.peek() != '['){
                    return false;
                } else {
                    stack.pop();
                }
            }
            else if(c=='}'){
                if(stack.empty() || stack.peek() != '{'){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.empty()) return true;
        else return false;
    }
}
