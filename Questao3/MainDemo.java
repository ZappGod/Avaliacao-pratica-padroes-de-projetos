package Questao3;

// Classe principal que demonstra o uso do método e ele em ação implementado.
public class MainDemo {
    public static void main(String[] args) {
        // Criação dos tópicos de notícias
        NewsTopic politica = new NewsTopic("Política");
        NewsTopic esportes = new NewsTopic("Esportes");
        NewsTopic tecnologia = new NewsTopic("Tecnologia");

        // Criação dos leitores
        Reader joao = new Reader("João");
        Reader maria = new Reader("Maria");
        Reader ana = new Reader("Ana");

        // Inscrições nos tópicos
        politica.subscribe(joao);
        politica.subscribe(maria);

        esportes.subscribe(maria);
        esportes.subscribe(ana);

        tecnologia.subscribe(ana);

        // Publicação de notícias — os leitores recebem automaticamente
        politica.publishNews("Novo projeto de lei é aprovado no Congresso.");
        esportes.publishNews("Time local vence campeonato estadual.");
        tecnologia.publishNews("Novo smartphone com IA é lançado no mercado.");

        // Maria cancela inscrição em política
        politica.unsubscribe(maria);

        // Nova notícia após o cancelamento
        politica.publishNews("Reforma tributária é debatida no Senado.");
    }
}