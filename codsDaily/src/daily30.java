public class daily30 {
    public static void main(String[] args) {
        int output = rotatedArray(new int[]{4, 5, 6, 0, 1, 2, 3}, 2);
        System.out.println(output); // --> 5

        int output2 = rotatedArray(new int[]{4, 5, 6, 0, 1, 2, 3}, 100);
        System.out.println(output2); // --> -1

        int output3 = rotatedArray(new int[]{10, 11, 12, 3, 6, 7, 8, 9}, 11);
        System.out.println(output3);  // --> 1
    }

    public static int rotatedArray(int[] rotated, int target) {
        int max = 0;
        for(int i=1; i<rotated.length; i++){
            if(rotated[i-1] + 1 != rotated[i]){
                if(max < rotated[i-1]) {
                    max = rotated[i-1];
                }
            }
        }

        if(target > max)
            return -1;

        int index = 0;
        for(int i=0; i<rotated.length; i++){
            if(rotated[i] == target)
                index = i;
        }

        return index;
    }

    public static int rotatedArray2(int[] rotated, int target){
        int left = 0;
        int right = rotated.length-1;

        while(left<=right){
            int middle = (right + left)/2;
            if(rotated[middle] == target){
                return middle;
            }

            if(rotated[left] < rotated[middle]){
                if(target<rotated[middle] && rotated[left] <= target){
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
            else {
                if(target <= rotated[right] && rotated[middle] < target){
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }
}
