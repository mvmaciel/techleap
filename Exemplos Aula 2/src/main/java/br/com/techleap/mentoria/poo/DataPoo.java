package br.com.techleap.mentoria.poo;

import br.com.techleap.mentoria.poo.model.DateCalculator;
import br.com.techleap.mentoria.poo.model.DateFormatter;

import java.util.Date;

public class DataPoo {

    public static void main(String[] args) {
        DateCalculator dateCalculator = new DateCalculator();

        Date dataAtual = new Date();
        Date dataAnterior = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24); // 1 dia atrás

        // Utilizando métodos de instância da classe DateCalculator de forma orientada a objetos
        long diferenca = dateCalculator.calcularDiferencaEmDias(dataAnterior, dataAtual);
        System.out.println("Diferença em dias: " + diferenca);

        DateFormatter dateFormatter = new DateFormatter();

        dataAtual = new Date();

        // Utilizando métodos de instância da classe DateFormatter de forma orientada a objetos
        String dataFormatada = dateFormatter.formatarData(dataAtual, "dd/MM/yyyy");
        System.out.println("Data formatada: " + dataFormatada);
    }
}

