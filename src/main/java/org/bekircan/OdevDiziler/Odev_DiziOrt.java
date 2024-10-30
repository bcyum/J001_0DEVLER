package org.bekircan.OdevDiziler;

import java.util.Scanner;

/**
 *  * Problem: 5 elemanlı bir dizi oluşturun, kullanıcıdan elemanları alın ve bu dizinin ortalamasını hesaplayın.
 */

public class Odev_DiziOrt {
    public static void main(String[] args) {
        int diziBoyutu = 5;
        int[] sayiDizisi = new int[diziBoyutu];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < diziBoyutu ; i++) {
            System.out.print((i+1)+". sayıyı girin..: ");
            sayiDizisi[i] = sc.nextInt();
        }
        // ortalama için önce 5 değerin toplamına ihtyiacım var
        int toplam = 0;
        for (int i = 0; i < diziBoyutu ; i++) {
            toplam += sayiDizisi[i];
        }
        int ortalama = toplam / diziBoyutu;
        System.out.println("Girilen sayıların ortalaması " + ortalama);
    }
}
