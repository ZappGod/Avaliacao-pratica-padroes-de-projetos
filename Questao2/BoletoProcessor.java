package Questao2;

// Implementação concreta do pagamento via boleto bancário
public class BoletoProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Gerando BOLETO no valor de R$" + amount);
        // Aqui poderia gerar um código de barras, PDF etc.
    }
}