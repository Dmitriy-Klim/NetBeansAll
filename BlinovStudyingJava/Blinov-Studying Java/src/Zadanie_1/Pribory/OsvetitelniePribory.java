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
public class OsvetitelniePribory extends Electropribory {
         private int m2=0;
         private int m3;
    
    public int getM2() {
        return m2;
    }
    public int getM3() {
        return m3;
    }
    
    public void setM2(int m2){
        this.m2 = m2;
    }
    public void setM3(int m3){
        this.m3 = m3;
    }
    
        public OsvetitelniePribory(String name, int kilovaty, boolean rozetka, int yarkost, int kollichastvolamp) {
            m3=kilovaty;
           System.out.println("Прибор "+ name+ " потребляет "+kilovaty+" ватт. И отдает "+yarkost+" Люменов, при наличии "+kollichastvolamp+" ламп.");
           
            if (rozetka==true) {
            System.out.println(name+" включен в розетку"); 
           m2=kilovaty;
            } 
           return; 
        }
        
    }
