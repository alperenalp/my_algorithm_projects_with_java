
package soru_8;

import java.util.Scanner;

public class Soru_8 {

    public static void main(String[] args) {

        int sayi,tek=1,toplam=0,i=1;
        
        Scanner deger = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi=deger.nextInt();
        
        System.out.println("Beş Adet oluşturulan Tek sayilar: ");
        
        while(sayi>=i){ 
            System.out.println(tek);
            toplam=toplam+tek;
            tek=2*i+1;
            i++;  
        }
        System.out.println("Tum sayiların toplami= " +toplam);
        
    }
    
}
