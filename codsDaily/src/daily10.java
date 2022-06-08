public class daily10 {
    public static void main(String[] args) {
        String output = insertDash("454793");
        System.out.println(output); // --> 4547-9-3

        output = insertDash("6734611997679419173");
        System.out.println(output);
    }

    public static String insertDash(String str) {
        if(str.length()==0){
            return null;
        }

        String result = String.valueOf(str.charAt(0));

        for(int i=1; i<str.length(); i++){
            int num1 = str.charAt(i-1);
            int num2 = str.charAt(i);

            if(num1%2==1 && num2%2==1){
                result += "-";
            }
            result += str.charAt(i);
        }

        return result;
    }
}
