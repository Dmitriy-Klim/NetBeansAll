/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_1.activities;

import Task_1.Devices.Boiler;
import Task_1.Room.Room;
import Task_1.Devices.ElectricalDevices;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Activities {
    private int summPower = 0;
    
    public int getSummPower() {
        return summPower;
    }
    public void setSummPower(int power){
        summPower = summPower+power;
    }
     
    public void findDevice(int boiler, int frige, int hairdryer, int tv) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите мощьность прибора:  ");
        int a = in.nextInt();
        
        if (a==boiler){System.out.println("Бойлер");}
        if (a==frige){System.out.println("Холодильник");}
        if (a==hairdryer){System.out.println("Фен");}
        if (a==tv){System.out.println("Телевизор");}  
        else {System.out.println("Такого прибора нет");}
    }
    
    }