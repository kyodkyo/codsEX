public class daily18 {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }

    public static int numberSearch(String str) {
        if(str.length()==0) return 0;

        int length = 0;
        double sum = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ') continue;
            if(str.charAt(i)>='1' && str.charAt(i)<='9'){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            } else {
                length+=1;
            }
        }
        double result = sum/length;

        return (int)Math.round((result*10)/10);
    }
}
