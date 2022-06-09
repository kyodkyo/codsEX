import java.util.Arrays;

public class daily11 {
    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(Arrays.toString(output)); // --> ["a"', "b"]

        output = removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        System.out.println(Arrays.toString(output)); // --> ["where", "the", "word"]
    }

    public static String[] removeExtremes(String[] arr) {
        if(arr.length==0){
            return null;
        }

        int minLength=arr[0].length();
        int minIndex=0;

        int maxLength=0;
        int maxIndex=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i].length()>=maxLength){
                maxLength = arr[i].length();
                maxIndex = i;
            }
            if(arr[i].length()<=minLength){
                minLength = arr[i].length();
                minIndex = i;
            }
        }

        String[] result = new String[arr.length-2];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(i==minIndex || i==maxIndex) continue;
            result[index] = arr[i];
            index++;
        }

        return result;
    }
}
