import java.util.ArrayList;

public class ex07 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int output = removeEle(arr);
        System.out.println(output);
    }

    public static Integer removeEle(ArrayList<Integer> arrayList){
        if(arrayList.size()==0){
            return null;
        }

        return arrayList.remove(0);
    }
}
