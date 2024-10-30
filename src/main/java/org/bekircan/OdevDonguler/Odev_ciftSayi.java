package org.bekircan.OdevDonguler;

import java.util.Scanner;

/**
 *  * Problem: Kullanıcıdan bir sayı alın ve bu sayıya kadar olan çift sayıları ekrana yazdıran bir program yazın.
 */


public class Odev_ciftSayi {
    public static void main(String[] args) {

        int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz...: ");
        sayi = sc.nextInt();

        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
    }
}
