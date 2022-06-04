import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ex06 {
    public static void main(String[] args) {
        ArrayList<Integer[]> output1 = makeRecipe(new int[]{1, 10, 1100, 1111}, 2);
        System.out.println(output1);

        ArrayList<Integer[]> output2 = makeRecipe(new int[]{10000, 10, 1}, 3);
        System.out.println(output2);

        ArrayList<Integer[]> output3 = makeRecipe(new int[]{11, 1, 10, 1111111111, 10000}, 4);
        System.out.println(output3);

    }

    public static ArrayList<Integer[]> makeRecipe(int[] arr, int num) {
        ArrayList<Integer> availArr = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            String str = String.valueOf(arr[i]);
            int[] element = str.chars().filter(c->c=='0').toArray();
            if(element.length<=2){
                availArr.add(arr[i]);
            }
        }
        Collections.sort(availArr);

        if(availArr.size()==0 || availArr.size()<num) return null;

        ArrayList<Integer[]> result = new ArrayList<>();
        boolean[] checkUse = new boolean[availArr.size()];

        return permutation(num, 0, new Integer[]{}, availArr, checkUse, result);
    }

    public static ArrayList<Integer[]> permutation(int num, int count, Integer[] source, ArrayList<Integer> elements, boolean[] checkUse, ArrayList<Integer[]> result){
        if(num==count){
            result.add(source);
            return result;
        }

        for(int i=0; i<elements.size(); i++){
            if(!checkUse[i]){
                checkUse[i] = true;
                Integer[] array = Arrays.copyOf(source, source.length+1);
                array[array.length-1] = elements.get(i);

                result = permutation(num, count+1, array, elements, checkUse, result);
                checkUse[i] = false;
            }
        }
        return result;
    }

}
