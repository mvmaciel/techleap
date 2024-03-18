package br.com.techleap.mentoria.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtils {
    public static long calcularDiferencaEmDias(Date dataInicial, Date dataFinal) {
        long diferenca = Math.abs(dataFinal.getTime() - dataInicial.getTime());
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public static String formatarData(Date data, String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format(data);
    }
}
