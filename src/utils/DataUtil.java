package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public static String converterData(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
        return formatador.format(data);
    }

    public static String converterHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
        return formatador.format(data);
    }
}
