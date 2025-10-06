package Questao1;

// Classe principal de demonstração do uso do padrão Factory Method.
// Aqui o cliente solicita o cálculo de tarifas sem precisar saber como cada cálculo é feito — apenas qual tipo de transporte deseja usar.
public class MainDemo {
    public static void main(String[] args) {
        // Cria alguns exemplos de remessas
        Shipment terrestre = new Shipment(800, 600, 0);   // 800 km
        Shipment aereo = new Shipment(0, 20, 0);          // 20 kg
        Shipment maritimo = new Shipment(5000, 0, 15);    // 15 m³

        FareCalculatorFactory factory; // Referência genérica à fábrica

        // --- Cálculo terrestre ---
        factory = new TerrestrialFareFactory();
        System.out.println("Tarifa Terrestre: R$ " + factory.calculateFare(terrestre));

        // --- Cálculo aéreo ---
        factory = new AerialFareFactory();
        System.out.println("Tarifa Aérea: R$ " + factory.calculateFare(aereo));

        // --- Cálculo marítimo ---
        factory = new MaritimeFareFactory();
        System.out.println("Tarifa Marítima: R$ " + factory.calculateFare(maritimo));
    }
}