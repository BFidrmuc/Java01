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
public class Checkup {

    private int IDCheckup;
    private String Name;
    private float Price;
    private Date DateOfcheckUp;

    public Checkup(int IDCheckup, String Name, float Price) {
        this.IDCheckup = IDCheckup;
        this.Name = Name;
        this.Price = Price;

    }

    public Checkup(String Name, float Price, Date DateOfcheckUp) {
        this.DateOfcheckUp = DateOfcheckUp;
        this.Name = Name;
        this.Price = Price;

    }

    public void setDateOfcheckUp(Date DateOfcheckUp) {
        this.DateOfcheckUp = DateOfcheckUp;
    }

    public Date getDateOfcheckUp() {
        return DateOfcheckUp;
    }

    public int getID() {
        return IDCheckup;
    }

    public void setIDConsultation(int IDCheckup) {
        this.IDCheckup = IDCheckup;

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) throws Exception {
        if (Name.length() <= 50) {
            this.Name = Name;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Checkup : ID=" + IDCheckup + ", Name=" + Name + ", Price=" + Price;
    }
}
