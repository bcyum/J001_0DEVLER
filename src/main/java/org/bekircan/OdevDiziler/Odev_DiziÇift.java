package org.bekircan.OdevDiziler;

/**
 * * * Problem: 10 elemanlı bir dizide yalnızca çift sayıları ekrana yazdıran bir program yazın.
 */

import java.util.Scanner;

public class Odev_DiziÇift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sayiDizisi = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayiDizisi[i] = sc.nextInt();
        }
        System.out.println("Dizideki çift sayılar:");
        for (int sayi : sayiDizisi) {
            if (sayi % 2 == 0) {
                System.out.print(sayi + ", ");
            }
        }
    }
}
