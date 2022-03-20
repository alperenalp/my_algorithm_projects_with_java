
package soru_6;

import java.util.Scanner;

public class Soru_6 {

    public static void main(String[] args) {
        int sayi1,i=1;
        double toplam=0,ortalama;
        
        Scanner deger = new Scanner(System.in);  
   
        while(i<=5){
            System.out.print(i+". sayiyi giriniz: ");
            sayi1=deger.nextInt();
            toplam=toplam+sayi1;    
            i++;
        }
        ortalama=toplam/5;
        System.out.println("Sayiların toplami: "+ toplam);
        System.out.print("Sayiların ortalamasi: "+ ortalama +"   ");  
        
    }
    
}
