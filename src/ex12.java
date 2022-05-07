public class ex12 {
    public static void main(String[] args) {
        System.out.println(convertScoreToGrade(86));
    }

    public static char convertScoreToGrade(int num) {

        char result;
        if (num > 100 || num < 0) {
            return 'X';
        }

        if (num >= 90) {
            result = 'A';
        } else if (num >= 80) {
            result = 'B';
        } else if (num >= 70) {
            result = 'C';
        } else if (num >= 60) {
            result = 'D';
        } else {
            result = 'F';
        }


        return result;
    }
}
