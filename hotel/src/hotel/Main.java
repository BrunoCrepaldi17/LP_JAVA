package hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Número do Quarto: ");
            int numeroQuarto = sc.nextInt();
            sc.nextLine();
            System.out.print("Data de Entrada (dd/MM/yyyy): ");
            Date entrada = sdf.parse(sc.nextLine());
            System.out.print("Data de Saída (dd/MM/yyyy): ");
            Date saida = sdf.parse(sc.nextLine());

            Reservar reserva = new Reservar(numeroQuarto, entrada, saida);
            System.out.println(reserva.ImpReserva());

            System.out.println("Insira as datas de atualização da Reserva:");
            System.out.print("Entrada (dd/MM/yyyy): ");
            Date novaEntrada = sdf.parse(sc.nextLine());
            System.out.print("Saída (dd/MM/yyyy): ");
            Date novaSaida = sdf.parse(sc.nextLine());
            reserva.atualizarDatas(entrada, novaEntrada, saida, novaSaida);
            System.out.println(reserva.ImpReserva());
        } 
        catch (ParseException error) {
            System.out.println("Formato de data invalido");
        } 
        finally {
            sc.close();
        }
    }

}
