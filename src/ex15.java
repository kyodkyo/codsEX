import java.util.HashMap;

public class ex15 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        removeE(hashMap, "b");
        System.out.println(hashMap);
    }

    public static void removeE(HashMap<String, Integer> hashMap, String key) {
        hashMap.remove(key);
    }
}
