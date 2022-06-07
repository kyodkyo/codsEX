public class daily05 {
    public static void main(String[] args) {
        String output = firstReverse("codestates");
        System.out.println(output); // "setatsedoc"

        output = firstReverse("I love codestates");
        System.out.println(output); // "setatsedoc evol I"
    }

    public static String firstReverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }
}
