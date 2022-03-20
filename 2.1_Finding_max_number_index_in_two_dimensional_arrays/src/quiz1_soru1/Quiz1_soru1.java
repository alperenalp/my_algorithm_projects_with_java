/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1_soru1;

import java.util.Scanner;

/**
 *
 * @author ALPEREN
 */
public class Quiz1_soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j, satır, sutun, indis1 = 0, indis2 = 0, indis3 = 0, indis4 = 0;
        double ortalama, toplam = 0, enküçük = 10000, enbüyük = 0;
        Scanner deger = new Scanner(System.in);
        System.out.println("Satır sayısı giriniz:");
        satır = deger.nextInt();
        System.out.println("Sutün sayısı giriniz:");
        sutun = deger.nextInt();
        int[][] diziler = new int[satır][sutun];
        for (i = 0; i < satır; i++) {
            for (j = 0; j < sutun; j++) {
                System.out.println("diziler" + "[" + i + "]" + "[" + j + "]" + " degerini giriniz");
                diziler[i][j] = deger.nextInt();
                toplam = toplam + diziler[i][j];
                if (enbüyük < diziler[i][j]) {
                    enbüyük = diziler[i][j];
                    indis1 = i;
                    indis2 = j;
                }
                if (enküçük > diziler[i][j]) {
                    enküçük = diziler[i][j];
                    indis3 = i;
                    indis4 = j;
                }
            }
        }
        for (i = 0; i < satır; i++) {
            for (j = 0; j < sutun; j++) {
                System.out.print(diziler[i][j] + " ");

            }
            System.out.println("");
        }
        ortalama = (double) (toplam / (satır * sutun));
        System.out.println(ortalama);
        System.out.println(enbüyük + "indis" + "[" + indis1 + "]" + "[" + indis2 + "]");
        System.out.println(enküçük + "indis" + "[" + indis3 + "]" + "[" + indis4 + "]");
    }

}
