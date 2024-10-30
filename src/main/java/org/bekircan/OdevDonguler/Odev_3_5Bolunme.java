package org.bekircan.OdevDonguler;

/**+
 *  Problem: 1’den 100’e kadar olan sayılar içinde 3 ve 5 ile bölünebilen sayıları ekrana yazdırın.
 */


public class Odev_3_5Bolunme {
    public static void main(String[] args) {

        System.out.println("1'den 100'e kadar 3 ve 5 ile bölünebilen sayılar: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + "  ");
            }
        }
    }
}
