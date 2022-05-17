import java.util.ArrayList;

public class ex08 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");

        String output = removeEle(arr, 1);
        System.out.println(output);
    }

    public static String removeEle(ArrayList<String> arrayList, int index){
        if(index<0 || index>=arrayList.size()){
            return null;
        }

        return arrayList.remove(index);
    }
}
