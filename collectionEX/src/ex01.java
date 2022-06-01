import java.util.ArrayList;
import java.util.Iterator;

public class ex01 {
        public static void main(String[] args) {
            Iterator iterator = makeArrayList().iterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next() + " ");
            }
        }
        public static ArrayList<Integer> makeArrayList(){
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            return arrayList;
        }

}
