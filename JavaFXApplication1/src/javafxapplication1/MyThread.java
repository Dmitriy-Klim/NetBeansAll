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
public class MyThread extends Thread {
   public void run() {
      // некоторое долгое действие, вычисление
      long sum=0;
      for (int i=0; i<1000; i++) {
         sum+=i;
      }
      System.out.println(sum);
   }
    public static void main(String[] args) {
       MyThread t = new MyThread(); //Создаём объект класса
        t.start();  //Вызываем метод класса
                    //start - унаследованный метод
    }
}
