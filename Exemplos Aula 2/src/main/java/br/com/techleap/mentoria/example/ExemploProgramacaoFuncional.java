package br.com.techleap.mentoria.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ExemploProgramacaoFuncional {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrar = x -> x * 2;

        List<Integer> numerosDobrados = aplicarFuncao(numeros, dobrar);

        System.out.println("Números originais: " + numeros);
        System.out.println("Números dobrados: " + numerosDobrados);
    }

    public static <T, R> List<R> aplicarFuncao(List<T> lista, Function<T, R> funcao) {
        List<R> resultado = new ArrayList<>();
        for (T elemento : lista) {
            resultado.add(funcao.apply(elemento));
        }
        return resultado;
    }

    /*
    public static void main(String[] args) {
        List<String> letras = List.of("A","E","I","O","U");
        Function<String, String> vogal = x -> "A letra: "+ x +" É uma vogal \n";
        List<String> frase = aplicarFuncao(letras, vogal);
        System.out.println(frase);

    }*/
}
