package aula7.saga.orquestracao;

public class SagaExecutionException extends RuntimeException {
    public SagaExecutionException(String message) {
        super(message);
    }
}
