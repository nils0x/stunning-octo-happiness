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
public class Thermostat_1 implements Temperatureinstellbar{
    public void erhalteTemperatur(Temperatur temperatur){
        System.out.println("Thermostat_1 hat die folgende Temperatur erhalten: " +temperatur.getWert());
    }
}
