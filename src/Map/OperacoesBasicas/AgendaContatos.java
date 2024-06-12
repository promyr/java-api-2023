package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        agendaContatoMap.remove(nome);
        if (agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }


    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = agendaContatoMap.get(nome);
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pedro ", 123456789);
        agendaContatos.adicionarContato("Maria ", 987654321);
        agendaContatos.adicionarContato("João ", 456789123);
        agendaContatos.adicionarContato("Marcio ", 345678912);
        agendaContatos.adicionarContato("Kleber ", 234567891);

        agendaContatos.removerContato("Maria ");

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Maria silva ", 987654321);

        agendaContatos.exibirContatos();

        System.out.println("o número do contato de Maria é " + agendaContatos.pesquisarPorNome("Maria silva "));
    }
}
