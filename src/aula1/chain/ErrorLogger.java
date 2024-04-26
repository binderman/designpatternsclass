package chain;

public class ErrorLogger extends Logger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.err.println("Error Console::Logger: " + message);
    }
}
