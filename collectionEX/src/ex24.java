import java.util.HashMap;

public class ex24 {
    public static void main(String[] args) {
        HashMap<Character, Integer> output = countAC("parameter");
        System.out.println(output);
    }

    private static HashMap<Character, Integer> countAC(String str) {
        if(str.length()==0){
            return null;
        }

        HashMap<Character, Integer> result = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char key = str.charAt(i);
            if(result.containsKey(key)){
                result.put(key, result.get(key) + 1);
            } else{
                result.put(key, 1);
            }
        }

        return result;
    }
}
