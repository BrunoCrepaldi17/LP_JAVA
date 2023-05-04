package hotel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservar {

    private final int numeroQuarto;
    private Date entrada;
    private Date saida;

    public Reservar(int numeroQuarto, Date entrada, Date saida) {
        if (saida.before(entrada)) {
            throw new IllegalArgumentException("Erro na Reserva: A data de saída deve ser posterior à data de entrada.");
        }
        this.numeroQuarto = numeroQuarto;
        this.entrada = entrada;
        this.saida = saida;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public Date getEntrada() {
        return entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public long duracao() {
        long diferencaMilissegundos = saida.getTime() - entrada.getTime();
        return TimeUnit.DAYS.convert(diferencaMilissegundos, TimeUnit.MILLISECONDS);
    }

    public String ImpReserva() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Reserva: Quarto " + numeroQuarto
                + ", Entrada: " + sdf.format(entrada)
                + ", Saída: " + sdf.format(saida)
                + ", " + duracao() + " noites.";
    }

    public void atualizarDatas(Date entrada, Date novaEntrada, Date saida, Date novaSaida) {
        
        if (novaSaida.before(novaEntrada)) {
            throw new IllegalStateException ("Erro na atualização da Reserva: a data de saida deve ser posterior a data de entrada.");
        }
        this.entrada = novaEntrada;
        this.saida = novaSaida;
    }
}