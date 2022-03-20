/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekler2_metodlar2;

/**
 *
 * @author ALPEREN
 */
public class Ornekler2_Metodlar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sonuc,sayi1=5,sayi2=10;
        sonuc=toplamBul(sayi1,sayi2);
        System.out.println("Toplamı= "+ sonuc);
    }
    static int toplamBul(int a, int b) {
        int toplam;
        toplam=a+b;
        return toplam;
    }
    
    /*Ufak bi değişikle bu da olabilirdi.
    public static void main(String[] args) {
        int sonuc;
        sonuc=toplamBul(5,10);
        System.out.println("Toplamı= "+ sonuc);
    }
    static int toplamBul(int a, int b) {
        int toplam;
        toplam=a+b;
        return toplam;
    }
    */
    
}
