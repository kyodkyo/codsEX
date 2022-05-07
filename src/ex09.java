public class ex09 {
    public static void main(String[] args) {
        System.out.println(daysInMonth(2));
    }
    static int daysInMonth(int num){
        int result = 0;

        if(num<=6){
            if(num==2) {
                result=28;
            }
            else if (num%2==1) {
                result = 31;
            }
            else if (num%2==0) {
                result = 30;
            }
        }
        else if (num==7 || num==8) {
            result = 31;
        }
        else if (num>=9) {
            if(num%2==0){
                result = 31;
            } else if (num%2==1) {
                result = 30;
            }
        }
        return result;
    }
}
/*
1월은 31일 2월은 28일
3월은 31일 4월은 30일
5월은 31일 6월은 30일
7월은 31일 8월은 31일
9월은 30일 10월은 31일
11월은 30일 12월은 31일
 */
