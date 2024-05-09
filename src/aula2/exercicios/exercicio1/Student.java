package aula2.exercicios.exercicio1;

public class Student implements Member {
    @Override
    public void accessResources() {
        System.out.println("Student accessing basic academic resources.");
    }

    @Override
    public double calculateFees() {
        return 20.0;
    }
}