/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadSBazom;

import java.sql.Date;

/**
 *
 * @author Bruno-PC
 */
public class Patient {

    private int IDPatient;
    private String FirstName;
    private String MiddleName;
    private String Surname;
    private String Sex;
    private Date DateOfBirth;
    private String OIB;
    private int PermanentAddressID;
    private int NextOfKinID;
    private int ContactID;

    public Patient() {
    }

    public Patient(int IDPatient, String FirstName, String MiddleName, String Surname, String Sex, Date DateOfBirth, String OIB, int PermanentAddressID, int NextOfKinID, int ContactID) {
        this.IDPatient = IDPatient;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.Surname = Surname;
        this.Sex = Sex;
        this.DateOfBirth = DateOfBirth;
        this.OIB = OIB;
        this.PermanentAddressID = PermanentAddressID;
        this.NextOfKinID = NextOfKinID;
        this.ContactID = ContactID;
    }

    public Patient(String FirstName, String MiddleName, String Surname, String Sex, Date DateOfBirth, String OIB, int PermanentAddressID, int NextOfKinID, int ContactID) {

        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.Surname = Surname;
        this.Sex = Sex;
        this.DateOfBirth = DateOfBirth;
        this.OIB = OIB;
        this.PermanentAddressID = PermanentAddressID;
        this.NextOfKinID = NextOfKinID;
        this.ContactID = ContactID;
    }

    public Patient(String FirstName, String MiddleName, String Surname, String Sex, Date DateOfBirth, String OIB, int NextOfKinID) {

        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.Surname = Surname;
        this.Sex = Sex;
        this.DateOfBirth = DateOfBirth;
        this.OIB = OIB;
        this.NextOfKinID = NextOfKinID;

    }

    public Patient(int IDPatient, String FirstName, String Surname, String OIB) {

        this.IDPatient = IDPatient;
        this.FirstName = FirstName;
        this.Surname = Surname;
        this.OIB = OIB;

    }

    public int getID() {
        return IDPatient;
    }

    public void setID(int IDPatient) {
        this.IDPatient = IDPatient;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) throws Exception {
        if (FirstName.length() <= 50) {
            this.FirstName = FirstName;
        } else {
            throw new Exception("Too many characters!");

        }

    }

    public String getMiddleName() {
        return MiddleName;

    }

    public void setMiddleName(String MiddleName) throws Exception {
        if (MiddleName.length() <= 50) {
            this.MiddleName = MiddleName;
        } else {
            throw new Exception("Too many characters!");

        }
    }

    public String getSurname() {
        return Surname;

    }

    public void setSurname(String Surname) throws Exception {
        if (Surname.length() <= 50) {
            this.Surname = Surname;
        } else {
            throw new Exception("Too many characters!");

        }

    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;

    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) throws Exception {
        if (Sex.length() <= 10) {
            this.Sex = Sex;
        } else {
            throw new Exception("Too many characters!");
        }

    }

    public String getOIB() {
        return OIB;
    }

    public void setOIB(String OIB) throws Exception {
        if (OIB.length() <= 20) {
            this.OIB = OIB;
        } else {
            throw new Exception("Too many characters!");
        }

    }

    public int getPermanentAddressID() {
        return PermanentAddressID;
    }

    public void setPermanentAddressID(int PermanentAddressID) {
        this.PermanentAddressID = PermanentAddressID;

    }

    public int getNextOfKinID() {
        return NextOfKinID;
    }

    public void setNextOfKinID(int NextOfKinID) {
        this.NextOfKinID = NextOfKinID;

    }

    public int getContactID() {
        return ContactID;
    }

    public void setContactID(int ContactID) {
        this.ContactID = ContactID;

    }

    @Override
    public String toString() {
        return "Patient: ID=" + IDPatient + ", FirstName=" + FirstName + ", MiddleName=" + MiddleName + ", Surname=" + Surname + ", Sex=" + Sex + ", DateOfBirth=" + DateOfBirth + ", OIB=" + OIB + ", PermanentAddressID=" + PermanentAddressID + ", NextOfKinID" + NextOfKinID + ", ContactID" + ContactID;
    }

}
