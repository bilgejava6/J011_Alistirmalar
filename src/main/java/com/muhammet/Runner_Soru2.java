package com.muhammet;

import java.util.Scanner;

public class Runner_Soru2 {
    public static void main(String[] args) {

        /**
         *
         * Kullanıcıdan bir cümle alacağız ve içerisinde tekrar eden kelimeleri bulup listeleyeceğiz.
         * Eğer tekrar eden kelime yok ise  bunu belirten bir sonuç döneceğiz.
         *
         * örn: Türkiye de her yıl onlarca ağaç yangınlarda yok oluyor, türkiye bu konuda çok
         * yol almalı.
         */

        System.out.print("lütfen  bir cümle giriniz....: ");
        String cumle = new Scanner(System.in).nextLine();
        String[] kelimeler = cumle.split(" ");
        /**
         *
         * müdür ile ahmet müdür kouşturlar ve ali ile karşılaştılar. demet müdür hepsine kızdı.
         * müdür ile ahmet  ""   kouşturlar ve ali ""  karşılaştılar. demet   ""  hepsine kızdı.
         * index 0- müdür
         * index 1- ile
         * index 2-
         * index 3- ""
        */

        for (int i = 0; i < kelimeler.length; i++) {
            String birinciDonguKontrolKelimesi = kelimeler[i];
            if (birinciDonguKontrolKelimesi.isEmpty()) continue; // döngünün sonraki index değerine geçmesini sağlar.
            int tekrarAdedi = 0;
            for (int j=i+1; j< kelimeler.length;j++){
               String ikinciDonguKontorlKelimesi = kelimeler[j];
               if(birinciDonguKontrolKelimesi.equalsIgnoreCase(ikinciDonguKontorlKelimesi)){
                  tekrarAdedi++;
                  kelimeler[j] = "";
               }
            }
           if(tekrarAdedi>0) System.out.println(birinciDonguKontrolKelimesi+ " -  "+ (tekrarAdedi+1)+" kes tekrar ediyor" );
        }

    }
}
