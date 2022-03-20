
package vize1_soru2;

import java.util.Scanner;

public class Vize1_Soru2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        boolean kosul= true;
        while (kosul) {
            System.out.print("Lütfen 10'luk tabandaki sayıyı giriniz: ");
            sayi = scan.nextInt();
            int sonuc = TabanBul(sayi);
            if (sayi== -1) {
                kosul = false;
            }
            if (kosul) {
                System.out.println("İkilik tabandaki karşılığı= " + sonuc);
            }
        }
    }

    public static int TabanBul(int sayi) {
        if (sayi== 0) {
            return 0;
        } 
        else {
            return sayi % 2 + (10 *TabanBul(sayi / 2));
        }
    }

}
/*
1.tur sayi%2+(10*f(6))
2.tur sayi%2+(10*f(3))
3.tur sayi%2+(10*f(1))
4.tur sayi%2+(10*f(0))

5.tur                  <--- f(0)=0; 
4.tur 1+(10*0)=1 --->        f(1)=1;
3.tur 1+(10*1)=11 --->       f(3)=11;
2.tur 0+(10*11)=110 --->     f(6)=110;
1.tur 0+(10*110)=1100 --->>   sonuc=1100
*/