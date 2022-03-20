/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekler5_dizilervemetodlar2;

/**
 *
 * @author ALPEREN
 */
public class Ornekler5_DizilerVeMetodlar2 {

    /**
     * @param args the command line arguments
     */
    double[] d;
    String[] s;
    
    public Ornekler5_DizilerVeMetodlar2() {
        //double tipindeki dizimize eleman atıyoruz
        d=new double[5];
        d[0]=0.1;
        d[1]=1.2;
        d[2]=2.3;
        d[3]=3.4;
        d[4]=4.5;
        // d[5] =5.6;  // HATA!!! Zaten 5 tane eleman yazdık.
        
        //String tipindeki dizimize elelman atyoruz.
        s= new String[5];
        s[0]=("Defter");
        s[1]=("Kalem");
        s[2]=("Silgi");
        s[3]=("Çinti");
        s[4]=("Cetvel");
        
    }
    
    public void ekranaBas(){
        //double tipindeki dizimizi ekrana bastırıyoruz.
        for (int i = 0; i < d.length; i++) {
            System.out.println("d["+i+"] = " + d[i]);
            
        }
        System.out.println("-------------------------");
        //String tipindeki dizimizi ekrana bastırıyoruz.
        for (int j = 0; j < s.length; j++) {
            System.out.println("s["+j+"] = " + s[j]);
        }
        
    }
    
    public static void main(String args[]){
        Ornekler5_DizilerVeMetodlar2 deg = new Ornekler5_DizilerVeMetodlar2();
        deg.ekranaBas();
    }
    
}
