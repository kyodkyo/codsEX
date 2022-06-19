import java.util.HashMap;

public class daily16 {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
    }

    public static boolean isIsogram(String str) {
        if(str.length()==0){
            return true;
        }

        str = str.toLowerCase();
        HashMap<Character, Boolean> checkStr = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            if(checkStr.containsKey(str.charAt(i))){
                return false;
            }
            checkStr.put(str.charAt(i), true);
        }
        return true;
    }
}
