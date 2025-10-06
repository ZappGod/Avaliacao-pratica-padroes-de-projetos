package Questao1;

// Classe abstrata que representa a FÁBRICA principal (Creator no Factory Method).
// Define o método abstrato "createFareCalculator" que será implementado por subclasses concretas para retornar o tipo correto de calculadora.
public abstract class FareCalculatorFactory {

    // Factory Method: cada subclasse concreta vai criar o tipo correto de calculadora.
    public abstract FareCalculator createFareCalculator();

    // Método genérico que usa o produto criado pela fábrica para calcular a tarifa.
    // Assim, o cliente (Main) não precisa saber qual tipo de calculadora está sendo usada.
    public double calculateFare(Shipment shipment) {
        FareCalculator calculator = createFareCalculator(); // Cria o objeto correto
        return calculator.calculateFare(shipment); // Usa o objeto para calcular
    }
}