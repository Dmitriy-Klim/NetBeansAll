/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie_1;


/**
 *
 * @author Admin
 */
class NagrevatelniePribory extends Electropribory {
    public int m1=0;
    public int m3;
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