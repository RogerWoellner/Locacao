import java.util.List;

import controller.ReservaController;
import model.Aviao;
import model.Barco;
import model.Hospedagem;
import model.Reserva;

public class App {
    public static void main(String[] args) throws Exception {

        Barco barco = new Barco(2, 250, "10:00", "16:00", 32);

        Aviao aviao = new Aviao(25, 950, "11:00", "21:00", 250);

        Hospedagem hotel1 = new Hospedagem("Ibis", 2, 2, 200);

        Hospedagem hotel2 = new Hospedagem("Você que Sabe", 1, 2, 90);

        Reserva reserva1 = new Reserva(1, "Curitiba", "Belo Horizonte", "30/05/2023", "32/05/2023", hotel2, aviao, 700);

        Reserva reserva2 = new Reserva(2, "Curitiba", "Rio de Janeiro", "30/05/2023", "32/05/2023", hotel1, barco, 1000);

        Reserva reserva3 = new Reserva(3, "Curitiba", "Belo Horizonte", "30/05/2023", "32/05/2023", hotel2, aviao, 700);

        Reserva reserva4 = new Reserva(4, "Curitiba", "Rio de Janeiro", "30/05/2023", "32/05/2023", hotel1, barco, 1500);

        ReservaController reservaController = new ReservaController();

        reservaController.salvarReserva(reserva1);
        reservaController.salvarReserva(reserva2);
        reservaController.salvarReserva(reserva3);

        reservaController.excluirReserva(2);

        reservaController.salvarReserva(reserva4);

        List<Reserva> listaReservas = reservaController.listarReservas();
        for (Reserva reserva : listaReservas) {
            System.out.println(reserva);
        }
    }
}

