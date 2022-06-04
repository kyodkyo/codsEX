public class ex02 {
    public static void main(String[] args) {
        boolean output = isOdd(17);
        System.out.println(output);

        output = isOdd(-8);
        System.out.println(output);
    }

    public static boolean isOdd(int num) {

        if (num == 0) {
            return true;
        } else if (num == 1) {
            return false;
        }

        if (num < 0) {
            return isOdd(-num);
        }
        return isOdd(num - 2);
    }
}
