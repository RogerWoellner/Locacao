package model;

public class Barco extends Veiculo{
    private int numCabine;

    public Barco(int numPassagem, float valorPassagem, String horaPartida, String horaRetorno, int numCabine) {
        super(numPassagem, valorPassagem, horaPartida, horaRetorno);
        this.numCabine = numCabine;
    }

    public int getNumCabine() {
        return numCabine;
    }

    public void setNumCabine(int numCabine) {
        this.numCabine = numCabine;
    }

    @Override
    public String toString() {
        return "Barco [numPassagem=" + numPassagem + ", valorPassagem=" + valorPassagem + ", horaPartida="
        + horaPartida + ", horaRetorno=" + horaRetorno + " numCabine=" + numCabine + "]";
    }

    
}
