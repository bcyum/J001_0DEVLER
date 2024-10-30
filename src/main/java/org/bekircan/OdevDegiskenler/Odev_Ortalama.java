package org.bekircan.OdevDegiskenler;

import java.util.Scanner;
/**
 *  Problem: Bir öğrencinin sınav notlarını (vize ve final) kullanıcıdan alın,
 *  vize %40, final %60 etkili olacak şekilde ortalamayı hesaplayın.
 */
public class Odev_Ortalama {
    public static void main(String[] args) {
        int vize,fnal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen vize notunuzu giriniz...: ");
        vize = sc.nextInt();
        System.out.println("Lütfen final notunuzu giriniz...: ");
        fnal = sc.nextInt();
        System.out.println("Vize notunuz....: " + vize);
        System.out.println("Final notunuz...: " + fnal);
        System.out.println("Ortalamanız.....: " + ( (( vize*40) / 100) + ( (fnal*60)/ 100 )) );
    }
}
