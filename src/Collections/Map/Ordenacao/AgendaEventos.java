package Collections.Map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void proximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + " será na data: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 15), "Conferência de Tecnologia", "Palestrantes renomados");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 20), "Feira de Ciências", "Exposições de projetos");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 10), "Conferência de Tecnologia", "Palestrantes renomados");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 15), "Conferência de Tecnologia", "Palestrantes renomados");

        agendaEventos.exibirAgenda();
        agendaEventos.proximoEvento();

    }
}