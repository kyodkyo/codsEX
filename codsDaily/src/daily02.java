public class daily02 {
    public static void main(String[] args) {
        int output = computeWhenDouble(7);
        System.out.println(output); // --> 11

        output = computeWhenDouble(10);
        System.out.println(output); // --> 8
    }

    public static int computeWhenDouble(double interestRate) {
        double rate = (interestRate/100) + 1;
        int year = 0;
        double money = 1;

        while(money<2){
            money = money*rate;
            year++;
        }

        return year;
    }
}
