import java.util.ArrayList;

public class ex11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        clearArr(arrayList);
    }

    public static ArrayList<Integer> clearArr(ArrayList<Integer> arrayList){
        arrayList.clear();
        return arrayList;
    }
}
