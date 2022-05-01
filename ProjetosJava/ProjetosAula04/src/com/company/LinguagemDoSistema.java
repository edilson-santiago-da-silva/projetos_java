package com.company;

import java.util.*;

public class LinguagemDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("A linguagem do sistema é: " + loc.getLanguage()+" "+ loc.getDisplayLanguage());
        //loc.getDisplayLanguage() >imprime "Português"
        //loc.getLanguage() > imprime "pt"
    }
}
