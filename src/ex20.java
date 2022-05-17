import java.util.HashMap;

public class ex20 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){{
            put("가", 10);
            put("나", 11);
            put("다", 12);
        }};
    }

    public static boolean checkE(HashMap<String, String> hashMap, String key){
        if(hashMap.containsKey(key)){
            return true;
        } else{
            return false;
        }
    }
}
