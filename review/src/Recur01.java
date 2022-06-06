public class Recur01 {
    public static void main(String[] args) {
        int output = sumN(10);
        System.out.println(output);
    }

    public static int sumN(int n){
        if(n==1){
            return 1;
        }

        return n + sumN(--n);
    }
}
