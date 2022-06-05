import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {
        int output = countBox(new int[]{70, 50, 80, 50}, 100);
        System.out.println(output); // 3

        int output2 = countBox(new int[]{60, 80, 120, 90, 130}, 140);
        System.out.println(output2); // 4
    }

    public static int countBox(int[] boxes, int limit){
        Arrays.sort(boxes);

        int count = 0;
        for(int i=0; i< boxes.length; i++){
            if(boxes[i]==0) continue;   //해당 인덱스의 값이 0이면 통과하고 i++

            int next = boxes.length-1;
            int nextBox = boxes[next];

            while(nextBox!=0 && boxes[i]+nextBox > limit){  // 다음 박스의 값이 0이 아니고, 합이 limit을 넘는 동안만 반복
                next--;
                while(nextBox==0 && next>i){                  // 다음 박스의 값이 0이면 인덱스를 계속해서 줄여나감
                    next--;
                }
            }
            boxes[i] = 0;
            boxes[next] = 0;
            count++;
        }
        return count;
    }
}