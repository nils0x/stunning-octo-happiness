/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassenarbeit;

import java.util.ArrayList;

/**
 *
 * @author Nils
 */
public class Zimmer {
    ArrayList<Temperatureinstellbar> temperaturEinstellerList = new ArrayList<Temperatureinstellbar>();
    void thermostatHinzufuegen(Temperatureinstellbar temperatureinstellbar){
        temperaturEinstellerList.add(temperatureinstellbar);
    }
    void thermostatEntfernen(Temperatureinstellbar temperatureinstellbar){
        temperaturEinstellerList.remove(temperatureinstellbar);
    }
    void temperaturMitteilen(Temperatur temperatur){
        for(Temperatureinstellbar temperatureinstellbar : temperaturEinstellerList){
            temperatureinstellbar.erhalteTemperatur(temperatur);
        }
    }
        
}
