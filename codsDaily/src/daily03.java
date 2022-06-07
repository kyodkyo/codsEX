public class daily03 {
    public static void main(String[] args) {
        boolean output1 = powerOfTwo(16);
        System.out.println(output1); // true

        boolean output2 = powerOfTwo(22);
        System.out.println(output2); // false
    }

    public static boolean powerOfTwo(long num) {
        if(num==1){
            return true;
        } else if(num%2!=0){
            return false;
        }

        long multi = 2;
        while(num>multi){
            multi *= 2;
        }

        return num==multi;
    }
}
