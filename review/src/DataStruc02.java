import java.util.ArrayList;

public class DataStruc02 {
    public static void main(String[] args) {
        int[] boxes = new int[]{5, 1, 4, 6};
        int output = maxCount(boxes);
        System.out.println(output); // 3

        int[] boxes2 = new int[]{1, 5, 7, 9};
        int output2 = maxCount(boxes2);
        System.out.println(output2); // 1
    }

    public static int maxCount(int[] boxes){
        ArrayList<Integer> countList = new ArrayList<>();

        int count = 0;
        int max = boxes[0];

        for(int box : boxes){
            if(max<box){
                max = box;
                countList.add(count);
                count = 1;
                continue;
            }
            count++;
        }
        countList.add(count);

        int maxCount = 0;
        for(int element : countList){
            if(maxCount<element){
                maxCount = element;
            }
        }

        return maxCount;
    }
}
