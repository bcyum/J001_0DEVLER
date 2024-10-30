package org.bekircan.OdevKosullar;

import java.util.Scanner;

/**
 *  * Problem: Kullanıcıdan bir ay ismi alın ve
 *  * o ayın kaç gün çektiğini ekrana yazdıran bir program yazın (şubat için 28 varsayılabilir).
 */
public class Odev_Aylar {
    public static void main(String[] args) {
        System.out.println("""
                Aylar;
                1 - Ocak
                2 - Şubat
                3 - Mart
                4 - Nisan
                5 - Mayıs
                6 - Haziran
                7 - Temmuz
                8 - Ağustos
                9 - Eylül
                10 - Ekim
                11 - Kasım
                12 - Aralık
                """);
        int ay;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Seçiniz (1-12).: ");
        ay = sc.nextInt();
    switch (ay) {
        case 1,3,5,7,8,10,12:
            System.out.println("Seçilen ay 31 günden oluşur");
            break;
        case 4,6,9,11:
            System.out.println("Seçilen ay 30 günden oluşur");
            break;
        case 2:
            System.out.println("Seçilen ay 28 günden oluşur");
            break;
        default:
            System.out.println("Geçerli seçim yapınız!");
        }
    }
}

//ocak1 mart3 mayıs5 temmuz7 ağustos8 ekim10 aralık 31
//nisan4 haziran6 eylül9 kasım 30
//şubat2 28