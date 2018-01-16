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
public class Address {

    private int IDAddress;
    private int DoorNo;
    private String Street;
    private String Area;
    private String City;
    private String State;
    private int PINCode;

    public Address(int IDAddress, int DoorNo, String Street, String Area, String City, String State, int PINCode) {
        this.IDAddress = IDAddress;
        this.DoorNo = DoorNo;
        this.Street = Street;
        this.Area = Area;
        this.City = City;
        this.State = State;
        this.PINCode = PINCode;
    }

    public Address(int DoorNo, String Street, String Area, String City, String State, int PINCode) {

        this.DoorNo = DoorNo;
        this.Street = Street;
        this.Area = Area;
        this.City = City;
        this.State = State;
        this.PINCode = PINCode;
    }

    public int getID() {
        return IDAddress;
    }

    public void setIDAddress(int IDAddress) {
        this.IDAddress = IDAddress;

    }

    public int getDoorNo() {
        return DoorNo;
    }

    public void setDoorNo(int DoorNo) {
        this.DoorNo = DoorNo;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) throws Exception {
        if (Street.length() <= 50) {
            this.Street = Street;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) throws Exception {
        if (Area.length() <= 50) {
            this.Area = Area;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) throws Exception {
        if (City.length() <= 50) {
            this.City = City;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    public String getState() {
        return State;
    }

    public void setState(String State) throws Exception {
        if (State.length() <= 50) {
            this.State = State;
        } else {
            throw new Exception("Too many characters!");
        }
    }

    public int getPINCode() {
        return PINCode;
    }

    public void setPINCode(int PINCode) {
        this.PINCode = PINCode;
    }

    @Override
    public String toString() {
        return "Address: id=" + IDAddress + ", Street=" + Street + ", Area=" + Area + ", City=" + City + ", State=" + State + ", PINCode=" + PINCode;
    }
}
