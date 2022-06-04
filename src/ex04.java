public class ex04 {
    public static void main(String[] args) {
        int output = fibonacci(5);
        System.out.println(output);

        output = fibonacci(9);
        System.out.println(output);
    }

    public static int fibonacci(int i) {
        if(i==0 || i==1){
            return i;
        }

        return fibonacci(i-1) + fibonacci(i-2);
    }
}
