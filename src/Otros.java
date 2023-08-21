import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Otros {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDateTime fechaYHora = LocalDateTime.now();
        LocalDateTime fechaYHora2 = LocalDateTime.of(2023, 02, 14, 01, 30);

        fecha = fecha.plusDays(2);
        fecha.plusWeeks(3);
        fecha.plusMonths(1);
        fecha.plusYears(5);

        DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = fechaYHora.format(formatFecha);

        fechaYHora.isAfter(fechaYHora2);
    }
}
