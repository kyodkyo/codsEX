import java.util.HashMap;

public class ex13 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        System.out.println(getV(hashMap, "b"));
    }

    public static Integer getV(HashMap<String, Integer> hashMap, String key) {
        return hashMap.get(key);
    }
}
