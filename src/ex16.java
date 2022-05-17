import java.util.HashMap;

public class ex16 {
    public static void main(String[] args) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        hashMap.put(1, true);
        hashMap.put(2, false);
        hashMap.put(3, true);

        clearH(hashMap);
        System.out.println(hashMap);
    }

    public static void clearH(HashMap<Integer, Boolean> hashMap){
        hashMap.clear();
    }
}
