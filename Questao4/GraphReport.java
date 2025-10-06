package Questao4;

// Decorador concreto que adiciona gráficos ao relatório
public class GraphReport extends ReportDecorator {

    public GraphReport(Report decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void generate() {
        super.generate();
        addGraphs();
    }

    private void addGraphs() {
        System.out.println("\n[Gráficos]");
        System.out.println("- Gráfico de vendas por categoria");
        System.out.println("- Gráfico de faturamento mensal");
    }
}