package br.com.techleap.mentoria.poo.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public String formatarData(Date data, String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format(data);
    }

}
