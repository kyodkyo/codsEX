public class daily19 {
    public static void main(String[] args) {
        String output = decryptString("khoor", 3);
        System.out.println(output); // --> hello

        output = decryptString("zruog", 3);
        System.out.println(output); // --> world
    }

    public static String decryptString(String str, int secret) {
        if(str.length()==0){
            return str;
        }

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ') {
                result += str.charAt(i);
                continue;
            } else {
                int index = alphabet.indexOf(str.charAt(i));
                int num = (index-secret+alphabet.length()) % alphabet.length();
                result += alphabet.charAt(num);
            }
        }
        return result;
    }
}
