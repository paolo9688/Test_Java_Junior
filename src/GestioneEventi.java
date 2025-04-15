import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GestioneEventi {
    private final Set<Utente> listaUtenti;
    private final Set<Evento> listaEventi;
    private final Map<Utente, Set<Evento>> mappaUtenti;

    public GestioneEventi() {
        this.listaUtenti = new HashSet<>();
        this.listaEventi = new HashSet<>();
        this.mappaUtenti = new HashMap<>();
    }

    public void aggiungiUtente(Utente utente) {
        listaUtenti.add(utente);
        System.out.println("L'utente " + utente.getNome() + " " + utente.getCognome()
                + " è stato correttamente inserito nella lista utenti");
    }

    public void aggiungiEvento(Evento evento) {
        listaEventi.add(evento);
        System.out.println("L'evento " + evento.getTitolo() + " è stato correttamente inserito nella lista eventi");
    }

    public Set<Evento> trovaEventiPerUtente(Utente utente) {
        System.out.println("Questa è la lista degli eventi organizzati dall'utente "
                + utente.getNome() + " " + utente.getCognome() + ":");
        Set<Evento> eventoSet = mappaUtenti.get(utente);
        return eventoSet;
    }

    public void rimuoviEventiScaduti() {
        for (Evento evento : listaEventi) {
            if (evento.isExpired()) {
                listaEventi.remove(evento);
            }
        }
    }
}
