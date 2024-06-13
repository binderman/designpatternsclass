package transactionscript;

public class SimplePaymentService implements PaymentService {
    @Override
    public boolean charge(double amount) {
        System.out.println("Cobrando o cliente: $" + amount);
        return true; // Simula uma cobrança bem-sucedida
    }
}
