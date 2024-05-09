package aula2.exercicios.exercicio1;

public class MemberFactory {
    // Método estático Factory para criar membros com base no tipo
    public static Member getMember(String type) {
        switch (type.toLowerCase()) {
            case "student":
                return new Student();
            case "teacher":
                return new Teacher();
            case "community":
                return new CommunityMember();
            default:
                throw new IllegalArgumentException("Unknown member type: " + type);
        }
    }
}
