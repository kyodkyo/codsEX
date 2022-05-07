public class ex11 {
    public static void main(String[] args) {
        System.out.println(isEitherEventAndLessThan9(11, 8));
    }

    public static boolean isEitherEventAndLessThan9(int num1, int num2) {
        boolean eitherEven = num1 % 2 == 0 || num2 % 2 == 0;
        boolean lessThan9 = num1 < 9 && num2 < 9;

        if (eitherEven && lessThan9) {
            return true;
        } else {
            return false;
        }
    }
}
