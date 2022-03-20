package uygulama_2;

import java.util.Scanner;

public class Uygulama_2 {

    public static void main(String[] args) {
        int[] dizi = {1, 1, 0, 1, 0, 1, 1, 0, 1, 0};
        int taban = 2, sonuc = 0, üs = 1;
        Scanner scan = new Scanner(System.in);
        while (taban > 1 && taban < 11) {
            System.out.print("Taban degerini giriniz: ");
            taban = scan.nextInt();
            for (int i = 9; i >= 0; i--) {
                sonuc = sonuc + (dizi[i] * üs);
                üs = üs * taban;
            }
            üs = 1;
            if (taban > 1 && taban < 11) {
                System.out.println(sonuc);
            }
            sonuc = 0;
        }
        System.out.println("Program Sonlandırıldı:");
    }
}
