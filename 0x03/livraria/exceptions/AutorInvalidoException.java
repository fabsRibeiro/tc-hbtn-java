package exceptions;

public class AutorInvalidoException extends Exception{
    public AutorInvalidoException(String autor) {
        super("Nome de autor invalido");
    }
}
