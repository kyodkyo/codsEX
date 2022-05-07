public class ex10 {
    public static void main(String[] args) {
        System.out.println(followingDay("월"));
    }

    public static String followingDay(String day) {
        String result = " ";
        switch (day) {
            case "월":
                result = "화";
                break;
            case "화":
                result = "수";
                break;
            case "수":
                result = "목";
                break;
            case "목":
                result = "금";
                break;
            case "금":
                result = "토";
                break;
            case "토":
                result = "일";
                break;
            case "일":
                result = "월";
                break;
        }
        return result;
    }
}
