import java.util.LinkedList;
import java.util.Queue;

public class DataStruc03 {
    public static void main(String[] args) {
        int size = 2;
        int maxWeight = 10;
        int[] cars = new int[]{7, 4, 5, 6};

        int output = queueImpl(size, maxWeight, cars);
        System.out.println(output);
    }

    public static int queueImpl(int size, int maxWeight, int[] cars){
        Queue<Integer> onList = new LinkedList<>();
        int count = 0;
        int sumWeight = 0;

        for(int current : cars){
            while(true){
                if(onList.isEmpty()){
                    onList.add(current);
                    sumWeight += current;
                    count++;
                    break;
                }
                else {
                    if(onList.size()==size){   //모든 칸이 차있는 경우
                        sumWeight -= onList.remove();
                    }

                    if(sumWeight + current > maxWeight){
                        onList.add(0);
                        count++;
                    } else {
                        onList.add(current);
                        sumWeight += current;
                        count++;
                        break;
                    }
                }
            }
        }
        return count + size;
    }
}
