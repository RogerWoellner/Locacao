package controller;

import java.util.ArrayList;
import java.util.List;

import model.Reserva;

public class ReservaController {
    private List<Reserva> reservas;

    public ReservaController() {
        this.reservas = new ArrayList<>();
    }

    public void salvarReserva(Reserva reserva) {
        int id = calcularNovoId();
        float valor = (float) calcularValor(reserva.getHospedagem().getValorPorPessoa(), reserva.getVeiculo().getValorPassagem());

        reserva.setId(id);
        reserva.setValor(valor);

        reservas.add(reserva);
    }

    public Reserva buscarReserva(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                return reserva;
            }
        }
        return null; 
    }

    public void excluirReserva(int id) {
        Reserva reservaEncontrada = buscarReserva(id);
        if (reservaEncontrada != null) {
            reservas.remove(reservaEncontrada);
        }
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }

    private int calcularNovoId() {
        int maxId = 0;
        for (Reserva reserva : reservas) {
            if (reserva.getId() > maxId) {
                maxId = reserva.getId();
            }
        }
        return maxId + 1;
    }

    private double calcularValor(double valorHospedagem, double valorVeiculo) {
        return valorHospedagem + valorVeiculo;
    }
}
