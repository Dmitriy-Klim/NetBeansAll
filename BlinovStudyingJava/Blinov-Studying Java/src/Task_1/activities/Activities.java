/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_1.activities;

import Task_1.Room.Room;
import Task_1.Devices.ElectricalDevices;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Activities {
    private int summPower = 0;
    private int consumPower = 0;
    
    public int getSummPower() {
        return summPower;
    }
    public void setSummPower(int power){
        summPower = summPower+power;
    }
    
    public int getConsumPower() {
        return consumPower;
    }
    public void setConsumPower(int power){
        consumPower = consumPower+power;
    }
    
    public void powerCount(int m3Power) {
    setSummPower(m3Power); }
    
    public void consumedPower(int m3Power) {
        setConsumPower(m3Power);
    }
    
    public void findDevice() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите мощьность прибора:  ");
        int a = in.nextInt();
        switch (a) {
            case 2000: System.out.println("Это бойлер!");
                        break;
            case 3000: System.out.println("Это кипятильник!");
                        break;
            case 75: System.out.println("Это люстра!");
                        break;
            case 60: System.out.println("Это настольная лампа!");
                        break;
            default: System.out.println("Такого прибора нет. К сожалению. =(( ");
           }
        
        
        
    }
    
    
    public void result() {
    System.out.println("2. Общая мощьность всех электроприборов: "+getSummPower());
    System.out.println("3. Общая потредляемая мощьность: "+consumPower);
    System.out.println("4. Поиск прибора в комнате по заданным параметрам");
    findDevice();
    }
    
    
}
