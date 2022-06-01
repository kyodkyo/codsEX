import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex10 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d"};
        List<String> output = arrToLi(arr);
        System.out.println(output);
    }

    public static List<String> arrToLi(String[] arr) {
        if(arr.length==0){
            return null;
        }

        return new ArrayList<String>(Arrays.asList(arr));
    }
}
