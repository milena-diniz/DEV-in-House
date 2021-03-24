package horarioAtual;

import java.util.Calendar;

public class KauanHorarioAtual  {

    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        var saudacao = getSaudacao(calendario);
        System.out.println(saudacao + ", no momento são " + hora + ":" + minutos);
    }

    public static String getSaudacao(Calendar calendario) {
        var hora = calendario.get(Calendar.HOUR_OF_DAY);
        if (hora > 6 && hora < 12) {
            return "Bom dia";
        } else if (hora > 12 && hora < 18){
            return "Boa tarde";
        } else {
            return "Boa noite";
        }
    }
}

