package Questão5;

// Classe concreta que representa um modelo de documento
// Implementa a interface Prototype e fornece a lógica de clonagem
public class DesignDocument implements DocumentPrototype {

    private String type;     // tipo do documento (ex: currículo, proposta, relatório)
    private String color;    // cor do tema
    private String font;     // fonte utilizada
    private String logo;     // logotipo do cliente

    // Construtor para definir o modelo base
    public DesignDocument(String type, String color, String font, String logo) {
        this.type = type;
        this.color = color;
        this.font = font;
        this.logo = logo;
    }

    // Implementação do método clone (clonagem do documento)
    @Override
    public DocumentPrototype clone() {
        // Cria uma nova instância com os mesmos atributos
        return new DesignDocument(type, color, font, logo);
    }

    // Exibe as informações do documento (usado para visualização no MainDemo)
    @Override
    public void showInfo() {
        System.out.println("Tipo: " + type);
        System.out.println("Cor: " + color);
        System.out.println("Fonte: " + font);
        System.out.println("Logotipo: " + logo);
    }

    // Métodos para personalizar o clone
    public void setColor(String color) {
        this.color = color;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}