package Questao2;

// Interface comum para todos os processadores de pagamento
// Garante que cada método de pagamento terá o mesmo contrato (método processPayment)
public interface PaymentProcessor {
    void processPayment(double amount);
}