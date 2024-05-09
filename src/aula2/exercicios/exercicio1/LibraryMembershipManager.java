package aula2.exercicios.exercicio1;

public class LibraryMembershipManager {
    public static void main(String[] args) {
        Member student = MemberFactory.getMember("student");
        Member teacher = MemberFactory.getMember("teacher");
        Member communityMember = MemberFactory.getMember("community");

        student.accessResources();
        System.out.println("Student Fees: $" + student.calculateFees());

        teacher.accessResources();
        System.out.println("Teacher Fees: $" + teacher.calculateFees());

        communityMember.accessResources();
        System.out.println("Community Member Fees: $" + communityMember.calculateFees());
    }
}
