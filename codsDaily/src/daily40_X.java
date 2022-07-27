import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class daily40_X {
    public static void main(String[] args) {
        int output = primePassword(1033, 1033);
        System.out.println(output); // --> 0

        output = primePassword(3733, 8779);
        System.out.println(output); // --> 3 (3733 -> 3739 -> 3779 -> 8779)
    }

    public static int primePassword(int curPwd, int newPwd) {
        if (curPwd == newPwd) return 0;
        Queue<int[]> queue = new LinkedList<>();

        boolean[] isVisited = new boolean[10000];
        isVisited[curPwd] = true;
        queue.offer(new int[]{0, curPwd});

        while (!queue.isEmpty()) {
            int[] data = queue.poll();
            int step = data[0];
            int num = data[1];

            for (int i = 0; i < 4; i++) {
                int[] digits = splitNumber(num);
                for (int d = 0; d < 10; d++) {
                    if (d != digits[i]) {
                        digits[i] = d;
                        int next = joinDigits(digits);
                        if(next == newPwd) return step + 1;
                        if(next > 1000 && isPrime(next) && !isVisited[next]) {
                            isVisited[next] = true;
                            queue.offer(new int[]{step + 1 , next});
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static boolean isPrime(int num) {
        if(num % 2 == 0) return false;
        int sqrt = (int)(Math.sqrt(num));
        for(int divider = 3; divider <= sqrt; divider += 2) {
            if(num % divider == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] splitNumber(int num) {
        return Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();

        // 반복문으로 바꾸기
        // String temp = Integer.toString(num);
        // int[] digits = new int[temp.length()];
        // for (int i = 0; i < temp.length(); i++) digits[i] = temp.charAt(i) - '0';
        // return digits;
    }

    public static int joinDigits(int[] arr) {
        String[] tempArr = new String[arr.length];
        for(int i = 0; i < arr.length; i++) {
            tempArr[i] = String.valueOf(arr[i]);
        }

        return Integer.parseInt(String.join("", tempArr));
    }
}
