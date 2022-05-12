import java.util.Arrays;

public class ex05 {
    public static void main(String[] args) {
        String[] output = getAllWords("Radagast the Brown");
        System.out.println(Arrays.toString(output));
    }

    public static String[] getAllWords(String st) {
        String[] result;
        result = st.split(" ");

        return result;
    }
}
