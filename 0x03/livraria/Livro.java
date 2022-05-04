
import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {

    public String titulo;
    public String autor;
    public double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() throws LivroInvalidoException{
        if(titulo.length() < 3){
            throw new LivroInvalidoException(titulo);
        }
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() throws AutorInvalidoException{
        if(autor.length() - autor.replaceAll(" ", "").length() < 1){
            throw new AutorInvalidoException(autor);
        }
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() throws LivroInvalidoException{
        if(preco <= 0) {
            throw new LivroInvalidoException(preco);
        }
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
