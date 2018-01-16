/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PomocneKlase;

import RadSBazom.Patient;

/**
 *
 * @author Bruno-PC
 */
public class PomocniPatientICijena {
    private Patient Pacijent;
    private float UkupnaCijenaLijekova;
    private float UkupnaCijenaPregleda;
    private float UkupnaCijenaKonzultacija;

    public PomocniPatientICijena() {
    }

    public PomocniPatientICijena(Patient Pacijent, float UkupnaCijenaLijekova, float UkupnaCijenaPregleda, float UkupnaCijenaKonzultacija) {
        this.Pacijent = Pacijent;
        this.UkupnaCijenaLijekova = UkupnaCijenaLijekova;
        this.UkupnaCijenaPregleda = UkupnaCijenaPregleda;
        this.UkupnaCijenaKonzultacija = UkupnaCijenaKonzultacija;
    }

    public Patient getPacijent() {
        return Pacijent;
    }

    public void setPacijent(Patient Pacijent) {
        this.Pacijent = Pacijent;
    }

    public float getUkupnaCijenaKonzultacija() {
        return UkupnaCijenaKonzultacija;
    }

    public void setUkupnaCijenaKonzultacija(float UkupnaCijenaKonzultacija) {
        this.UkupnaCijenaKonzultacija = UkupnaCijenaKonzultacija;
    }

    public float getUkupnaCijenaLijekova() {
        return UkupnaCijenaLijekova;
    }

    public void setUkupnaCijenaLijekova(float UkupnaCijenaLijekova) {
        this.UkupnaCijenaLijekova = UkupnaCijenaLijekova;
    }

    public float getUkupnaCijenaPregleda() {
        return UkupnaCijenaPregleda;
    }

    public void setUkupnaCijenaPregleda(float UkupnaCijenaPregleda) {
        this.UkupnaCijenaPregleda = UkupnaCijenaPregleda;
    }
    
    
    
    
}
