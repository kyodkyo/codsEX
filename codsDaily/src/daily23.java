import java.util.ArrayList;

public class daily23 {
    public static void main(String[] args) {
        int output = fibonacci(0);
        System.out.println(output); // --> 0

        output = fibonacci(1);
        System.out.println(output); // --> 1

        output = fibonacci(5);
        System.out.println(output); // --> 5

        output = fibonacci(9);
        System.out.println(output); // --> 34
    }

    public static int fibo(ArrayList<Integer> list, int num){
        if(list.size()<=num){
            list.add(fibo(list, num-1) + fibo(list, num-2));
        }
        return list.get(num);
    }
    public static int fibonacci(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        return fibo(list, num);
    }
}
