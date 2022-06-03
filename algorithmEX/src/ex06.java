import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex06 {
    public static void main(String[] args) {
//        ArrayList<Integer[]> output1 = newChickenRecipe(new int[]{1, 10, 1100, 1111}, 2);
//        System.out.println(output1);

        ArrayList<Integer[]> output2 = newChickenRecipe(new int[]{10000, 10, 1}, 3);
        System.out.println(output2);

        ArrayList<Integer[]> output3 = newChickenRecipe(new int[]{11, 1, 10, 1111111111, 10000}, 4);
        System.out.println(output3);

    }

    public static ArrayList<Integer[]> newChickenRecipe(int[] arr, int num) {
        /*
        배열을 돌면서 num만큼의 조합을 모두 array에 저장, 순서가 다르면 다른 조합이다.
         */

        //입력받은 arr를 정렬 후, arrayList로 변경
        Arrays.sort(arr);
        List<String> items = new ArrayList<>();

        for (int item : arr) {
            items.add(String.valueOf(item));
        }

        //0이 3개 이상인 item은 제거
        for (int i = 0; i < items.size(); i++) {
            int zeroCount = 0;
            for(int j=0; j<items.get(i).length(); j++) {
                if(items.get(i).charAt(j) == '0') {
                    zeroCount++;
                    if(zeroCount>=3) items.remove(i);
                }
            }
        }

        // 재료가 없거나, 필요한 재료의 수보다 적으면 빈배열 리턴
        if(items.size()==0 || items.size()<num) return new ArrayList<>();

        ArrayList<Integer[]> listP = new ArrayList<>();







        return null;
    }
}
