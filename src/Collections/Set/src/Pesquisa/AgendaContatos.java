package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().equals(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public Set<Contato> pesquisarPorNumero(int numero) {
        Set<Contato> contatosPorNumero = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNumero() == numero) {
                contatosPorNumero.add(c);
            }
        }
        return contatosPorNumero;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoParaAtualizar = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoParaAtualizar = c;
                break;
            }
        }
        return contatoParaAtualizar;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("João", 1);
        agendaContatos.adicionarContato("Maria", 2);
        agendaContatos.adicionarContato("Marcio", 3);
        agendaContatos.adicionarContato("Kleber", 4);
        agendaContatos.adicionarContato("João", 1);
        agendaContatos.adicionarContato("Maria", 2);
        agendaContatos.adicionarContato("Marcio", 3);
        agendaContatos.adicionarContato("Kleber", 8);
        agendaContatos.adicionarContato("João", 9);
        agendaContatos.adicionarContato("Maria", 10);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("João"));

        System.out.println("contato atualizado " + agendaContatos.atualizarNumeroContato("João", 15496));
    }
}
