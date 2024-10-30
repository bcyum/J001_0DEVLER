package org.bekircan.OdevDonguler;

import java.util.Scanner;

/**
 *
 *  * Problem: Kullanıcıdan bir sayı alın ve bu sayının asal olup olmadığını kontrol eden bir program yazın.
 *   --------------
 */

public class Odev_AsalSayi {
    public static void main(String[] args) {

        int sayi;
        boolean asal = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz...: ");
        sayi = sc.nextInt();

        if (sayi <= 1) {
            System.out.println("Sayı asal değil");
        } else if (sayi == 2) {
            System.out.println("Sayı asal sayıdır.");
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.println("Asaldır.");
            } else {
                System.out.println("Asal değil.");
            }
        }
    }
}
