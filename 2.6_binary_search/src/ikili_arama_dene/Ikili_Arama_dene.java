/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikili_arama_dene;

import java.util.*;

/**
 *
 * @author Alperen
 */
public class Ikili_Arama_dene {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("dizi boyutu girin");
        int boyut=klavye.nextInt();
        int[] dizi= new int[boyut];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=rnd.nextInt(10);
        }
        Arrays.sort(dizi); // diziyi sıraladı. ikili arama sıralamadan bulamaz
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizinin "+(i)+". indisindeki elamanı: "+dizi[i]);
        }
        System.out.println("aranacak değeri girin");
        int aranan = klavye.nextInt();
        int altIndis =0;
        int ustIndis = boyut-1;
        Boolean durum= true;
        while (ustIndis>=altIndis) {
            int ortanca = altIndis + (ustIndis - altIndis)/2;
            if (dizi[ortanca]<aranan) {
                altIndis = ortanca +1;
            }
            if (dizi[ortanca]>aranan) {
                ustIndis = ortanca -1;
            }
            if (dizi[ortanca]==aranan) {
                System.out.println("aranan sayı "+(ortanca)+". indisde bulundu");
                durum = false;
                break;
            }
        }
        if (durum) {
            System.out.println("sayı bulunamadı");
        }
    }
    
}
