package Questao4;

// Decorador concreto que adiciona estatísticas de faturamento ao relatório
public class StatisticsReport extends ReportDecorator {

    public StatisticsReport(Report decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void generate() {
        super.generate();
        addStatistics();
    }

    // Método adicional específico deste decorador
    private void addStatistics() {
        System.out.println("\n[Estatísticas de Faturamento]");
        System.out.println("- Total de pedidos: 3");
        System.out.println("- Faturamento total: R$ 415,80");
        System.out.println("- Ticket médio: R$ 138,60");
    }
}