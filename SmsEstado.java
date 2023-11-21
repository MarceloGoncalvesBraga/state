package padroescomportamentais.state;

public abstract class SmsEstado {
    
    public abstract String getEstado();

    public boolean preparando(Sms msg) {
        return "Preparando";
    }

    public boolean enviado(Sms msg) {
        return false;
    }

    public boolean recebido(Sms msg) {
        return false;
    }

}
