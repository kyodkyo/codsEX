import java.util.ArrayList;
import java.util.Arrays;

public class ex05 {
    public static void main(String[] args) {
        ArrayList<String[]> output = rps(1);
        System.out.println(output.size());
    }

    public static ArrayList<String[]> rps(int rounds){
        ArrayList<String[]> outcomes = new ArrayList<>();
        return permutation(rounds, new String[]{}, outcomes);
    }

    public static ArrayList<String[]> permutation(int n, String[] player, ArrayList<String[]> outcomes) {
        if(n == 0) {
            outcomes.add(player);
            return outcomes;
        }
        String[] rps = new String[]{"rock", "paper", "scissors"};
        for(int i = 0; i < rps.length; i++) {
            String now = rps[i];
            String[] arr = Arrays.copyOf(player, player.length+1);
            arr[arr.length-1] = now;

            outcomes = permutation(n - 1, arr, outcomes);
        }
        return outcomes;
    }
}

/*
public class Solution {
  static String[] rsp = new String[]{"rock","paper","scissors"};
  static ArrayList<String[]> answer = new ArrayList<>();

    public ArrayList<String[]> rockPaperScissors(int rounds) {
      ArrayList<String> ans = new ArrayList<>();
      rePermutation1(rounds, ans);
      return answer;
    }

  private static void rePermutation1(int n,ArrayList<String> rCom) {
        if(rCom.size() == n){
            String[] finalRcom = rCom.toArray(new String[rCom.size()]);
            answer.add(finalRcom);
            return;
        }

        for(String data : rsp){
            rCom.add(data);
            rePermutation1(n, rCom);
            rCom.remove(rCom.size()-1);
        }
    }
}
 */