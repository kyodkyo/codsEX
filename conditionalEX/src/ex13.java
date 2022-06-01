public class ex13 {
    public static void main(String[] args) {
        System.out.println(convertToGrade(101));
    }

    public static String convertToGrade(int num) {
        String grade = "";

        if (num > 100 || num < 0) {
            return "INVALID SCORE";
        }

        if (num >= 90) {
            grade = "A";
        } else if (num >= 80) {
            grade = "B";
        } else if (num >= 70) {
            grade = "C";
        } else if (num >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        if (grade == "F") {
            return grade;
        }

        if (num % 10 >= 8 || num == 100) {
            grade += '+';
        } else if (num % 10 < 3) {
            grade += '-';
        }

        return grade;
    }
}
