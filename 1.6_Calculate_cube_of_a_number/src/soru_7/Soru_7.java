
package soru_7;

import java.util.Scanner;

public class Soru_7 {

    public static void main(String[] args) {
        int sayi,i=1,kup=0;
        
        Scanner deger = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi=deger.nextInt();
        
        while(sayi>=i){
            kup=i*i*i;
            System.out.println(i+" sayisinin kubu= " + kup);
            i++;
        }
    }
    
}
