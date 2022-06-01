import java.util.ArrayList;
import java.util.List;

public class ex03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(List.of("홍", "길", "동"));
        System.out.println(getElementt(arrayList));
    }

    public static String getElementt(ArrayList<String> arrayList){
        int size = arrayList.size();

        if(size==0){
            return null;
        }

        return arrayList.get(size-1);
    }
}
