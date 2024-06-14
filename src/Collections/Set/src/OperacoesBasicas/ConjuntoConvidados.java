package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;


    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome,int codigoConvite) {
        this.convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (codigoConvite == c.getCodigoConvite()) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int obterQuantidadeConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.obterQuantidadeConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("João", 1);
        conjuntoConvidados.adicionarConvidado("Maria", 2);
        conjuntoConvidados.adicionarConvidado("Marcio", 3);
        conjuntoConvidados.adicionarConvidado("Kleber", 4);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.obterQuantidadeConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigo(1);
        conjuntoConvidados.exibirConvidados();

    }
}
