package exceptions;

public class LivroInvalidoException extends Exception{
    public LivroInvalidoException(String titulo) {
        super("Titulo de livro invalido");
    }
    public LivroInvalidoException(double valor) {
        super("Preco de livro invalido");
    }
}
