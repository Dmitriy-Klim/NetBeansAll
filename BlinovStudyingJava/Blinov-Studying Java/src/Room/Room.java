/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Room;

import Zadanie_1.Pribory.NagrevatelniePribory;
import Zadanie_1.Pribory.OsvetitelniePribory;
import Zadanie_1.activities.Activities;

/**
 *
 * @author Admin
 */
public class Room {
    private int moshnost=0;
    
    public int getMoshnost() {
        return moshnost;
        }
    
    public void setMoshnost(int moshnost) {
        this.moshnost = moshnost;
    }
    
    public void room() {
        System.out.println("1. Создание всех электроприборов");
        NagrevatelniePribory boiler = new NagrevatelniePribory("Бойлер", 2000, true, 50);
        NagrevatelniePribory kipyatilnik = new NagrevatelniePribory("Кипятильник", 3000, false, 10);
        OsvetitelniePribory lustra = new OsvetitelniePribory("Люстра", 75, true, 13, 3);
        OsvetitelniePribory nastolnayalampa = new OsvetitelniePribory("Настольная лампа", 60, false, 8, 1);
        System.out.println("");
        
        Activities activ = new Activities();
        activ.activities();
    }
    
}
