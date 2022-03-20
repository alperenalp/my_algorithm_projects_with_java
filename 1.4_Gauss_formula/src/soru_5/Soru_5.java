
package soru_5;

import java.util.Scanner;

public class Soru_5 {

    public static void main(String[] args) {
        
        int i=1,girilensayi,toplam=0;
       
        Scanner deger = new Scanner(System.in);     
        System.out.print("Bir sayi giriniz: ");
        girilensayi=deger.nextInt();
        
        while(girilensayi>=i){
            System.out.println(i);
            toplam+=i;
            i++;
        }
        System.out.println("Tüm sayiların toplami: " + toplam );
    }
    
}
