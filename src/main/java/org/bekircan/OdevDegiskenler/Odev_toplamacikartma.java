package org.bekircan.OdevDegiskenler;

import java.util.Scanner;

/**
 *   Değişkenler ile İlgili Alıştırmalar:
 *   Problem: Kullanıcıdan iki tamsayı alın ve bu sayıların toplamını, farkını, çarpımını ve bölümünü ekrana yazdıran bir program yazın.
  */

public class Odev_toplamacikartma {
    public static void main(String[] args) {

        int sayi1, sayi2;

        Scanner sc = new Scanner(System.in);
        System.out.println("1. tam sayıyı giriniz...: ");
        sayi1 = sc.nextInt();
        System.out.println("2. tam sayıyı giriniz...: ");
        sayi2 = sc.nextInt();
        System.out.println("---");
        System.out.println("Girilen 1. tam sayı.........: " + sayi1);
        System.out.println("Girilen 2. tam sayı.........: " + sayi2);
        System.out.println("---");
        System.out.println("Girilen sayıların toplamı...: " + (sayi1+sayi2));
        System.out.println("Girilen sayıların farkı.....: " + (sayi1-sayi2));
        System.out.println("Girilen sayıların çarpımı...: " + (sayi1*sayi2));
        System.out.println("Girilen sayıların bölümü....: " + (sayi1/sayi2));
    }
}