package com.company;

public class Main {
    public static void main(String[] args) {
        int[] niz = new int[5];
        for(int i = 0; i < niz.length - 1; i++) {
            niz[i] = 2 * i + 1;
        }

        ispis(niz);
        int k = 1;
        for(int i = k + 1; i < niz.length; i++) {
            niz[i - 1] =  niz[i];
        }
        System.out.println();
        ispis(niz);
//        for(int i = niz.length - 1; i > k; i--) {
//            niz[i] = niz[i - 1];
//        }
//        niz[1] = 4;

//        int[] niz2 = new int[5];   // ja sam ovaj kod uradio sam
//        for(int i = 0; i < niz.length - 1; i++) {
//            if(niz2[1] == 0) {
//                niz2[1] = 11;
//            } else if(niz2.length - 1 < i) {
//                break;
//            }
//            niz2[i + 1] = niz[i];
//        }
//        System.out.println();
//        ispis(niz);
//
//        k = 1;

    }

    public static void ispis(int[] niz) {
        for(int i : niz) {
            System.out.print(i + ", ");
        }
    }
}