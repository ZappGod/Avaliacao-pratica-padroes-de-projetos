package Questao1;

// Fábrica concreta para transporte MARÍTIMO.
// Retorna uma instância de MaritimeFareCalculator.
public class MaritimeFareFactory extends FareCalculatorFactory {
    @Override
    public FareCalculator createFareCalculator() {
        return new MaritimeFareCalculator();
    }
}