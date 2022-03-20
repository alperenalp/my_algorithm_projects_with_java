
package uygulama_1_v_1;

import java.util.Scanner;

public class Uygulama_1_v_1 {
 
    public static void main(String[] args) {
        Scanner deger=new Scanner(System.in);
        System.out.print("Lütfen Bir Sayi Giriniz: ");
        int sayi;
        sayi=deger.nextInt();
        
        int i=1,j=1,k=1;
        while(sayi>=i){
            j=sayi-i;
            while(sayi>j){
                System.out.print(k);
                k++;
                j++;
            }
            k=1;
            System.out.println("");
            i++;
        }
        
        int m=1,n=1,o=1;
        while(sayi>=m){
            n=m;
            while(sayi>=n){
                System.out.print(o);
                o++;
                n++;
            }
            o=1;
            
            System.out.println("");
            
            m++;
        }
        
        
    }
    
}
