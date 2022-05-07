public class ex07 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(7));
    }

    static String fizzBuzz(int num){
        String st;
        if(num%3==0 && num%5==0) {
            st = "FizzBuzz";
            return st;
        } else if (num%3==0 && num%5!=0) {
            st = "Fizz";
            return st;
        } else if (num%5==0 && num%3!=0) {
            st = "Buzz";
            return st;
        } else{
            st = "No FizzBuzz";
            return  st;
        }
    }
}
