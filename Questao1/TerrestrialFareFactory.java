package Questao1;

// Fábrica concreta para transporte TERRESTRE.
// Implementa o método createFareCalculator() retornando o tipo apropriado.
public class TerrestrialFareFactory extends FareCalculatorFactory {
    @Override
    public FareCalculator createFareCalculator() {
        return new TerrestrialFareCalculator();
    }
}