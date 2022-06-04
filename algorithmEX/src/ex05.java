import java.util.ArrayList;

public class ex05 {
    public static void main(String[] args) {
        ArrayList<String[]> output = rps(1);
        System.out.println(output);
    }

    static String[] rps = new String[]{"rock", "paper", "scissors"};
    public static ArrayList<String[]> rps(int rounds){
        ArrayList<String[]> result = new ArrayList<>();
        ArrayList<String> recursiveArr = new ArrayList<>();
        permutation(rounds, recursiveArr, result);
        return result;
    }

    public static void permutation(int n, ArrayList<String> recursiveArr, ArrayList<String[]> result) {
        if(recursiveArr.size()==n){
            String[] lastRe = recursiveArr.toArray(new String[recursiveArr.size()]);
            result.add(lastRe);
            return;
        }

        for(String data:rps){
            recursiveArr.add(data);
            permutation(n, recursiveArr, result);
            recursiveArr.remove(recursiveArr.size()-1);
        }
    }
}