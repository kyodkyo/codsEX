public class ex10 {
    public static void main(String[] args) {
        System.out.println(addToFront(new int[]{1, 2}, 0));
    }

    public static int[] addToFront(int[] arr, int num){
        int[] myArr = new int[arr.length+1];
        myArr[0] = num;
        System.arraycopy(arr, 0, myArr, 1, arr.length);
        return myArr;
    }
}
