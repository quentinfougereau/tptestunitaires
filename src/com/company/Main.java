package com.company;

import chercher.Chercher;

public class Main {

    public static void main(String[] args) {

        Chercher chercher = new Chercher();
        int[] tab = new int[100];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }
        chercher.chercher2(25, tab);

    }
}
