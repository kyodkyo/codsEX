public class ex07 {
    public static void main(String[] args) {
        String output = makeNums(3);
        System.out.println(output); // "121"

        output = makeNums(7);
        System.out.println(output); // "1213121"

        output = makeNums(20);
        System.out.println(output); // "12131231321231213123"
    }

    public static String makeNums(int length) {
        return make("", length);
    }

    public static String make(String str, int len){
        String chr = "123";
        if(str.length()==len) return str;
        for(int i=0; i<chr.length(); i++){
            String current = str + chr.charAt(i);
            if(checkValid(current)){
                String found = make(current, len);
                if(found!=null) return found;
            }
        }
        return null;
    }

    public static boolean checkValid(String str){
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        int half = (int)Math.floor((double) str.length()/2);

        for(int i=1; i<=half; i++){
            if(reverse.substring(0, i).equals(reverse.substring(i, i+i))){
                return false;
            }
        }
        return true;
    }
}
