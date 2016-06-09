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
public class Room {
    
    Frige frige = new Frige();
    Boiler boiler = new Boiler();
    Hairdryer hairdryer = new Hairdryer();
    Tv tv = new Tv(); 
    
    public ArrayList devices;

    public Room() {
        this.devices = new ArrayList ();
        devices.add(1, frige);
        devices.add(2, boiler);
        devices.add(3, hairdryer);
        devices.add(4, tv);
    }
}
