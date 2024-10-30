package org.bekircan.OdevDiziler;

import java.util.Scanner;

/**
 * * Problem: Bir dizi oluşturun ve dizideki elemanları küçükten büyüğe sıralayan bir program yazın.
 */

public class Odev_DiziSıralama {
    public static void main(String[] args) {
        int diziBoyutu = 5;
        int[] sayiDizisi = new int[diziBoyutu];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < diziBoyutu; i++) {
            System.out.print((i + 1) + ". sayıyı girin..: ");
            sayiDizisi[i] = sc.nextInt();
        }
            for (int i = 0; i < diziBoyutu - 1; i++) {
                for (int j = 0; j < diziBoyutu - 1 - i; j++) {
                    if (sayiDizisi[j] > sayiDizisi[j + 1]) {
                        int temp = sayiDizisi[j];
                        sayiDizisi[j] = sayiDizisi[j + 1];
                        sayiDizisi[j + 1] = temp;
                    }
                }
            }
        System.out.println("Sıralı dizi: ");
        for (int sayi : sayiDizisi) {
            System.out.print(sayi + " ");
            }
        }
    }

