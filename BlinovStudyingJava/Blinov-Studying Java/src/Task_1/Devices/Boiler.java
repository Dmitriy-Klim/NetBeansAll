/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_1.Devices;

/**
 *
 * @author sorokindv
 */
public class Boiler extends ElectricalDevices{
    private int displacement;
    private int maxTemperature;
    private int heatingRate;
    
    public Integer getDisplacement() {
            return displacement;
        }
   public void setDisplacement(Integer displacement){
            this.displacement = displacement;
        }
   
   public Integer getMaxTemperature() {
            return maxTemperature;
        }
   public void setMaxTemperature(int maxTemperature){
            this.maxTemperature = maxTemperature;
        }
   
   public Integer getHeatingRate() {
            return heatingRate;
        }
   public void setHeatingRate(int heatingRate){
            this.heatingRate = heatingRate;
        }
}
