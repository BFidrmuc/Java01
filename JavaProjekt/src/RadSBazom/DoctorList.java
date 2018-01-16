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
public class DoctorList {

    private int IDDoctorlist;
    private int DoctorID;
    private int ChartID;

    public DoctorList(int IDDoctorlist, int DoctorID, int ChartID) {
        this.IDDoctorlist = IDDoctorlist;
        this.DoctorID = DoctorID;
        this.ChartID = ChartID;
    }

    public DoctorList(int ChartID, int DoctorID) {
        this.ChartID = ChartID;
        this.DoctorID = DoctorID;

    }

    public DoctorList(int ChartID) {
        this.ChartID = ChartID;
    }

    public int getChartID() {
        return ChartID;
    }

    public void setChartID(int ChartID) {
        this.ChartID = ChartID;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int DoctorID) {
        this.DoctorID = DoctorID;
    }

    public int getIDDoctorlist() {
        return IDDoctorlist;
    }

    public void setIDDoctorlist(int IDDoctorlist) {
        this.IDDoctorlist = IDDoctorlist;
    }

}
