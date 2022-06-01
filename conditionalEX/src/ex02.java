public class ex02 {
    public static void main(String[] args) {
        System.out.println(isGreaterThan30(50));
    }

    static String isGreaterThan30(int temp){
        String st;
        if(temp>=30){
            st = "에어컨을 켜야겠다.";
            return st;
        } else {
            st = "여름이 매우 덥네요";
            return st;
        }


    }
}
