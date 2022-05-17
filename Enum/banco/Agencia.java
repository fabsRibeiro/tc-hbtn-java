
import java.util.ArrayList;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeCliente, double valorTransacao){
        if(buscarCliente(nomeCliente) == null){
            getClientes().add(new Cliente(nomeCliente));
            buscarCliente(nomeCliente).adicionarTransacao(valorTransacao);
            return true;
        }
        return false; // cliente ja existente na lista.
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao){
        if(buscarCliente(nomeCliente) != null){
            buscarCliente(nomeCliente).adicionarTransacao(valorTransacao);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String nomeCliente){
        for(Cliente cliente : clientes){
            if(cliente.getNome().equals(nomeCliente)){
                return cliente;
            }
        }
        return null;
    }
}
