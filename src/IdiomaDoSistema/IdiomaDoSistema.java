package IdiomaDoSistema;

import java.util.*;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do computador é: " + loc.getDisplayLanguage());
    }

}
