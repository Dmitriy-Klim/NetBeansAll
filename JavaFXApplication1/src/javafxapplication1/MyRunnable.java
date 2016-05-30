/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author Admin
 */
public class MyRunnable implements Runnable {
   public void run() {
      // некоторое долгое действие, вычисление
      long sum=0;
      for (int i=0; i<1000; i++) {
         sum+=i;
      }
      System.out.println(sum);
   }
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
Thread t = new Thread(r);
t.start();
    }
}
