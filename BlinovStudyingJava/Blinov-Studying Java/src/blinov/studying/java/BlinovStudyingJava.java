/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blinov.studying.java;

/**
 *
 * @author Admin
 */
public class BlinovStudyingJava {

    /**
     * @param args the command line arguments
     */
    public static void printcons() {
        System.out.println("Hello class world");
    }
    public static class printclass {
        private void prn() {
            System.out.println("Some thind to print on console");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        printcons();
        printclass p = new printclass();
        p.prn();
    }
    
}
