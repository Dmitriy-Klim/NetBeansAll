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
public class HeatingDevices extends ElectricalDevices {
    private int m1=0;
    private int m3;
    
    public int getM1() {
        return m1;
    }
    public int getM3() {
        return m3;
    }
    
    public void setM1(int m1){
        this.m1 = m1;
    }
    public void setM3(int m3){
        this.m3 = m3;
    }
    
        public HeatingDevices (String name, int kilowatt, boolean powerSocket, int litry) {
            m3=kilowatt;
            System.out.println("Прибор "+ name+ " потребляет "+kilowatt+" ватт, на "+litry+" литров");
            if (powerSocket==true) {
                System.out.println(name+" включен в розетку");
                m1=kilowatt;
            }
            return ;
        }
}