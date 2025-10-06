package Questao1;

// Implementação concreta de cálculo de tarifa para transporte TERRESTRE.
// Exemplo simples: valor fixo + custo por km rodado.
public class TerrestrialFareCalculator implements FareCalculator {
    @Override
    public double calculateFare(Shipment shipment) {
        // Tarifa = 50 reais fixos + 1.2 reais por quilômetro
        return 50 + (1.2 * shipment.getDistanceKm());
    }
}