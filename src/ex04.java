import java.util.ArrayList;
import java.util.List;

public class ex04 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(List.of("a", "b"));
        System.out.println(addElement(arr, "c"));
    }

    public static ArrayList<String> addElement(ArrayList<String> arrayList, String str){
        arrayList.add(str);
        return arrayList;
    }
}
