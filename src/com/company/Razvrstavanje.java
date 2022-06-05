package com.company;

import java.util.Scanner;

public class Razvrstavanje {
    public static void main(String[] args) {
        int[] niz = new int[5];
        int[] poz = new int[niz.length];
        int[] neg = new int[niz.length];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesite " + (i + 1) + ". clan");
            niz[i] = Integer.parseInt(scan.nextLine());
        }
        int p = 0;
        int n = 0;

        for (int i = 0; i < niz.length; i++) {
            if(niz[i] > 0) {
                poz[p++] = niz[i];
            } else if(niz[i] < 0) {
                neg[n++] = niz[i];
            }
        }
        int[] pom = poz;
        poz = new int[p];

        for(int i = 0; i < poz.length; i++) {
            poz[i] = pom[i];
        }
        
        pom = neg;
        neg = new int[n];

        for(int i = 0; i < neg.length; i++) {
            neg[i] = pom[i];
        }
        ispis(niz);
        System.out.println();
        ispis(poz);
        System.out.println();
        ispis(neg);
    }

    public static void ispis(int[] niz) {
        for (int i : niz) {
            System.out.print(i + ", ");
        }
    }
}
