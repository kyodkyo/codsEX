import java.util.ArrayList;
import java.util.Iterator;

public class ex12 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(sumElements(arrayList));
    }

    public static int sumElements(ArrayList<Integer> arrayList){
        Integer sum = 0;

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Integer element = iterator.next();
            sum += element;
        }

        return sum;
    }
}
