

public class Email implements CanalNotificacao{

    @Override
    public String notificar(Mensagem mensagem) {
        return "[EMAIL] {" + TipoMensagem.LOG +"} - " + mensagem.getTexto();
    }
}
