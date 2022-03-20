
package soru_4;

import java.util.Scanner;

public class Soru_4 {

    public static void main(String[] args) {
        
       int sayi1,sayi2,sayi3;
       
        Scanner deger = new Scanner(System.in);     
        System.out.print("Birinci sayiyi giriniz:");
        sayi1=deger.nextInt();
        System.out.print("İkinci sayiyi giriniz: ");
        sayi2=deger.nextInt();
        System.out.print("Üçüncü sayiyi giriniz: ");
        sayi3=deger.nextInt();

        
        if (sayi1>=sayi2 && sayi1>=sayi3) {
            System.out.println("En büyük sayi: " + sayi1);
        }
        else if (sayi2>=sayi1 && sayi2>=sayi3) {
            System.out.println("En büyük sayi: " + sayi2);    
        }
        else if (sayi3>=sayi1 && sayi3>=sayi2) {
            System.out.println("En büyük sayi: " + sayi3);
        }
        
        if(sayi1==sayi2 && sayi1==sayi3){
            System.out.println("Tüm sayilar birbirine esittir");
        }
        else if (sayi1==sayi2) {
            System.out.println("Birinci sayiyla İkinci sayi esittir");
        }
        else if (sayi1==sayi3) {
            System.out.println("Birinci sayiyla Üçüncü sayi esittir");
        }
        else if (sayi2==sayi3) {
            System.out.println("İkinci sayiyla Üçüncü sayi esittir");
        }
    }
    
}
