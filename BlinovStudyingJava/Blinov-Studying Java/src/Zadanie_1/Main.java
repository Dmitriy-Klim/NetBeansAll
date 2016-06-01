/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie_1;

import java.util.Arrays;



/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        int moshnost=0;
        int Arr[] = new int[4];
        
        System.out.println("1. Создание всех электроприборов");
        NagrevatelniePribory boiler = new NagrevatelniePribory("Бойлер", 2000, true, 50);
        NagrevatelniePribory kipyatilnik = new NagrevatelniePribory("Кипятильник", 3000, false, 10);
        OsvetitelniePribory lustra = new OsvetitelniePribory("Люстра", 75, true, 13, 3);
        OsvetitelniePribory nastolnayalampa = new OsvetitelniePribory("Настольная лампа", 60, false, 8, 1);
        System.out.println("");
        System.out.println("2. Определение суммарной потребляемой мощности");
        Electropribory el = new Electropribory();
        System.out.println("Общая мощьность: "+(moshnost=boiler.m1+kipyatilnik.m1+lustra.m2+nastolnayalampa.m2));
        System.out.println("");
        System.out.println("3.  Сотртировка приборов. От самого экономного до самого прожлрливого");
        Arr[0]=boiler.m3;
        Arr[1]=kipyatilnik.m3;
        Arr[3]=lustra.m3;
        Arr[3]=nastolnayalampa.m3;
        Arrays.sort(Arr);
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
            
        }
    }
}
