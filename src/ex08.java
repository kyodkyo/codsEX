public class ex08 {
    public static void main(String[] args) {
        System.out.println(miniCalculator(9, 3, '%'));
    }

    static int miniCalculator(int num1, int num2, char operator){
        int re = 0;
        if(operator=='+'){
            re = num1 + num2;
        } else if (operator=='-') {
            re = Math.abs(num1-num2);
        } else if (operator=='*') {
            re = num1*num2;
        } else if (operator=='/') {
            re = num1/num2;
        } else if (operator=='%') {
            re = num1%num2;
        } else {
            return re;
        }
        return re;
    }
}
