package Questao3;

// Classe concreta que representa o leitor (Observer concreto)
public class Reader implements Observer {

    private String name; // nome do leitor

    public Reader(String name) {
        this.name = name;
    }

    // Método chamado automaticamente quando uma nova notícia é publicada
    @Override
    public void update(String topic, String news) {
        System.out.println(name + " recebeu nova notícia de [" + topic + "]: " + news);
    }
}