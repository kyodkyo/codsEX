public class ex02 {
    public static void main(String[] args) {
        int[] boxes = new int[]{5, 1, 4, 6};
        int output = paveBox(boxes);
        System.out.println(output); // 3

        int[] boxes2 = new int[]{10, 9, 13, };
        int output2 = paveBox(boxes2);
        System.out.println(output2);  // 2
    }

    public static int paveBox(int[] boxes) {
        int count = 0;
        int max = boxes[0];
        int[] counts = new int[boxes.length];

        for(int i=0; i<boxes.length; i++){
            if(max<boxes[i]){
                max = boxes[i];
                counts[i-1] = count;
                count = 1;
                continue;
            }
            count++;
        }
        counts[boxes.length-1] = count;    //if문이 한번도 안걸릴 수 있으므로,,

        int countMax = 0;
        for(int i=0; i<counts.length; i++){
            if(countMax<counts[i]){
                countMax = counts[i];
            }
        }
        return countMax;
    }
}
