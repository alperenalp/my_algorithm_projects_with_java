/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru_1;

import java.util.Scanner;

/**
 *
 * @author ALPEREN
 */
public class Soru_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int puan; // Değişken atadım
        Scanner deger = new Scanner(System.in); //dışarıdan deger girmek için scanner çağırdım
        System.out.print("Bir sayı giriniz:");
        puan=deger.nextInt(); // girilen değeri int olarak değişkene atadım
        
        if (puan>100) 
        {
            System.out.println("Geçersiz bir puan girdiniz");
        }
        else if(puan>=90)
        {
            System.out.println("A");
        }
        else if(puan>=80)
        {
            System.out.println("B");
        }
        else if(puan>=70)
        {
            System.out.println("C");
        }
        else if(puan>=60)
        {
            System.out.println("D");
        }
        else if(puan>=0)
        {
            System.out.println("F");
        }
        else{
            System.out.println("Geçersiz bir puan girdiniz");
        }
    }
    
}
