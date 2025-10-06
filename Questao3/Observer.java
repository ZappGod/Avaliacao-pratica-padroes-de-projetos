package Questao3;

// Interface Observer (Observador)
// Define o contrato para todos os objetos que desejam ser notificados sobre atualizações.
// No caso, os leitores implementam essa interface.
public interface Observer {
    void update(String topic, String news);
}