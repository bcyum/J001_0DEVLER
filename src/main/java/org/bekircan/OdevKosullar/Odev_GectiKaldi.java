package org.bekircan.OdevKosullar;

import java.util.Scanner;

/**
 *  * Problem: Bir öğrencinin notunu (0-100 arası) kullanıcıdan alın ve 50’den büyükse “Geçti”, küçükse “Kaldı” şeklinde sonuç yazdırın.
 */

public class Odev_GectiKaldi {
    public static void main(String[] args) {
        int not;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Notunuzu giriniz (0-100)...: ");
        not = sc.nextInt();
        System.out.println("Öğrencinin notu..: " + not);
        if (not >= 50) {
            System.out.println("GEÇTİ");
        }else{
            System.out.println("KALDI");
        }
    }
}
