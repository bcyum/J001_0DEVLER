package org.bekircan.OdevKosullar;
import java.util.Scanner;

/**
 *  * Problem: Kullanıcıdan bir tamsayı alın ve bu sayının çift mi, tek mi olduğunu belirleyin.
 */

public class Odev_TekCift {
    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        sayi = sc.nextInt();
        System.out.println("Girilen sayı...: " + sayi);

        if (sayi % 2 == 0) {
            System.out.println("Girilen sayı çifttir!");
        } else {
            System.out.println("Girilen Sayı Tek!");
        }
    }
}
