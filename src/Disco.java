// Já presenciei venda de discos de músicas em livraria, e adicionei alguns métodos que se 
// podem encontrar em loja de músicas para complementar esse ProjetoLivraria que tem de tudo 
// 😊📚🎵

public class Disco {
    
    String artista;
    String album;
    double preco;

    void escutar(){
        System.out.println("* Demonstração do album " + album + " de " + artista + " tocando *" );
    }

    void assinar(){
        System.out.println("Seu disco foi assinado pelo " + artista + " que veio hoje visitar a livraria!");
    }

}
