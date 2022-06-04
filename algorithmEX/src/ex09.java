import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ex09 {
    public static void main(String[] args) {
        ArrayList<String[]> output = makeDishes(new String[]{"eggroll", "kimchi", "fishSoup"});
        System.out.println(output);
        /*
        [ [],
          [ 'eggroll' ],
          [ 'eggroll', 'fishSoup' ],
          [ 'eggroll', 'fishSoup', 'kimchi' ],
          [ 'eggroll', 'kimchi' ],
          [ 'fishSoup' ],
          [ 'fishSoup', 'kimchi' ],
          [ 'kimchi' ]
        ]
        */
    }

    public static ArrayList<String[]> makeDishes(String[] foods) {
        Stack<String> dishes = new Stack<>();
        ArrayList<String[]> result = new ArrayList<>();
        Arrays.sort(foods);

        result = combi(dishes, 0, foods, result);
        result.sort((o1, o2) -> Arrays.toString(o1).compareTo(Arrays.toString(o2)));
        return result;
    }

    public static ArrayList<String[]> combi(Stack<String> dishes, int index, String[] foods, ArrayList<String[]> result){
        if(index>=foods.length){
            result.add(dishes.toArray(new String[0]));
            return result;
        }
        else{
            dishes.push(foods[index]);
            combi(dishes, index+1, foods, result);

            dishes.pop();
            combi(dishes, index+1, foods, result);
        }
        return result;
    }

}
