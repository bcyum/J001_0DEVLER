package org.bekircan.OdevDegiskenler;
import java.util.Scanner;
/**
 *  * Problem: Kullanıcıdan bir ürünün fiyatını alın ve %18 KDV eklenmiş halini ekrana yazdıran bir program yazın.
 */
public class Odev_KDV {
    public static void main(String[] args) {
        int fiyat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen KDV Hariç fiyatı giriniz...: ");
        fiyat = sc.nextInt();
        System.out.println("KDV Hariç fiyat...: " + fiyat);
        System.out.println("KDV Dahil fiyat...: " + (((fiyat*18)/100) + fiyat  ));
    }
}
