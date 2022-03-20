/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekler2_metodlar1;

/**
 *
 * @author ALPEREN
 */
public class Ornekler2_Metodlar1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.ÖRNEK
        int n;
        n=karesiniBul(9);
        System.out.println("Karesi= "+ n);
        System.out.println("");
    }
    static int karesiniBul(int x){
        int y;
        y=x*x;
        return y;
    }
}
