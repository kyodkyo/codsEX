public class Recur03 {
    public static void main(String[] args) {
        int output = factorial(10);
        System.out.println(output);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }

        return n*factorial(--n);
    }
}
