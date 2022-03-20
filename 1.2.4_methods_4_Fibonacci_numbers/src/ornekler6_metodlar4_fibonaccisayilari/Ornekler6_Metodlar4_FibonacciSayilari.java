/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekler6_metodlar4_fibonaccisayilari;

/**
 *
 * @author ALPEREN
 */
public class Ornekler6_Metodlar4_FibonacciSayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 15; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
        System.out.println("");
    }

    static int Fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
    
}
