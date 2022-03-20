    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekler3_dizilervemetodlar1;

/**
 *
 * @author ALPEREN
 */
public class Ornekler3_DizilerVeMetodlar1 {

    /**
     * @param args the command line arguments
     */
    /*
    Metod Örnek
• Elemanları 1,7 ve 13 olan bir tamsayı dizisi yaratın.
• Diziyazdir isimli bir metod yazıp, oluşturduğunuz dizinin
elemanlarını bu metod aracılığıyla ekrana yazdırın.
    */
    /*public static void main(String[] args) {
        int sayiDizisi[]={1,7,13};
        diziYazdir(sayiDizisi);
    }
    public static void diziYazdir(int[] dizi){
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Dizinin "+(i+1)+".nci elemanı: "+dizi[i]);
        }
    }
    */
    //2.Yöntem
    
    public static void main(String[] args) {
        int[] sayiDizisi= new int[3];
        sayiDizisi[0]=1;
        sayiDizisi[1]=7;
        sayiDizisi[2]=13;
        diziYazdir(sayiDizisi);
    }
    public static void diziYazdir(int[] dizi){
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Dizinin "+(i+1)+".nci elemanı: "+dizi[i]);
        }
    }
    
}
