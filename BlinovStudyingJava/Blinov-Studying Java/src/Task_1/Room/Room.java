/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_1.Room;

import Task_1.Devices.HeatingDevices;
import Task_1.Devices.LightingDevices;
import Task_1.activities.Activities;

/**
 *
 * @author Admin
 */
public class Room {
    private int moshnost=0;
    
    public int getMoshnost() {
        return moshnost;
        }
    
    public void setMoshnost(int moshnost) {
        this.moshnost = moshnost;
    }
    
    public void room() {
        System.out.println("1. Создание всех электроприборов");
        
        Object[] arr = new Object[4];
        
        HeatingDevices boiler = new HeatingDevices("Бойлер", 2000, true, 50);
        HeatingDevices kipyatilnik = new HeatingDevices("Кипятильник", 3000, false, 10);
        LightingDevices lustra = new LightingDevices("Люстра", 75, true, 13, 3);
        LightingDevices nastolnayalampa = new LightingDevices("Настольная лампа", 60, false, 8, 1);
        System.out.println("");
        
        //Activities activ = new Activities();
        System.out.println(boiler.getKilovaty());
        System.out.println(kipyatilnik.getKilovaty());
        System.out.println(lustra.getKilovaty());
        System.out.println(nastolnayalampa.getKilovaty());
        
        arr[0] = boiler.getKilovaty();
        arr[1] = kipyatilnik.getKilovaty();
        arr[2] = lustra.getKilovaty();
        arr[3] = nastolnayalampa.getKilovaty();
        
        
           
        //activ.activities(boiler.getKilovaty());
       // activ.activities(kipyatilnik.getKilovaty());
        //activ.activities(lustra.getKilovaty());
        //activ.activities(nastolnayalampa.getKilovaty());
    }
    
}
