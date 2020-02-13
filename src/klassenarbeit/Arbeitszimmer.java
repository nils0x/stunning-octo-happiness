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
public class Arbeitszimmer extends Zimmer{
    Temperatur aktuelleTemperatur;
    Temperatur getAktuelleTemperatur(){
        return aktuelleTemperatur;
    }
    void setAktuelleTemperatur(Temperatur temperatur){
        this.aktuelleTemperatur = temperatur;
        this.temperaturMitteilen(temperatur);
    }
}
