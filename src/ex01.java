public class ex01 {
    public static void main(String[] args) {
        int output = sumTo(10);
        System.out.println(output);
    }

    public static int sumTo(int num) {
        if(num==0){
            return 0;
        }
        return num + sumTo(num-1);
    }
}
