package AdivinharNumero;

import java.util.Random;
import java.util.Scanner;


public class AdivinharNumero {
    public static void main (String[] args) {
        Random random = new Random();
        int numeroRandomico = random.nextInt(6);
        Scanner ler = new Scanner(System.in);

        System.out.printf("Adivinhe qual número de 1 a 5 eu estou pensando. Escreva um número aqui de 1 a 5: ");
        int resposta = ler.nextInt();
        if (resposta == numeroRandomico) {
            System.out.printf("Sucesso! Você acertou, parabéns!");
        } else if (resposta > 5 || resposta < 1) {
            System.out.printf("Erro! Você deve informar um número de 1 a 5.");
        } else {
            System.out.printf("Erro! O número correto é: " + numeroRandomico );
        }










    }
}
