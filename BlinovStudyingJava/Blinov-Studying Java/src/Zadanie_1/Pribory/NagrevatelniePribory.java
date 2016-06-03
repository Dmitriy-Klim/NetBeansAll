/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie_1.Pribory;


/**
 *
 * @author Admin
 */
public class NagrevatelniePribory extends Electropribory {
    private int m1=0;
    private int m3;
    
    public int getM1() {
        return m1;
    }
    public int getM3() {
        return m3;
    }
    
    public void setM1(int m1){
        this.m1 = m1;
    }
    public void setM3(int m3){
        this.m3 = m3;
    }
    
        public NagrevatelniePribory (String name, int kilovaty, boolean rozetka, int litry) {
            m3=kilovaty;
            System.out.println("Прибор "+ name+ " потребляет "+kilovaty+" ватт, на "+litry+" литров");
            if (rozetka==true) {
                System.out.println(name+" включен в розетку");
                m1=kilovaty;
            }
            return ;
        }
}