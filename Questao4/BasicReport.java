package Questao4;

// Implementação concreta do relatório básico
// Essa é a versão inicial do relatório, com apenas a lista de pedidos
public class BasicReport implements Report {

    @Override
    public void generate() {
        System.out.println("Relatório básico de pedidos gerado:");
        System.out.println("- Pedido 1: R$ 120,00");
        System.out.println("- Pedido 2: R$ 85,50");
        System.out.println("- Pedido 3: R$ 210,30");
    }
}