package br.com.techleap.mentoria.poo.model;

public class Pessoa {

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    String nome;
    int idade;

    public void exibirInformacoes() {
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
    }

}
