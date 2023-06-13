package model;

public class Hospedagem {
   private String nomeHotel;
   private int numQuartosReservados, quantidadePessoas;
   private float valorPorPessoa;

    public Hospedagem(String nomeHotel, int numQuartosReservados, int quantidadePessoas, float valorPorPessoa) {
        this.nomeHotel = nomeHotel;
        this.numQuartosReservados = numQuartosReservados;
        this.quantidadePessoas = quantidadePessoas;
        this.valorPorPessoa = valorPorPessoa;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public int getNumQuartosReservados() {
        return numQuartosReservados;
    }

    public void setNumQuartosReservados(int numQuartosReservados) {
        this.numQuartosReservados = numQuartosReservados;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public float getValorPorPessoa() {
        return valorPorPessoa;
    }

    public void setValorPorPessoa(float valorPorPessoa) {
        this.valorPorPessoa = valorPorPessoa;
    }

    @Override
    public String toString() {
        return "Hospedagem [nomeHotel=" + nomeHotel + ", numQuartosReservados=" + numQuartosReservados
                + ", quantidadePessoas=" + quantidadePessoas + ", valorPorPessoa=" + valorPorPessoa + "]";
    }
}
