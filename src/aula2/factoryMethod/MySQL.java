package aula2.factoryMethod;

public class MySQL implements Database {
    public void connect() {
        System.out.println("Connecting to MySQL database.");
    }
}

