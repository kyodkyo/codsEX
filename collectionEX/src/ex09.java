import java.util.ArrayList;

public class ex09 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        ArrayList<Integer> newarr = removeElem(arr);

        System.out.println(arr);
        System.out.println(newarr);
    }

    public static ArrayList<Integer> removeElem(ArrayList<Integer> arrayList) {
        if(arrayList.size()==0){
            return null;
        }

        ArrayList<Integer> newArr = new ArrayList<>(arrayList);

        newArr.remove(arrayList.size()-1);
        return newArr;
    }
}
