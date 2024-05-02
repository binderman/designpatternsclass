package aula2.factoryMethod;

public abstract class DatabaseFactory {
    public abstract Database createDatabase();

    public static DatabaseFactory getFactory(String type) {
        if (type.equalsIgnoreCase("PostgreSQL")) {
            return new PostgreSQLFactory();
        } else if (type.equalsIgnoreCase("MySQL")) {
            return new MySQLFactory();
        }
        return null;
    }
}
