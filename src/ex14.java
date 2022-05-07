public class ex14 {
    public static void main(String[] args) {
        System.out.println(isPythagorean(3, 4, 5));
        System.out.println(isPythagorean(13, 11, 5));
    }

    public static boolean isPythagorean(int num1, int num2, int num3) {
        int side1 = (int) Math.pow(num1, 2);
        int side2 = (int) Math.pow(num2, 2);
        int side3 = (int) Math.pow(num3, 2);

        if (side1 + side2 == side3) {
            return true;
        } else if (side1 + side3 == side2) {
            return true;
        } else if (side2 + side3 == side1) {
            return true;
        }

        return false;
    }
}
