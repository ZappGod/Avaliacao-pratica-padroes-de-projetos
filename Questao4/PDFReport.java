package Questao4;

// Decorador concreto que adiciona a funcionalidade de exportação em PDF
public class PDFReport extends ReportDecorator {

    public PDFReport(Report decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void generate() {
        super.generate();
        exportToPDF();
    }

    private void exportToPDF() {
        System.out.println("\n[Exportação]");
        System.out.println("Relatório exportado para PDF com sucesso!");
    }
}