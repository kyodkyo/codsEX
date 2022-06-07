public class daily06 {
    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1); // "Hello World"

        String output2 = letterCapitalize("java  is good ");
        System.out.println(output2); // "Java  Is Good "
    }

    public static String letterCapitalize(String str) {

        if(str.length()==0){
            return new String();
        }

        String[] array = str.split(" ");
        for(int i=0; i< array.length; i++){
            if(array[i].isEmpty()){
                array[i] = array[i];
            } else {
                array[i] =  String.valueOf(array[i].charAt(0)).toUpperCase() + array[i].substring(1);
            }
        }

        String result = String.join(" ", array);
        return result;
    }
}
