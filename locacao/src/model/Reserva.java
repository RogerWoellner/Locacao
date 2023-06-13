package model;

public class Reserva {
    private int id;
    private String origem, destino, dataInicio, dataFim;
    private Hospedagem hospedagem;
    private Veiculo veiculo;
    private float valor;
    
    public Reserva(int id, String origem, String destino, String dataInicio, String dataFim, Hospedagem hospedagem,
            Veiculo veiculo, float valor) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.hospedagem = hospedagem;
        this.veiculo = veiculo;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", origem=" + origem + ", destino=" + destino + ", dataInicio=" + dataInicio
                + ", dataFim=" + dataFim + ", hospedagem=" + hospedagem + ", veiculo=" + veiculo + ", valor=" + valor
                + "]";
    }
    
    
}
