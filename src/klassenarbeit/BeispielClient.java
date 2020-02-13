/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassenarbeit;

/**
 *
 * @author Nils
 */
public class BeispielClient {
    
    public static void main(String[] args){
        
        Arbeitszimmer arbeitszimmer = new Arbeitszimmer();
        arbeitszimmer.thermostatHinzufuegen(new Thermostat_1());
        Thermostat_2 termo2 = new Thermostat_2();
        arbeitszimmer.thermostatHinzufuegen(termo2);
        
        arbeitszimmer.setAktuelleTemperatur(new Temperatur(12));
        
        arbeitszimmer.thermostatEntfernen(termo2);
        
        arbeitszimmer.setAktuelleTemperatur(new Temperatur(120));
        
    }
}
