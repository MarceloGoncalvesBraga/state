package padroescomportamentais.state;

public class Sms {
    
    private String nome;
    private SmsEstado estado;    

    public Sms() {
        this.estado = SmsEstadoAtual.getInstance();
    }
    
    public void setEstado(SmsEstado estado) {
        this.estado = estado;
    }

    public boolean preparando() {
        return estado.preparando(this);
    }
    public boolean enviado() {
        return estado.enviado(this);
    }

    public boolean recebido() {
        return estado.recebido(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SmsEstado getEstado() {
        return estado;
    }    
}
