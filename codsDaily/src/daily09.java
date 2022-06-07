public class daily09 {
    public static void main(String[] args) {
        boolean output = ABCheck("lane Borrowed");
        System.out.println(output); //true
    }
    public static boolean ABCheck(String str){
        str = str.toLowerCase();

        for(int i=0; i<str.length()-5; i++){
            if(str.charAt(i)=='a' && str.charAt(i+4)=='b'){
                return true;
            }
            else if(str.charAt(i)=='b' && str.charAt(i+4)=='a'){
                return true;
            }
        }

        return false;
    }
}
