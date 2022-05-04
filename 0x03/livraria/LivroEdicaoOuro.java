
import exception.*;

public class LivroEdicaoOuro extends Livro{

    public LivroEdicaoOuro(String titulo, String autor, double preco) {
        super(titulo, autor, preco);
    }

    @Override
    public double getPreco() throws LivroInvalidoException {
        return (super.getPreco() + (super.getPreco() * 0.30));
    }
}
