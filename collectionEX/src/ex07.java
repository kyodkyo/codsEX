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

        Integer result = arrayList.remove(0); //int 타입으로 변수를 선언해도 자동 형변환이 되지만, 좋은 방법은 아님!
        return result;
    }
}
