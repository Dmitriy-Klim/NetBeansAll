/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blinov.studying.java;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class BlinovStudyingJava {

    /**
     * @param args the command line arguments
     * Тут создается метод, который выводит на консоль строку.
     */
    public static void printcons() {
        System.out.println("Hello class world");
    }
    /**
     * Создание класса, который вовыодит строку на консоль.
     */
    public static class printclass {
        public void prn() {
            System.out.println("Some thind to print on console");
        }
    }
    public static class anyprint extends printclass {
        private void prn2() {
                System.out.println("String from extends class");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        printcons();
     /**
     * 
     * Создание объекта класса.
     */
        printclass p = new printclass();
        anyprint p2 = new anyprint();
     /**
     * Обращение к методу объекта. 
     * В обэекте p2 созданном от класса anyprint который наслудуется от класса 
     * printclass 2 метода. Метод prn унаследованный и метод prn2 свой. 
     * Метод prn можно унаследовать, т.к. от имеет статус public. Методы с 
     * private не наследуются.
     */
        p2.prn2();
        p2.prn();
     /**
     * 
     * Обращение к методу объекта
     */
        try {
            p.prn();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }
    
}
