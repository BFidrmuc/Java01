/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadSBazom;

/**
 *
 * @author Bruno-PC
 */
public class Doctor {

    private int IDDoctor;
    private String FirstName;
    private String Surname;

    public Doctor(int IDDoctor, String FirstName, String Surname) {
        this.IDDoctor = IDDoctor;
        this.FirstName = FirstName;
        this.Surname = Surname;
    }

    public Doctor(String FirstName, String Surname) {
        this.FirstName = FirstName;
        this.Surname = Surname;
    }

    public int getIDDoctor() {
        return IDDoctor;
    }

    public void setIDDoctor(int IDDoctor) {
        this.IDDoctor = IDDoctor;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) throws Exception {
        if (FirstName.length() <= 50) {
            this.FirstName = FirstName;
        } else {
            throw new Exception("Ime mora biti krace od 50 znakova.");
        }

    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) throws Exception {
        if (Surname.length() <= 50) {
            this.Surname = Surname;
        } else {
            throw new Exception("Prezime mora biti krace od 50 znakova.");
        }

    }

    @Override
    public String toString() {
        return "Doctor, id=" +IDDoctor+" Name= "+FirstName+" Surname= "+Surname;
    }

}
