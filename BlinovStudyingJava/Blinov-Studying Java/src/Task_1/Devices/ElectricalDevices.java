/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_1.Devices;

/**
 *
 * @author Admin
 */
public class ElectricalDevices {
        private String name;
        private int kilowatt;
        private boolean powerSocket;
        
        public String getname() {
            return name;
        }
    public void setName(String name){
            this.name = name;
        }
        
        public int getKilovaty() {
            return kilowatt;
        }
        public void setKilovaty(int kilowatt){
            this.kilowatt = kilowatt;
        }
        
        public boolean getRozetka() {
            return powerSocket;
        }
        public void setRozetka(boolean powerSocket) {
            this.powerSocket = powerSocket;
        }
        }
