import java.util.HashMap;

public class ex18 {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('a', 2);
        hashMap.put('b', 3);
        hashMap.put('c', 8);

        System.out.println(addV(hashMap));
    }

    public static int addV(HashMap<Character, Integer> hashMap){
        int sum = 0;

        for(Character values : hashMap.keySet()){
            int value = hashMap.get(values);
            if(value%2==0){
                sum += value;
            }
        }

        return sum;
    }
}
