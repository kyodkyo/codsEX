import java.util.Arrays;
import java.util.List;

public class ex04 {
    public static void main(String[] args) {
        Member coding = new Member("coding", "Female");
        Member hacker = new Member("hacker", "Male");
        List<Member> members = Arrays.asList(coding, hacker);
        long output = computeCountOfFemaleMember(members);
        System.out.println(output);
    }

    public static long computeCountOfFemaleMember(List<Member> members) {
        return members.stream().filter(x -> x.getGender().equals("Female")).count();
    }

    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }
    }
}
