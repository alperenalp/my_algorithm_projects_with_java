/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru_2;
import java.util.Scanner;
/**
 *
 * @author ALPEREN
 */
public class Soru_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int gunler;
        Scanner deger = new Scanner(System.in);
        System.out.print("1 ile 7 arasinda bir sayi giriniz:");
        gunler=deger.nextInt(); //disaridan girilen degeri int olarak degiskene atadım
        switch(gunler)
        {
            case 1: // eger gunler 1 ise komut calısacak
                System.out.println("Pazartesi");
                break; //komut 1'e girerse print calistiktan sonra duracak
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçersiz bir sayi girdiniz");
            
        }         
    }  
}
