package Questao2;

// Classe principal que demonstra o uso do método e ele em ação na plataforma de pagamentos implementada.
public class MainDemo {
    public static void main(String[] args) {
        // Exemplo 1: pagamento com cartão de crédito
        PaymentProcessor p1 = PaymentFactory.createPaymentProcessor(PaymentMethod.CREDIT_CARD);
        p1.processPayment(250.75);

        // Exemplo 2: pagamento com boleto
        PaymentProcessor p2 = PaymentFactory.createPaymentProcessor(PaymentMethod.BOLETO);
        p2.processPayment(120.00);

        // Exemplo 3: pagamento com PIX
        PaymentProcessor p3 = PaymentFactory.createPaymentProcessor(PaymentMethod.PIX);
        p3.processPayment(89.90);
    }
}