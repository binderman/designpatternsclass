package aula2.exercicios.exercicio1;

public class CommunityMember implements Member {
    @Override
    public void accessResources() {
        System.out.println("Community member accessing public resources.");
    }

    @Override
    public double calculateFees() {
        return 30.0;
    }
}
