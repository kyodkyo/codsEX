public class Recur02 {
    public static void main(String[] args) {
        boolean output = checkOdd(17);
        System.out.println(output);

        boolean output2 = checkOdd(-8);
        System.out.println(output2);
    }

    public static boolean checkOdd(int num){
        if(num<0){
            num = Math.abs(num);
        }

        if(num==0){
            return false;
        } else if(num==1){
            return true;
        }

        return checkOdd(num-2);
    }
}
