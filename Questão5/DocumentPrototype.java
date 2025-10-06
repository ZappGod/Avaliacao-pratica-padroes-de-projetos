package Questão5;

// Interface Prototype
// Define o método que permitirá clonar documentos (criar cópias personalizadas)
public interface DocumentPrototype {
    DocumentPrototype clone(); // retorna uma cópia do documento
    void showInfo();            // exibe as informações do documento
}