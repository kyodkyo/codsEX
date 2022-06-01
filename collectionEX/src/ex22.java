import java.util.HashMap;

public class ex22 {
    public static void main(String[] args) {
        HashMap<String, String> hlist = new HashMap<>(){{
            put("대한", "1234");
            put("민국", "qwer");
        }};

        System.out.println(haveH(hlist, "민국", "qwer"));
    }

    public static boolean haveH(HashMap<String, String> hashMap, String username, String password){
        if(!hashMap.containsKey(username)){
            return false;
        } else{
            return hashMap.get(username).equals(password);
        }
    }
}
