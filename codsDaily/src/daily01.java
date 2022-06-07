import java.util.HashMap;

public class daily01 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
        HashMap<String, String> output = transformFirstAndLast(arr);
        System.out.println(output); // --> { Queen : 'Beyonce' }

        arr = new String[]{"Kevin", "Bacon", "Love", "Hart", "Costner", "Spacey"};
        HashMap<String, String> output2 = transformFirstAndLast(arr);
        System.out.println(output2); // --> { Kevin : 'Spacey' }
    }

    public static HashMap<String, String> transformFirstAndLast(String[] arr) {
        if(arr.length==0){
            return null;
        }

        HashMap<String, String> result = new HashMap<>();
        result.put(arr[0], arr[arr.length-1]);
        return result;
    }
}
