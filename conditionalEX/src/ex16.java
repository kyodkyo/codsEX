public class ex16 {
    public static void main(String[] args) {
        System.out.println(addSecond(23, 59, 59));
    }

    public static String addSecond(int hour, int minute, int second) {

        if (second == 59) {
            second = 0;
            minute += 1;
        } else {
            second += 1;
        }

        if (minute == 60) {
            minute = 0;
            hour += 1;
        }

        if (hour == 24) {
            hour = 0;
        }

        return String.format("1초 뒤에는 %d시 %d분 %d초 입니다.", hour, minute, second);
    }
}
