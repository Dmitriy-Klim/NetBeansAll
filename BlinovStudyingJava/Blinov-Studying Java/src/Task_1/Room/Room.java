/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_1.Room;

import Task_1.Devices.Boiler;
import Task_1.Devices.ElectricalDevices;
import Task_1.activities.Activities;
import Task_1.Devices.Frige;
import java.util.ArrayList;
import Task_1.Devices.Hairdryer;
import Task_1.Devices.Tv;

/**
 *
 * @author Admin
 */
public class Room<Devices> {        

    ArrayList<? super Devices> allDevices = new ArrayList<Devices>();
  
    public void setAllDevices(ArrayList<Devices> allDevices) {
        this.allDevices = allDevices;
        allDevices.set(0, (Devices) new Boiler());
        allDevices.set(1, (Devices) new Hairdryer());
        allDevices.set(2, (Devices) new Frige());
        allDevices.set(3, (Devices) new Tv());
    } 
   
    }
