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
public class Zadanie_1 {
    
//    Класс, описывающий свойства объекта характерные для всех классов-наследников
    class Electropribory {
        String name;
        int kilovaty;
        boolean rozetka; 
    }
//    Класс нагревательных приборов (Плита и кипятильник)
    static class NagrevatelniePribory extends Electropribory {
        public NagrevatelniePribory (String name, int kilovaty, boolean rozetka, int litry) {
            System.out.println("Прибор "+ name+ " потребляет "+kilovaty+" ватт, на "+litry+" литров");
            if (rozetka==true) {
                System.out.println(name+" включен в розетку");    
            }
            return ;
        }
    }
//    Класс осветительные приборы
    static class OsvetitelniePribory extends Electropribory {

        public OsvetitelniePribory(String name, int kilovaty, boolean rozetka, int yarkost, int kollichastvolamp) {
           System.out.println("Прибор "+ name+ " потребляет "+kilovaty+" ватт. И отдает "+yarkost+" Люменов, при наличии "+kollichastvolamp+" ламп.");
           
            if (rozetka==true) {
            System.out.println(name+" включен в розетку");    
            } 
           return; 
        }
        
    }
    public static void main(String[] args) {
        
//        Создаем приборы
        NagrevatelniePribory boiler = new NagrevatelniePribory("Бойлер", 2000, true, 50);
        NagrevatelniePribory kipyatilnik = new NagrevatelniePribory("Кипятильник", 3000, false, 10);
        OsvetitelniePribory lustra = new OsvetitelniePribory("Люстра", 75, true, 13, 3);
        OsvetitelniePribory nastolnayalampa = new OsvetitelniePribory("Настольная лампа", 60, false, 8, 1);
        
        
    }
}
