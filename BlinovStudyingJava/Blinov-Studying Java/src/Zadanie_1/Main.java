/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadanie_1;

import Zadanie_1.Pribory.Electropribory;
import Zadanie_1.Pribory.*;
import java.util.Arrays;
import Room.*;
import Zadanie_1.activities.*;



/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        Room room = new Room();
        Activities activ = new Activities();
        
        room.room();
        activ.activities();
        
                
        
    }
}
