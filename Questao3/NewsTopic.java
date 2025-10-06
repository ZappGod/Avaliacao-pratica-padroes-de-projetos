package Questao3;

import java.util.ArrayList;
import java.util.List;

// Classe concreta que representa um tópico de notícias (Subject concreto)
// Cada tópico mantém sua própria lista de leitores interessados.
public class NewsTopic implements Subject {

    private String topicName;               // Nome do tópico (ex: Política, Esportes)
    private List<Observer> observers;       // Lista de leitores inscritos

    public NewsTopic(String topicName) {
        this.topicName = topicName;
        this.observers = new ArrayList<>();
    }

    // Inscreve um novo leitor neste tópico
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println("Leitor inscrito no tópico: " + topicName);
    }

    // Cancela a inscrição de um leitor
    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println("Leitor removido do tópico: " + topicName);
    }

    // Notifica todos os leitores inscritos com a nova notícia
    @Override
    public void notifyObservers(String news) {
        for (Observer o : observers) {
            o.update(topicName, news);
        }
    }

    // Publica uma nova notícia e dispara as notificações
    public void publishNews(String news) {
        System.out.println("\nNova notícia publicada em [" + topicName + "]: " + news);
        notifyObservers(news);
    }
}