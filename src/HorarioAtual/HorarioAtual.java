package HorarioAtual;

import java.util.Calendar;

public class HorarioAtual {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int minutos = data.get(Calendar.MINUTE);

        if (hora > 6 && hora < 12) {
            System.out.println("Bom dia , no momento são " + hora + ":" + minutos);
        } else if (hora > 12 && hora < 18){
            System.out.println("Boa tarde, no momento são " + hora + ":" + minutos);
        } else {
            System.out.println("Boa noite, no momento são " + hora + ":" + minutos);
        }
    }
}
