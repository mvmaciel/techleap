package br.com.techleap.mentoria.poo.model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateCalculator {
    public long calcularDiferencaEmDias(Date dataInicial, Date dataFinal) {
        long diferenca = Math.abs(dataFinal.getTime() - dataInicial.getTime());
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

}
