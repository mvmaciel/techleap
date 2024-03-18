package br.com.techleap.mentoria.example;

public class ExemploCondicionalAninhado {

    public static void main(String[] args) {
        // Declaração e inicialização da variável
        double nota = 8.5;

        // Verifica a faixa de desempenho do aluno
        if (nota >= 0 && nota <= 10) {
            if (nota >= 9) {
                System.out.println("Desempenho excelente!");
            } else if (nota >= 8) {
                System.out.println("Desempenho muito bom.");
            } else if (nota >= 7) {
                System.out.println("Desempenho bom.");
            } else {
                System.out.println("Desempenho regular.");
            }
        } else {
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
        }
    }
}