/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru_3;
import java.util.Scanner;
/**
 *
 * @author ALPEREN
 */
public class Soru_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sayi;
        Scanner deger = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        sayi=deger.nextInt();
        if (sayi<0) {
            System.out.println("Sayınız negatif sayıdır");
        }
        else if (sayi>0) {
            System.out.println("Sayınız pozitif sayıdır");
        }
        else{
            System.out.println("Sayınız nötr sayıdır");
        }
    }
}
