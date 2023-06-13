package model;

public abstract class Veiculo {
    protected int numPassagem;
    protected float valorPassagem;
    protected String horaPartida;
    protected String horaRetorno;
    
    public Veiculo(int numPassagem, float valorPassagem, String horaPartida, String horaRetorno) {
        this.numPassagem = numPassagem;
        this.valorPassagem = valorPassagem;
        this.horaPartida = horaPartida;
        this.horaRetorno = horaRetorno;
    }

    public int getNumPassagem() {
        return numPassagem;
    }

    public void setNumPassagem(int numPassagem) {
        this.numPassagem = numPassagem;
    }

    public float getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(float valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraRetorno() {
        return horaRetorno;
    }

    public void setHoraRetorno(String horaRetorno) {
        this.horaRetorno = horaRetorno;
    }
}
