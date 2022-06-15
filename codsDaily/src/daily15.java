public class daily15 {
    public static void main(String[] args) {
        Integer output = modulo(25, 4);
        System.out.println(output); // --> 1

        output = modulo(25, 0);
        System.out.println(output); // --> null
    }

    public static Integer modulo(int num1, int num2) {
        if(num2==0){
            return null;
        }

        while(num1>=num2){
            num1 -= num2;
        }

        return num1;
    }
}
