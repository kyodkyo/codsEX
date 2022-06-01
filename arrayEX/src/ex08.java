public class ex08 {
    public static void main(String[] args) {
        System.out.println(getLongestWorkd("I Love Myself"));
    }

    public static String getLongestWorkd(String str){
        String[] words = str.split(" ");

        String max = words[0];
        for(int i=0; i< words.length; i++){
            if(words[i].length()>max.length()){
                max = words[i];
            }
        }

        return max;

    }
}
