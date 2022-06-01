import java.util.HashMap;

public class ex17 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 11);
        hashMap.put(2, 22);
        hashMap.put(3, 33);
        hashMap.put(4, 44);

        System.out.println(getS(hashMap));
    }

    public static int getS(HashMap<Integer, Integer> hashMap){
        return hashMap.size();
    }
}
