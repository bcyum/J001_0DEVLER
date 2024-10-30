package org.bekircan.OdevKosullar;

import java.util.Scanner;

/**
 *  * Problem: Kullanıcıdan doğum yılını alın ve 18 yaşından
 *  * büyük olup olmadığını kontrol edin. Büyükse "Reşit", değilse "Reşit değil" yazdırın.
 */

public class Odev_Resit {
    public static void main(String[] args) {
        int dyil, yas;
        System.out.print("Doğum yılınızı giriniz...: ");
        Scanner sc = new Scanner(System.in);
        dyil = sc.nextInt();
        yas = 2024 - dyil;
        System.out.println("Yaşınız...: " + yas);
        if(yas >= 18){
            System.out.println("Kullanıcı Reşit");
        }else{
            System.out.println("Kullanıcı Reşit Değil!");
        }
    }
}
