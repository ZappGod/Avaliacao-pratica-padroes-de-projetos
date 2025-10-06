package Questao4;

// Classe principal para demonstrar o uso do método implementando ele.
public class MainDemo {
    public static void main(String[] args) {
        // Relatório básico
        Report basicReport = new BasicReport();
        System.out.println("=== RELATÓRIO BÁSICO ===");
        basicReport.generate();

        // Relatório com estatísticas adicionais
        System.out.println("\n=== RELATÓRIO COM ESTATÍSTICAS ===");
        Report reportWithStats = new StatisticsReport(basicReport);
        reportWithStats.generate();

        // Relatório com gráficos e estatísticas
        System.out.println("\n=== RELATÓRIO COM ESTATÍSTICAS + GRÁFICOS ===");
        Report reportWithStatsAndGraphs = new GraphReport(new StatisticsReport(basicReport));
        reportWithStatsAndGraphs.generate();

        // Relatório completo (estatísticas + gráficos + exportação PDF)
        System.out.println("\n=== RELATÓRIO COMPLETO (ESTATÍSTICAS + GRÁFICOS + PDF) ===");
        Report fullReport = new PDFReport(new GraphReport(new StatisticsReport(basicReport)));
        fullReport.generate();
    }
}