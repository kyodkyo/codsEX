public class Recur04 {
    public static void main(String[] args) {
        int output = fibonacci(10);
        System.out.println(output);
    }

    public static int fibonacci(int n){
        if(n<2){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
