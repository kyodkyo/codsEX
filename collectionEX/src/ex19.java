import java.util.HashMap;

public class ex19 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>() {{
            put("firstName", "길동");
            put("lastName", "홍");
        }};

        System.out.println(addName(hashMap));

    }

    public static HashMap<String, String> addName(HashMap<String, String> hashMap) {
        String str1 = hashMap.get("firstName");
        String str2 = hashMap.get("lastName");

        hashMap.put("fullName", str1 + str2);
        return hashMap;
    }
}
