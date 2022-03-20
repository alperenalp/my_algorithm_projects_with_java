
package vize1_soru1;

import java.util.Scanner;

public class Vize1_Soru1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diziBoyutu;
        System.out.print("Lütfen dizi boyutunu giriniz: ");
        diziBoyutu = scan.nextInt();
        int[] dizi = new int[diziBoyutu];
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Lütfen dizinin " + (i + 1) + ". değerini giriniz: ");
            dizi[i] = scan.nextInt();
        }

        System.out.println("Girmiş olduğunuz dizi elemanları: ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi[" + i + "]= " + dizi[i]);
        }

        int eklenecekDeger, eklenecekYer;
        System.out.print("Diziye eklenecek değeri giriniz: ");
        eklenecekDeger = scan.nextInt();
        System.out.print("Bu değer dizinin hangi indisine eklensin?: ");
        eklenecekYer = scan.nextInt();
        int[] yeniDizi = new int[diziBoyutu + 1];
        int i = 0;
        for (int j = 0; j < yeniDizi.length; j++) {
            if (eklenecekYer == j) {
                yeniDizi[j] = eklenecekDeger;
            } 
            else {
                yeniDizi[j] = dizi[i];
                i++;
            }
        }
        System.out.println("");
        System.out.println("Eklemeden sonra dizinin elemanları: \n");
        for (int j = 0; j < yeniDizi.length; j++) {
            System.out.println("dizi[" + j + "]= " + yeniDizi[j]);
        }
    }

}
