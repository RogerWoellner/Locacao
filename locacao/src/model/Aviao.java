package model;

public class Aviao extends Veiculo{
    private float pesoBagagem;

    public Aviao(int numPassagem, float valorPassagem, String horaPartida, String horaRetorno, float pesoBagagem) {
        super(numPassagem, valorPassagem, horaPartida, horaRetorno);
        this.pesoBagagem = pesoBagagem;
    }

    public float getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(float pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }

    @Override
    public String toString() {
        return "Avião [numPassagem=" + numPassagem + ", valorPassagem=" + valorPassagem + ", horaPartida="
        + horaPartida + ", horaRetorno=" + horaRetorno + "pesoBagagem=" + pesoBagagem + "]";
    }
}
