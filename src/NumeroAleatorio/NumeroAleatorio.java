package NumeroAleatorio;

import java.util.Random;

public class NumeroAleatorio {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(2);
        System.out.println("Número gerado: " + valor);
    }
}
