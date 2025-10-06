package Questao2;

// Implementação concreta do pagamento via PIX
public class PixProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Gerando chave PIX para pagamento de R$" + amount);
        // Aqui poderia integrar com uma API de banco para criar um QR Code
    }
}