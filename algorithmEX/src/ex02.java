public class ex02 {
    public static void main(String[] args) {
        int output1 = coinCount(4000);
        System.out.println(output1); // --> 8

        int output2 = coinCount(4972);
        System.out.println(output2); // --> 18
    }

    public static int coinCount(int money) {
        int count = money/500;
        money %= 500;

        count += money/100;
        money %= 100;

        count += money/50;
        money %= 50;

        count += money/10;
        money %= 10;

        count += money/5;
        money %= 5;

        count += money;

        return count;
    }

    public static int coinCount2(int money){
        int count = 0;

        int[] wallet = new int[]{500, 100, 50, 10, 5, 1};

        for(int i=0; i<wallet.length; i++){
            if(money>0){
                int sum = money/wallet[i];
                count += sum;
                money -= (wallet[i]*sum);
            }
        }

        return count;
    }
}
