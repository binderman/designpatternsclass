package aula7.transactionscript;

public class PaymentException extends RuntimeException {
    public PaymentException(String message) {
        super(message);
    }
}
