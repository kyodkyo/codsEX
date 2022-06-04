import java.util.ArrayList;

public class ex07 {
    public static void main(String[] args) {
        int output = primeNumber(new int[]{1, 2, 3, 4});
        System.out.println(output); // 1

        int output2 = primeNumber(new int[]{2, 3, 4, 8, 13});
        System.out.println(output2); // 3
    }

    public static int primeNumber(int[] cards) {
        ArrayList<Integer> combi = new ArrayList<>();
        for(int i=0; i<cards.length; i++){
            for(int j=i+1; j< cards.length; j++){
                for(int k=j+1; k<cards.length; k++){
                    int input = cards[i]+cards[j]+cards[k];
                    combi.add(input);
                }
            }
        }

        int count = 0;
        for(int i : combi){
            count += isPrime(i);
        }
        return count;
    }

    public static int isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return 0;
            }
        }
        return 1;
    }
}
