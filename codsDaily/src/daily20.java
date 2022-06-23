public class daily20 {
    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }

    private static String compressString(String str) {
        if(str.length()==0){
            return str;
        }

        char before = str.charAt(0);
        String result = "";
        int count = 1;

        str += ' ';
        for (int i=1; i<str.length(); i++) {
            if(before==str.charAt(i)){
                count ++;
            } else {
                if(count>=3){
                    result = result + count + before;
                } else {
                    for (int j=0; j<count; j++){
                        result = result + before;
                    }
                }
                before = str.charAt(i);
                count = 1;
            }
        }
        return result;
    }
}
