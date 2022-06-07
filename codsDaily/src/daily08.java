public class daily08 {
    public static void main(String[] args) {
        String output = convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"
    }

    public static String convertDoubleSpaceToSingle(String str) {
        String[] sArr = str.split("  ");
        String result = String.join(" ", sArr);

        return result;
    }
}
