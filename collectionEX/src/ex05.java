import java.util.ArrayList;
import java.util.Iterator;

public class ex05 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);

        Iterator iterator = addEle(arrayList, 1, 7).iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }

    public static ArrayList<Integer> addEle(ArrayList<Integer> arrayList, int index, int element){
        if(index<0 || index>=arrayList.size()){
            return null;
        }
        arrayList.add(index, element);
        return  arrayList;
    }
}
