package Questao4;

// Classe abstrata que implementa a interface Report e "envolve" outro Report
// Serve como base para os decoradores concretos (estatísticas, gráficos, PDF)
public abstract class ReportDecorator implements Report {
    protected Report decoratedReport;

    public ReportDecorator(Report decoratedReport) {
        this.decoratedReport = decoratedReport;
    }

    // O método generate é sobrescrito pelas subclasses concretas
    @Override
    public void generate() {
        decoratedReport.generate();
    }
}