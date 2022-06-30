public class daily25 {
    public static void main(String[] args) {
        long output = pow(3, 40);
        System.out.println(output); // --> 19334827
    }

    public static long pow(int base, int exponent){
        long result = 1;

        int count = 0;
        while(count<exponent){
            result *= base;
            result %= 94906249;
            count++;
        }

        return result;
    }
}
