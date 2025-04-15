import java.time.LocalDate;

public class Evento {
    private Integer id;
    private String titolo;
    private LocalDate dataEvento;
    private Utente organizzatore;

    public Evento(Utente organizzatore, LocalDate dataEvento, String titolo) {
        this.id = 0;
        this.organizzatore = organizzatore;
        this.dataEvento = dataEvento;
        this.titolo = titolo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Utente getOrganizzatore() {
        return organizzatore;
    }

    public void setOrganizzatore(Utente organizzatore) {
        this.organizzatore = organizzatore;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", organizzatore=" + organizzatore +
                '}';
    }

    public boolean isExpired() {
        LocalDate oggi = LocalDate.now();
        boolean isAfterNow = oggi.isAfter(this.dataEvento);
        return isAfterNow;
    }
}
