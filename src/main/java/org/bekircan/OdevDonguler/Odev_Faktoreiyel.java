package org.bekircan.OdevDonguler;

import java.util.Scanner;

/**
 *  * Problem: Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayın.
 */
public class Odev_Faktoreiyel {
    public static void main(String[] args) {
        int sayi;
        int faktoriyel = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz..: ");
        sayi = sc.nextInt();

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i; // faktoriyel = faktoriyel * i;
        }

        System.out.println(sayi + "! = " + faktoriyel);
    }
}