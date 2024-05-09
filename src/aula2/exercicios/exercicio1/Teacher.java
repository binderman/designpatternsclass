package aula2.exercicios.exercicio1;

public class Teacher implements Member {
    @Override
    public void accessResources() {
        System.out.println("Teacher accessing both basic and advanced academic resources.");
    }

    @Override
    public double calculateFees() {
        return 10.0; 
    }
}