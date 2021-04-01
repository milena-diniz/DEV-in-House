package TamanhoDeLetras;

import java.util.Scanner;
import java.lang.String;

public class TamanhoDeLetras{

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite um nome qualquer: ");
        String exampleString = ler.next();
        int stringLength = exampleString.length();
        System.out.println("String length: " + stringLength);

    }


}
