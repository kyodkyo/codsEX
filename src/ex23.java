import java.util.HashMap;

public class ex23 {
    public static void main(String[] args) {
        String[] arr = {"a", "c", "d", "e"};
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){{
            put("a", 1);
            put("b", 22);
            put("c", 333);
            put("d", 4444);
        }};

        System.out.println(extract(arr, hashMap));
    }

    public static HashMap<String, Integer> extract(String[] arr, HashMap<String, Integer> hashMap) {
        HashMap<String, Integer> result = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                result.put(arr[i], hashMap.get(arr[i]));
            }
        }

        return result;
    }
}
