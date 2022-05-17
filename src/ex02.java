import java.util.ArrayList;
import java.util.List;

public class ex02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5));
        System.out.println(getElement(arrayList, 3));
    }

    public static Integer getElement(ArrayList<Integer> arrayList, int index){
        if(arrayList.size()==0){
            return null;
        }
        if(index<0 || index>=arrayList.size()){
            return null;
        }
        return arrayList.get(index);
    }
}
