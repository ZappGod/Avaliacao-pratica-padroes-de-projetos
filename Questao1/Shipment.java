package Questao1;

// Classe que representa uma remessa de transporte (Shipment).
// Armazena dados que podem ser usados pelas diferentes modalidades de transporte.
// Alguns modos usam distância (terrestre, marítimo) e outros peso (aéreo).
public class Shipment {
    private final double distanceKm; // Distância em quilômetros
    private final double weightKg;   // Peso em quilogramas
    private final double volumeM3;   // Volume em metros cúbicos

    public Shipment(double distanceKm, double weightKg, double volumeM3) {
        this.distanceKm = distanceKm;
        this.weightKg = weightKg;
        this.volumeM3 = volumeM3;
    }

    // Getters (apenas leitura)
    public double getDistanceKm() { return distanceKm; }
    public double getWeightKg() { return weightKg; }
    public double getVolumeM3() { return volumeM3; }
}