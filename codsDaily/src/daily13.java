
public class daily13 {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"

        input = new String[]{
                "hi",
                "wolrd",
        };
        output = readVertically(input);
        System.out.println(output); // --> "hwiolrd"
    }

    public static String readVertically(String[] arr) {
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i].length()){
                max = arr[i].length();
            }
        }

        int index = 0;
        String result = "";

        while(index<=max){
            for(int i=0; i<arr.length; i++){
                if(arr[i].length()>index){
                    result += arr[i].charAt(index);
                } else {
                    continue;
                }
            }
            index++;
        }
        return result;
    }
}
