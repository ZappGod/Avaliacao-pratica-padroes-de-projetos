package Questão5;

// Classe principal implementando o uso do método Prototype.
public class MainDemo {
    public static void main(String[] args) {
        // Modelo base de documento (padrão da empresa)
        DesignDocument baseResume = new DesignDocument("Currículo", "Azul", "Arial", "LogoEmpresa");
        DesignDocument baseProposal = new DesignDocument("Proposta Comercial", "Cinza", "Calibri", "LogoEmpresa");

        System.out.println("=== MODELOS BASE ===");
        baseResume.showInfo();
        System.out.println();
        baseProposal.showInfo();

        // Criação de cópias personalizadas a partir dos modelos base
        System.out.println("\n=== CÓPIAS PERSONALIZADAS ===");

        // Clone do currículo personalizado para o cliente João
        DesignDocument resumeJoao = (DesignDocument) baseResume.clone();
        resumeJoao.setColor("Verde");
        resumeJoao.setLogo("LogoJoao");

        // Clone da proposta comercial personalizada para o cliente Maria
        DesignDocument proposalMaria = (DesignDocument) baseProposal.clone();
        proposalMaria.setFont("Times New Roman");
        proposalMaria.setLogo("LogoMaria");

        // Exibição dos resultados
        System.out.println("\nCurrículo personalizado para João:");
        resumeJoao.showInfo();

        System.out.println("\nProposta personalizada para Maria:");
        proposalMaria.showInfo();
    }
}