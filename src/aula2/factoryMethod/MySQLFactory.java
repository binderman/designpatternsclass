package aula2.factoryMethod;

public class MySQLFactory extends DatabaseFactory {
    public Database createDatabase() {
        return new MySQL();
    }
}
