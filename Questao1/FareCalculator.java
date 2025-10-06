package Questao1;

// Interface que define o contrato (Strategy) para o cálculo de tarifa.
// Cada tipo de transporte (terrestre, aéreo, marítimo) implementará esse método de forma diferente, aplicando suas próprias regras.

public interface FareCalculator {
    double calculateFare(Shipment shipment);
}
