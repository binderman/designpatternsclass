package aula2.factoryMethod;

public class PostgreSQLFactory extends DatabaseFactory {
    public Database createDatabase() {
        return new PostgreSQL();
    }
}