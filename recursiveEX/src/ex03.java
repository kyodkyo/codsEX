public class ex03 {
    public static void main(String[] args) {
        int output = factorial(10);
        System.out.println(output);
    }

    public static int factorial(int i) {
        if(i==1 || i==0){
            return 1;
        }

        return i*factorial(i-1);
    }
}
