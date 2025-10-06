package Questao1;

// Implementação concreta de cálculo de tarifa para transporte AÉREO.

public class AerialFareCalculator implements FareCalculator {
    @Override
    public double calculateFare(Shipment shipment) {
        // Tarifa = 10 reais por kg transportado
        return 10 * shipment.getWeightKg();
    }
}