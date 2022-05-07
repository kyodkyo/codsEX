public class ex01 {
    public static void main(String[] args) {
        System.out.println(isOldEnoughToDrink(3));
    }

    static boolean isOldEnoughToDrink(int age) {
            if(age>=18) {
                return true;
            } else {
                return false;
            }
    }
}

