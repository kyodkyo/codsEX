public class ex06 {
    public static void main(String[] args) {
        System.out.println(getAllLetters("Radagest"));
    }

    public static char[] getAllLetters(String st){
        if(st.isEmpty()){
            return new char[]{};
        }

        char[] chArr = new char[st.length()];

        for(int i=0; i<chArr.length; i++){
            chArr[i] = st.charAt(i);
        }

        return chArr;
    }
}
