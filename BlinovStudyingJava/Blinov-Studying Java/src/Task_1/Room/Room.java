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
    private int power=0;
    
    public int getMoshnost() {
        return power;
        }
    
    public void setMoshnost(int power) {
        this.power = power;
    }
    
    public void room() {
        System.out.println("1. Создание всех электроприборов");
        
        Activities activ = new Activities();
        
        HeatingDevices boiler = new HeatingDevices("Бойлер", 2000, true, 50);
        HeatingDevices kettle = new HeatingDevices("Кипятильник", 3000, false, 10);
        LightingDevices chandelier = new LightingDevices("Люстра", 75, true, 13, 3);
        LightingDevices tableLamp = new LightingDevices("Настольная лампа", 60, false, 8, 1);
        System.out.println("");
        
        activ.powerCount(boiler.getM3());
        activ.powerCount(chandelier.getM3());
        activ.powerCount(kettle.getM3());
        activ.powerCount(tableLamp.getM3());
        activ.result();
       }
}
