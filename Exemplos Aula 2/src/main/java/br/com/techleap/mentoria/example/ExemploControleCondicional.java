package br.com.techleap.mentoria.example;

public class ExemploControleCondicional {

    public static void main(String[] args) {
        // Declaração e inicialização da variável
        int numero = -7;

        // Verifica se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
