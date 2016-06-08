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
public class Tv extends ElectricalDevices{
    private int screenDiagonal;
    private boolean os;
    
    public Integer getScreenDiagonal() {
            return screenDiagonal;
        }
   public void setScreenDiagonal(int screenDiagonal){
            this.screenDiagonal = screenDiagonal;
        }
   
   public Boolean getOs() {
            return os;
        }
   public void setOs(boolean os){
            this.os = os;
        }
    
}
