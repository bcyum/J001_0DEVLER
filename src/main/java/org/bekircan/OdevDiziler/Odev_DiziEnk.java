package org.bekircan.OdevDiziler;

import java.util.Scanner;

/**
 * * Problem: Bir dizideki en küçük elemanı ve indeksini bulan bir program yazın.
 *
 */

public class Odev_DiziEnk {
    public static void main(String[] args) {

        int diziBoyutu = 5;
        int[] sayiDizisi = new int[diziBoyutu];
        Scanner sc = new Scanner(System.in);

        int eks ;
        for (int i = 0; i < diziBoyutu ; i++) {
            System.out.print((i + 1) + ". sayıyı girin..: ");
            sayiDizisi[i] = sc.nextInt();
        }
        int enKucuk = sayiDizisi[0];
        int enKucukIndex = 0;

        for (int i = 1; i < diziBoyutu; i++) {
            if (sayiDizisi[i] < enKucuk) {
                enKucuk = sayiDizisi[i];
                enKucukIndex = i;
            }
        }
        System.out.println("En küçük eleman: " + enKucuk);
        System.out.println("En küçük elemanın indeksi: " + enKucukIndex);
    }
}
