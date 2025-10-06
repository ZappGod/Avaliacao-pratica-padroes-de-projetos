package Questao1;


// Fábrica concreta para transporte AÉREO.
// Retorna uma instância de AerialFareCalculator.

public class AerialFareFactory extends FareCalculatorFactory {
    @Override
    public FareCalculator createFareCalculator() {
        return new AerialFareCalculator();
    }
}