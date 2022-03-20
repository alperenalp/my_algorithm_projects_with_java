/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekler1_diziler1;

/**
 *
 * @author ALPEREN
 */
public class Ornekler1_Diziler1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1.ÖRNEK 
        int sayilar[]={1,2,3,4};
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Dizinin "+(i+1)+".nci elemanı: "+ sayilar[i]);
        }
        System.out.println("");
        
        // 2.ÖRNEK
        //1.yöntem
        /*int sayilar[]={1,2,3,4};
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Dizinin "+(i+1)+".nci elemanı: "+ (5*sayilar[i]));
        }*/
        
        //2.Yöntem
        int[] sayilar2= new int[4];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar2[i]=(i+1)*5;
        }
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Yeni dizinin "+(i+1)+".nci elemanı: "+ sayilar2[i]);
        }
        System.out.print("\n");  //Bir alt satır daha oluşturmanın yöntemi \n dir.
        
        // 3.ÖRNEK
        String ilceler[]={"Cankaya","Kadıköy","Zile"};
        for (int i = 0; i < ilceler.length; i++) {
            System.out.println("Dizimizin "+(i+1)+".nci elemanı: "+ilceler[i]);
        }
        
        // 4.ÖRNEK
        for (int i = 0; i < ilceler.length; i++) {
            switch(i){
                case 0:
                    System.out.println("Ankara");
                    break;
                case 1:
                    System.out.println("İstanbul");
                    break;
                case 2:
                    System.out.println("Tokat");
                    break;
                default:
                    break;
            }   
        }
    }
}
