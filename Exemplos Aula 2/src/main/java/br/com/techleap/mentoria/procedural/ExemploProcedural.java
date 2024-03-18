package br.com.techleap.mentoria.procedural;

import br.com.techleap.mentoria.utils.DateUtils;

import java.util.Date;

public class ExemploProcedural {

    public static void main(String[] args) {
        Date dataAtual = new Date();
        Date dataAnterior = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24); // 1 dia atrás

        // Utilizando métodos estáticos da classe DateUtils de forma procedural
        long diferenca = DateUtils.calcularDiferencaEmDias(dataAnterior, dataAtual);
        System.out.println("Diferença em dias: " + diferenca);

        String dataFormatada = DateUtils.formatarData(dataAtual, "dd/MM/yyyy");
        System.out.println("Data formatada: " + dataFormatada);
    }
}
