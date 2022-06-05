import java.util.LinkedList;
import java.util.Queue;

public class ex03 {
    public static void main(String[] args) {
        int bufferSize = 2;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};

        int output = queuePrinter(bufferSize, capacities, documents);
        System.out.println(output);
    }

    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
        int result = 0;

        Queue<Integer> queue = new LinkedList<>();
        int sumDocument = 0;

        for (int i = 0; i < documents.length; i++) {

            while (true) {
                if (queue.isEmpty()) {      //큐가 비어있는 경우
                    queue.add(documents[i]);
                    sumDocument += documents[i];
                    result++;
                    break;
                }
                else {   // 큐가 비어있지 않을 때
                    if(queue.size()==bufferSize){    //큐 사이즈와 버퍼사이즈가 같을 때
                        sumDocument -= queue.remove();
                    }

                    if (sumDocument + documents[i] > capacities) {   //다음 문서가 들어오면 용량을 초과할 때
                        queue.add(0);
                        result++;
                    } else {
                        queue.add(documents[i]);
                        sumDocument += documents[i];
                        result++;
                        break;
                    }
                }
            }
        }
        return result + bufferSize;
    }
}
