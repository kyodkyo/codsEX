public class ex11 {
    public static void main(String[] args) {
        System.out.println(addToFront(new int[]{1, 2, 3, 4}, 5));
    }

    public static int[] addToFront(int[] arr, int num){
        int[] myArr = new int[arr.length+1];
        myArr[arr.length] = num;
        System.arraycopy(arr, 0, myArr, 0, arr.length);
        return myArr;
    }
}
