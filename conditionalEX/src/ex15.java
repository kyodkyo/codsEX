public class ex15 {
    public static void main(String[] args) {
        System.out.println(orCalculation(true, false));
        System.out.println(orCalculation(false, false));

    }

    public static boolean orCalculation(boolean exp1, boolean exp2) {
        if (exp1 && exp2) {
            return true;
        } else if (exp1 && !exp2) {
            return true;
        } else if (!exp1 && exp2) {
            return true;
        } else if (!exp1 && exp2) {
            return false;
        }
        return false;
    }
}
