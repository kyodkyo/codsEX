public class daily17 {
    public static void main(String[] args) {
        String output = computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

        String output2 = computeSquareRoot(6);
        System.out.println(output2); // --> "2.45"
    }

    private static final int PRECISION = 10;
    public static String computeSquareRoot(int num) {

        double x = PRECISION;

        for(int i=0; i<PRECISION; i++){
            x = 0.5 * (num/x + x);
        }
        String result = String.format("%.2f", x);

        return result;
    }
}
