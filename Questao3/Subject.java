package Questao3;

// Interface Subject (Sujeito observado)
// Define os métodos para gerenciar a lista de observadores (leitores) interessados.
public interface Subject {
    void subscribe(Observer observer);     // adiciona um leitor
    void unsubscribe(Observer observer);   // remove um leitor
    void notifyObservers(String news);     // notifica todos os leitores inscritos
}