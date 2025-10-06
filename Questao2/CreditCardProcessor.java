package Questao2;

// Implementação concreta do pagamento com cartão de crédito
public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processando pagamento com CARTÃO DE CRÉDITO no valor de R$" + amount);
        // Aqui poderiam ser chamadas APIs de gateways de cartão, por exemplo
    }
}