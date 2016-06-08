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
public class Hairdryer extends ElectricalDevices{
    private int numberOfSpeeds;
    private int numberOfNozzles;
    
    public Integer getNumberOfSpeeds() {
            return numberOfSpeeds;
        }
   public void setNumberOfSpeeds(int numberOfSpeeds){
            this.numberOfSpeeds = numberOfSpeeds;
        }
   
   public Integer getNumberOfNozzles() {
            return numberOfNozzles;
        }
   public void setNumberOfNozzles(int numberOfNozzles){
            this.numberOfNozzles = numberOfNozzles;
        }
}
