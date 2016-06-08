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
public class Frige extends ElectricalDevices{
   private int numberOfCameras;
   private int coolingTemperature;
   
   public Integer getNumberOfCameras() {
            return numberOfCameras;
        }
   public void setNumberOfCameras(int numberOfCameras){
            this.numberOfCameras = numberOfCameras;
        }
   
   public Integer getCoolingTemperature() {
            return numberOfCameras;
        }
   public void setCoolingTemperature(int coolingTemperature){
            this.coolingTemperature = coolingTemperature;
        }
    
}
