package StreamAPI.Examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SuplierExemple {

    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Ola , seja bem vindo ao mundo Java";

        List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .toList();

        listaSaudacoes.forEach(System.out::println);


    }
}