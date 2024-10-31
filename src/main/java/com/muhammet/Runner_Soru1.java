package com.muhammet;

import java.util.Scanner;

public class Runner_Soru1 {
    public static void main(String[] args) {
        // TODO: burayı anlamadım.

        /**
         * Okul Otomasyon,
         * Ders Listesi -> String[] dersList; // 5 ders girirlecek
         *
         * ***** OKUL OTOMASYON *****
         * 1- Ders Ekleme
         *
         *      kaç ders girmek istiyorsunuz..: 3
         *      1. ders...:
         *      2. ders...:
         *      3. ders...:
         *
         * 2- Ders Listesi
         *         **** ders listesi ****
         *         1-
         *         2-
         *         3-
         * 3- Ders Arama
         *       ders adı.....: mat
         *       +
         * 0- ÇIKIŞ
         * seçiniz......: 2
         *
         *
         */

        Scanner scanner = new Scanner(System.in);
        int secim;
        String[] dersler = null;
        int adet = 0;
        do{
            System.out.println("""
                
                ***** OKUL OTOMASYONU *****
                1- Ders Ekle
                2- Ders Listele
                3- Ders Arama
                0- ÇIKIŞ
                """);
            System.out.print("lütfen seçiniz......: ");
            secim = scanner.nextInt();
            switch (secim){
                case 1:
                    System.out.println("""
                            
                            ***** Ders Ekleme Ekranı 
                            
                            """);
                    System.out.print("kaç adet ders girişi yapacaksınız..: ");
                    adet = new Scanner(System.in).nextInt();
                    dersler = new String[adet];
                    for (int i = 0; i < adet; i++) {
                        System.out.print(i+1+". ders adını giriniz....: ");
                        dersler[i] = new Scanner(System.in).nextLine();
                    }
                    break;
                case 2:
                    System.out.println("""
                            
                            ***** Ders Listesi *****
                            
                            """);
                    for (int i = 0; i < adet; i++) {
                        System.out.println(i+1+". Ders..: "+dersler[i]);
                    }
                    break;
                case 3:
                    if(adet==0) {
                        System.out.println("Eklenmiş ders bulunmamaktadır");break;
                    }
                    System.out.println("""
                            
                            ***** Ders Arama *****
                            
                            """);
                    System.out.print("aranılan ders anahtar kelimesi....: ");
                    String aranan = new Scanner(System.in).nextLine(); // matematik, mate
                    int bulunanDersAdedi = 0;
                    for (int i = 0; i < adet; i++) {
                        String ders = dersler[i];
                        if(ders.toLowerCase().startsWith(aranan)){
                            System.out.println(i+1+". Ders... "+ ders);
                            bulunanDersAdedi++;
                        }
                    }
                    if(bulunanDersAdedi==0) System.out.println("Hüç bir kayıt bulunamaMIŞTIR");
                    else System.out.println(bulunanDersAdedi+" adet ders bululundu.");
                    break;
                case 0:
                    System.out.println("UYGULAMADAN ÇIK"); break;
                default:
                    System.out.println("lütfen geçerli bir seçim yapınız.");
                    break;
            }
        }while (secim!=0);




    }// end method
}// end class