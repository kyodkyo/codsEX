public class ex06 {
    public static void main(String[] args) {
        System.out.println(isEvenAndGreaterThanTen(13));
    }

    static boolean isEvenAndGreaterThanTen(int num){
        boolean result = num>10 && num%2==0;
        return  result;
    }
}
