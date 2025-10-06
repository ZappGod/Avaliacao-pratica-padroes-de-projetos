package Questao2;

// Classe responsável por criar os objetos de pagamento conforme o tipo solicitado
// Aqui aplicamos o padrão FACTORY METHOD
public class PaymentFactory {

    // Método fábrica que retorna o processador correto
    public static PaymentProcessor createPaymentProcessor(PaymentMethod method) {
        switch (method) {
            case CREDIT_CARD:
                return new CreditCardProcessor();
            case BOLETO:
                return new BoletoProcessor();
            case PIX:
                return new PixProcessor();
            default:
                throw new IllegalArgumentException("Método de pagamento desconhecido: " + method);
        }
    }
}