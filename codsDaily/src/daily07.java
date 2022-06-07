import java.util.HashMap;

public class daily07 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };

        HashMap<String, String> output = convertListToHashMap(arr);

        System.out.println(output);
    // -->
    //        {
    //            "make" = "Ford",
    //            "model" = "Mustang",
    //            "year" = "1964"
    //        }
    }

    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        if(arr.length==0){
            return new HashMap<>();
        }

        HashMap<String, String> result = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i].length!=0 && !result.containsKey(arr[i][0])){
                result.put(arr[i][0], arr[i][1]);
            }
        }

        return result;
    }

}
