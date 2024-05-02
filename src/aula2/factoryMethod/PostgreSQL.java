package aula2.factoryMethod;

public class PostgreSQL implements Database {
    public void connect() {
        System.out.println("Connecting to PostgreSQL database.");
    }
}