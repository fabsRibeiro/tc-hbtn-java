import java.util.ArrayList;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa){
        if(tarefas.isEmpty()){
            if(tarefa.getDescricao() == ""){
                tarefa.modificarDescricao();
            } else {
                tarefas.add(tarefa);
            }
        } else {
            try {
                for(Tarefa novaTarefa : tarefas){
                    if(tarefa.getIdentificador() == novaTarefa.getIdentificador()){
                        throw new IllegalArgumentException();
                    }
                }
                tarefas.add(tarefa);
            } catch (IllegalArgumentException e){
                System.out.println("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
                tarefas.clear();
            }
        }
    }

    public boolean marcarTarefaFeita(int identificadorTarefa){
        for(Tarefa tarefa: tarefas){
            if(tarefa.getIdentificador() == identificadorTarefa){
                tarefa.setEstahFeita(true);
                return true;
            } else {
                tarefa.setEstahFeita(false);
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificadorTarefa){
        for(Tarefa tarefa: tarefas){
            if(tarefa.getIdentificador() == identificadorTarefa){
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas(){
        for(Tarefa tarefa: tarefas){
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas(){
        for(Tarefa tarefa: tarefas){
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for(Tarefa tarefa : tarefas){
            if(tarefa.isEstahFeita()){
                System.out.println("[X]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
            } else {
                System.out.println("[ ]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
            }
        }
    }

}
