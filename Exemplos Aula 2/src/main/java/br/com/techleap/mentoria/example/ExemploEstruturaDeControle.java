package br.com.techleap.mentoria.example;

public class ExemploEstruturaDeControle {

    /*
    Neste exemplo, declaramos uma variável idade e atribuímos o valor 20.
    Em seguida, usamos um condicional if-else para verificar se a idade é maior ou igual a 18.
    Se a condição for verdadeira (idade maior ou igual a 18), imprime "Você é maior de idade.".
    Caso contrário, imprime "Você é menor de idade.".
     */
    public static void main(String[] args) {
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
