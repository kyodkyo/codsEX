import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ex05 {
    public static void main(String[] args) {
        Member coding = new Member("coding", "Female", 25);
        Member hacker = new Member("hacker", "Male", 30);
        Member ingi = new Member("ingi", "Male", 32);
        List<Member> members = Arrays.asList(coding, hacker, ingi);
        double output = computeAverageOfMaleMember(members);
        System.out.println(output);
    }

    public static double computeAverageOfMaleMember(List<Member> members) {
        IntSummaryStatistics stat =  members.stream().filter(x -> x.getGender().equals("Male")).mapToInt(Member::getAge).summaryStatistics();
        return stat.getAverage();
    }

    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
