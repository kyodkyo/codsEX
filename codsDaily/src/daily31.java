import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class daily31 {
    public static void main(String[] args) {
        ArrayList<String> output1 = powerSet("abc");
        System.out.println(output1); // ["", "a", "ab", "abc", "ac", "b", "bc", "c"]

        ArrayList<String> output2 = powerSet("jjump");
        System.out.println(output2); // ["", "j", "jm", "jmp", "jmpu", "jmu", "jp", "jpu", "ju", "m", "mp", "mpu", "mu", "p", "pu", "u"]
    }

    public static ArrayList<String> powerSet(String str){
        ArrayList<String> list = new ArrayList<>();
        list.add("");

        String dupStr = "";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){
                dupStr += str.charAt(i);
            }
        }












        return list;
    }

    public static ArrayList<String> makeSets(ArrayList<String> list, )
}
