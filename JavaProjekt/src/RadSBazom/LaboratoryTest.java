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
public class LaboratoryTest {

    private int IDLaboratoryTest;
    private String Name;
    private float Price;

    public LaboratoryTest(int IDLaboratoryTest, String Name, float Price) {
        this.IDLaboratoryTest = IDLaboratoryTest;
        this.Name = Name;
        this.Price = Price;
    }

    public LaboratoryTest(String Name, float Price) {
        this.Name = Name;
        this.Price = Price;
    }

    public int getIDLaboratoryTest() {
        return IDLaboratoryTest;

    }

    public void setIDLaboratoryTest(int IDLaboratoryTest) {
        this.IDLaboratoryTest = IDLaboratoryTest;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) throws Exception {
        if (Name.length() <= 200) {
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
        return "LaboratoryTest: id=" + IDLaboratoryTest + ", Name=" + Name + ", Price=" + Price;
    }

}
