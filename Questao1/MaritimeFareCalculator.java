package Questao1;


// Implementação concreta de cálculo de tarifa para transporte MARÍTIMO.
// Exemplo: valor fixo + custo proporcional ao volume transportado.
public class MaritimeFareCalculator implements FareCalculator {
    @Override
    public double calculateFare(Shipment shipment) {
        // Tarifa = 200 reais fixos + 30 reais por metro cúbico de volume
        return 200 + (30 * shipment.getVolumeM3());
    }
}