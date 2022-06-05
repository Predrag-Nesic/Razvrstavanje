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

        for (int i = 0; i < niz.length; i++) {
            if(niz[i] > 0) {
                poz[i] = niz[i];
            } else if(niz[i] < 0) {
                neg[i] = niz[i];
            }

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
