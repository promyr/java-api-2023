package List.Pesquisa;

public class Livro {
    //atributos
    private String titulo;

    private String autor;

    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return  titulo + " - " +
                 autor + " - " +
                 anoPublicacao ;

    }
}
