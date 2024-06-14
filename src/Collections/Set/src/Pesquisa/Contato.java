package Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;

    private int numero;

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }


    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return numero == contato.numero && Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return nome + " , " + numero;
    }

    public void setNumero(int novoNumero) {
    }
}
