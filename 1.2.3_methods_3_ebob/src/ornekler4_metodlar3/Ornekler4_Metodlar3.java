/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekler4_metodlar3;

import java.util.Scanner;

/**
 *
 * @author ALPEREN
 */
public class Ornekler4_Metodlar3 {

    /**
     * @param args the command line arguments
     */
    
    // Girilen iki sayının ebobunu bulan program
    static int ebobBul(int sayi1, int sayi2) {
        int degistir;
        while (sayi1 % sayi2 != 0) {
            degistir = sayi1 % sayi2;
            sayi1 = sayi2;
            sayi2 = degistir;
        }
        return sayi2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ebob u hesaplanacak 1.sayıyı giriniz.");
        int sayi1 = sc.nextInt();
        System.out.println("Ebob u hesaplanacak 2.sayıyı giriniz .");
        int sayi2 = sc.nextInt();
        System.out.println("Ebob u hesaplanacak 3.sayıyı giriniz.");
        int sayi3 = sc.nextInt();
        System.out.println("Bu sayıların EBOBu:" + ebobBul(ebobBul(sayi1, sayi2), sayi3));
    }
    
}
