public class ex05_NP {
    public static void main(String[] args) {
        System.out.println(getAllWords("Radagast the Brown"));
    }

    public static String[] getAllWords(String st){
        String[] result;
        result = st.split(" ");

        return result;
    }
}
