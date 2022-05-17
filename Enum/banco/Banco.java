

import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nomeAgencia){
        for(Agencia agencia : agencias){
            if(agencia.getNome().equals(nomeAgencia)){
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia){
        if(buscarAgencia(nomeAgencia) == null){
            agencias.add(new Agencia(nomeAgencia));
            return true;
        }
    return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        Agencia agencia = buscarAgencia(nomeAgencia);
        if(agencia != null){
            Cliente cliente = agencia.buscarCliente(nomeCliente);
            if(cliente == null){
                Cliente novoCliente = new Cliente(nomeCliente);
                novoCliente.adicionarTransacao(valorTransacao);
                agencia.getClientes().add(novoCliente);
                return true;
            } else {
                cliente.adicionarTransacao(valorTransacao);
            }
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        Agencia agencia = buscarAgencia(nomeAgencia);
        if(agencia != null){
            Cliente cliente = agencia.buscarCliente(nomeCliente);
            if(cliente != null){
                cliente.adicionarTransacao(valorTransacao);
                return true;
            }
        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes){
        Agencia agencia = buscarAgencia(nomeAgencia);
        if(agencia != null){
          for(int i = 0; i < agencia.getClientes().size(); i++){
              int posicao = i + 1;
            System.out.println("Cliente: " + agencia.getClientes().get(i).getNome() + " [" + posicao + "]");
                if(imprimeTransacoes){
                    for(int y = 0; y < agencia.getClientes().get(i).getTransacoes().size(); y++){
                        int position = y + 1;
                        System.out.println("  [" + position + "] valor " + agencia.getClientes().get(i).getTransacoes().get(y).toString());
                    }
                }
          }
          return true;
        }
        return false;
    }
}
