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
public class Contact {

    private int IDContact;
    private String TelephoneWork;
    private String TelephoneHome;
    private String Mobile;
    private String Pager;
    private String Fax;
    private String Email;

    public Contact(int IDContact, String TelephoneWork, String TelephoneHome, String Mobile, String Pager, String Fax, String Email) {
        this.IDContact = IDContact;
        this.TelephoneWork = TelephoneWork;
        this.TelephoneHome = TelephoneHome;
        this.Mobile = Mobile;
        this.Pager = Pager;
        this.Fax = Fax;
        this.Email = Email;
    }

    public Contact(String TelephoneWork, String TelephoneHome, String Mobile, String Pager, String Fax, String Email) {
        this.TelephoneWork = TelephoneWork;
        this.TelephoneHome = TelephoneHome;
        this.Mobile = Mobile;
        this.Pager = Pager;
        this.Fax = Fax;
        this.Email = Email;
    }

    public int getId() {
        return IDContact;
    }

    public void setIDContact(int IDContact) {
        this.IDContact = IDContact;
    }

    public String getTelephoneWork() {
        return TelephoneWork;
    }

    public void setTelephoneWork(String TelephoneWork) throws Exception {
        if (TelephoneWork.length() <= 50) {
            this.TelephoneWork = TelephoneWork;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    public String getTelephoneHome() {
        return TelephoneHome;
    }

    public void setTelephoneHome(String TelephoneHome) throws Exception {
        if (TelephoneHome.length() <= 50) {
            this.TelephoneHome = TelephoneHome;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) throws Exception {
        if (Mobile.length() <= 50) {
            this.Mobile = Mobile;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    public String getPager() {
        return Pager;
    }

    public void setPager(String Pager) throws Exception {
        if (Pager.length() <= 50) {
            this.Pager = Pager;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) throws Exception {
        if (Fax.length() <= 50) {
            this.Fax = Fax;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) throws Exception {
        if (Email.length() <= 50) {
            this.Email = Email;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    @Override
    public String toString() {
        return "Contact: ID=" + IDContact + ", TelephoneWork=" + TelephoneWork + ", TelephoneHome=" + TelephoneHome + ", Mobile=" + Mobile + ", Pager=" + Pager + ", Fax=" + Fax + ", Email=" + Email;
    }

}
