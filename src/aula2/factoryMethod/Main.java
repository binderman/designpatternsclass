package aula2.factoryMethod;

public class Main {
    public static void main(String[] args) {
        DatabaseFactory factory = DatabaseFactory.getFactory("MySql");
        Database database = factory.createDatabase();
        database.connect();
    }
}
