
public class ArmazemDeEletronico extends Armazem<Eletronico>{

    public void adicionarAoInventario(String nome, Eletronico valor) {
       super.adicionarAoInventario(nome, valor);
    }

    public Eletronico obterDoInventario(String nome) {
        return super.obterDoInventario(nome);
    }
}
