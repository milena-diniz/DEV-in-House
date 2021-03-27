package ConverterNumeroParaInteiro;

import java.util.Scanner;
import java.lang.System;

public class ConverterNumeroParaInteiro {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite um valor com duas ou mais casas decimais: ");
        double valorDecimal = ler.nextDouble();
        int novoValorInteiro = (int) valorDecimal;
        System.out.printf("O valor convertido em inteiro é: " + novoValorInteiro);
    }
}
