package org.bekircan.OdevKosullar;

import java.util.Scanner;

/**
 *  * Problem: Kullanıcıdan üç sayı alın ve en büyüğünü ekrana yazdırın.
 */

public class Odev_Enbuyuk {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3, enb;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz..: ");
        sayi1 = sc.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz..: ");
        sayi2 = sc.nextInt();
        System.out.print("Lütfen 3. sayıyı giriniz..: ");
        sayi3 = sc.nextInt();
        System.out.println("1. sayı..: " +sayi1);
        System.out.println("2. sayı..: " +sayi2);
        System.out.println("3. sayı..: " +sayi3);
        if (sayi1 >= sayi2 && sayi1 >= sayi3){
            enb = sayi1;
        } else if (sayi2>=sayi1 && sayi2>=sayi3){
            enb = sayi2;
        }else{
            enb = sayi3;
        }
      System.out.println("3 sayının en büyüğü...: " + enb);
    }
}
