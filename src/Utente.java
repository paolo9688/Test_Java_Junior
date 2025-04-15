import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Utente {
    private Integer id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataRegistrazione;

    public Utente(String nome, String cognome, String email, LocalDate dataRegistrazione) {
        this.id = 0;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataRegistrazione = dataRegistrazione;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataRegistrazione() {
        return dataRegistrazione;
    }

    public void setDataRegistrazione(LocalDate dataRegistrazione) {
        this.dataRegistrazione = dataRegistrazione;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataRegistrazione=" + dataRegistrazione +
                '}';
    }

    public boolean isNewUser() {
        LocalDate oggi = LocalDate.now();
        long giorniTrascorsi = ChronoUnit.DAYS.between(dataRegistrazione, oggi);
        boolean giorniDallaRegistrazione = giorniTrascorsi < 30;
        return giorniDallaRegistrazione;
    }
}
