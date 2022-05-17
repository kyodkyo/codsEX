import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ex21 {
    public static void main(String[] args) {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>(){{
            put("fruit", Arrays.asList("apple", "banana"));
            put("animal", Arrays.asList("giraffe", "hippo"));
        }};

        String output = getList(hashMap, "fruit", 1);
        System.out.println(output);
    }

    public static String getList(HashMap<String, List<String>> hashMap, String key, int index){
        if(index<0 || index>= hashMap.size()){
            return null;
        }

        if(!hashMap.containsKey(key)){
            return null;
        }

        List<String> result = hashMap.get(key);
        return result.get(index);
    }
}
