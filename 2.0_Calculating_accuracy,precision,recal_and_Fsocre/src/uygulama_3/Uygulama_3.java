/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulama_3;

import java.util.Scanner;

/**
 *
 * @author ALPEREN
 */
public class Uygulama_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("TP Değerini giriniz: ");
        int Tp=scan.nextInt();
        System.out.print("TN Değerini giriniz: ");
        int Tn=scan.nextInt();
        System.out.print("FP Değerini giriniz: ");
        int Fp=scan.nextInt();
        System.out.print("FN Değerini giriniz: ");
        int Fn=scan.nextInt();
        System.out.println("");
        
        double dizi[]={Tp,Tn,Fp,Fn};
      
        performansHesapla(dizi);
        
        System.out.println("Doğruluk: "+dizi[0]);
        System.out.println("Kesinlik: "+dizi[1]);
        System.out.println("Hassasiyet: "+dizi[2]);
        System.out.println("F-Skor: "+dizi[3]);
    }
    public static double[] performansHesapla(double[] dizi) {
        double Dogruluk, Kesinlik, Hassasiyet, Fskor;
        
        Dogruluk=(dizi[0]+dizi[1])/(dizi[0]+dizi[1]+dizi[2]+dizi[3]);
        Kesinlik=(dizi[0])/(dizi[0]+dizi[2]);
        Hassasiyet=(dizi[0])/(dizi[0]+dizi[1]);
        Fskor=(2*Kesinlik*Hassasiyet)/(Kesinlik+Hassasiyet);
        
        dizi[0]=Dogruluk;
        dizi[1]=Hassasiyet;
        dizi[2]=Kesinlik;
        dizi[3]=Fskor; 
        return dizi;
    }
}
