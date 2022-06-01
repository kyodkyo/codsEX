import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex06 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(List.of("가", "나", "다", "마"));

        Iterator iterator = modifyEle(arr, 3, "라").iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }

    public static ArrayList<String> modifyEle(ArrayList<String> arrayList, int index, String str){
        if(index<0 || index>=arrayList.size()){
            return null;
        }

        arrayList.set(index, str);
        return arrayList;
    }
}
