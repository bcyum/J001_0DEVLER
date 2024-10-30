package org.bekircan.OdevDiziler;

import java.util.Scanner;
/**
 *  * Problem: Kullanıcıdan bir dizi alın ve dizide tekrar eden elemanları bulun.
 */

public class Odev_DiziTekrarEden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi boyutunu girin: ");
        int diziBoyutu = sc.nextInt();
        int[] sayiDizisi = new int[diziBoyutu];

        for (int i = 0; i < diziBoyutu; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayiDizisi[i] = sc.nextInt();
        }
        System.out.println("Dizide tekrar eden elemanlar:");

        for (int i = 0; i < diziBoyutu; i++) {
            boolean tekrarVar = false;
            for (int j = 0; j < i; j++) {
                if (sayiDizisi[i] == sayiDizisi[j]) {
                    tekrarVar = true;
                    break;
                }
            }
            if (tekrarVar) {
                System.out.print(sayiDizisi[i]);
            }
        }
    }
}
