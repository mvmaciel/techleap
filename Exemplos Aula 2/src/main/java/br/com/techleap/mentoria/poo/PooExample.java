package br.com.techleap.mentoria.poo;

import br.com.techleap.mentoria.poo.model.Pessoa;

public class PooExample {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", 29);
        Pessoa pedro = new Pessoa("Pedro", 19);
        Pessoa isabela = new Pessoa("Isabela", 28);

        marcos.exibirInformacoes();
        pedro.exibirInformacoes();
        isabela.exibirInformacoes();
    }
}