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
public class NextOfKin {

    private int IDNextOfKin;
    private String FirstName;
    private String MiddleName;
    private String Surname;
    private String RelationshipToOutpatient;
    private int AddressID;
    private int ContactID;

    public NextOfKin(int IDNextOfKin, String FirstName, String MiddleName, String Surname, String RelationshipToOutpatient, int AddressID, int ContactID) {

        this.IDNextOfKin = IDNextOfKin;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.Surname = Surname;
        this.RelationshipToOutpatient = RelationshipToOutpatient;
        this.AddressID = AddressID;
        this.ContactID = ContactID;

    }

    public NextOfKin(String FirstName, String MiddleName, String Surname, String RelationshipToOutpatient, int AddressID, int ContactID) {

        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.Surname = Surname;
        this.RelationshipToOutpatient = RelationshipToOutpatient;
        this.AddressID = AddressID;
        this.ContactID = ContactID;

    }
    
        public NextOfKin(String FirstName, String MiddleName, String Surname, String RelationshipToOutpatient) {

        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.Surname = Surname;
        this.RelationshipToOutpatient = RelationshipToOutpatient;

    }

    public int getID() {
        return IDNextOfKin;
    }

    public void setID(int IDNextOfKin) {
        this.IDNextOfKin = IDNextOfKin;
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

    public String getRelationshipToOutpatient() {
        return RelationshipToOutpatient;

    }

    public void setRelationshipToOutpatient(String RelationshipToOutpatient) throws Exception {
        if (RelationshipToOutpatient.length() <= 50) {
            this.RelationshipToOutpatient = RelationshipToOutpatient;
        } else {
            throw new Exception("Too many characters!");

        }

    }

    public int getAddressID() {
        return AddressID;
    }

    public void getAddressID(int AddressID) {
        this.AddressID = AddressID;
    }

    public int getContactID() {
        return ContactID;
    }

    public void getContactID(int ContactID) {
        this.ContactID = ContactID;
    }

    @Override
    public String toString() {
        return "NextOfKin: ID=" + IDNextOfKin + ", FirstName=" + FirstName + ", MiddleName=" + MiddleName + ", Surname=" + Surname + ", RelationshipToOutpatient=" + RelationshipToOutpatient + ", AddressID=" + AddressID + ", ContactID=" + ContactID;
    }

}
