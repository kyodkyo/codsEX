import java.util.StringTokenizer;

public class daily04 {
    public static void main(String[] args) {
        String output = firstCharacter("hello world");
        System.out.println(output); // --> "hw"

        output = firstCharacter("The community at Code States might be the biggest asset");
        System.out.println(output); // --> "TcaCSmbtba"
    }

    public static String firstCharacter(String str) {
        String result = "";
        StringTokenizer st = new StringTokenizer(str, " ");

        while(st.hasMoreTokens()){
            result += st.nextToken().charAt(0);
        }

        return result;
    }
}
