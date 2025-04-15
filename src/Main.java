import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dataSpecifica1 = LocalDate.of(2021, 10, 27);
        Utente utente = new Utente("Paolo", "Rossi", "mail", dataSpecifica1);
        System.out.println(utente);
    }
}