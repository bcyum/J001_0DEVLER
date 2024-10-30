package org.bekircan.OdevDegiskenler;

import java.util.Scanner;

/**
 *  * Problem: Kullanıcıdan bir cümle alın ve cümlenin karakter sayısını ekrana yazdıran bir program yazın.
 */

public class Odev_KarakterSayisi {
    public static void main(String[] args) {

        String cumle;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cümle yazınız...: ");
        cumle = sc.nextLine();

        System.out.println("Girilen cümle ve cümledeki karakter sayısı..: " + cumle + " - " + cumle.length());
    }
}

