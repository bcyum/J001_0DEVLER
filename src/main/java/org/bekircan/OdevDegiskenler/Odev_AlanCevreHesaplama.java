package org.bekircan.OdevDegiskenler;
import java.util.Scanner;

/**
 *  * Problem: Kullanıcıdan yarıçapı alınan bir dairenin alanını ve çevresini
 *  * hesaplayan bir program yazın (alan = π * r^2, çevre = 2 * π * r).
 */

public class Odev_AlanCevreHesaplama {
    public static void main(String[] args) {
        int yaricap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını giriniz...: ");
        yaricap = sc.nextInt();
        System.out.println("Dairenin yarıçapı...: " + yaricap);

        System.out.println("Dairenin alanı......: " + 2 * Math.PI * yaricap*yaricap );
        System.out.println("Dairenin alanı......: " + 2 * Math.PI * yaricap);
    }
}
