package uygulama_1;

import java.util.Scanner;

public class Uygulama_1 {

    public static void main(String[] args) {

        int sayi;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayi Giriniz: ");
        sayi = scan.nextInt();

        int i = 1;
        String metin = "";
        while (sayi >= i) {
            metin = metin + i;
            System.out.println(metin);
            i++;
        }

        int j = 1, k = 0, m = 1;
        while (sayi >= j) {
            k = j;
            metin = "";
            while (sayi >= k) {
                metin = metin + m;
                m++;
                k++;
            }
            m = 1;
            System.out.println(metin);
            k = 0;
            j++;
        }
    }
}
