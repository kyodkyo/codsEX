import java.util.HashMap;

public class ex14 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        System.out.println(addHashMap(hashMap, "d", 4));
    }

    public static HashMap<String, Integer> addHashMap(HashMap<String, Integer> hashMap, String key, int value){
        hashMap.put(key, value);
        return hashMap;
    }
}
