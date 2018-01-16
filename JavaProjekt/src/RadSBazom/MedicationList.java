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
public class MedicationList {

    private int IDMedicationList;
    private int MedicationID;
    private int ChartID;

    public int getIDMedicationList() {
        return IDMedicationList;
    }

    public void setIDMedicationList(int IDMedicationList) {
        this.IDMedicationList = IDMedicationList;
    }

    public int getMedicationID() {
        return MedicationID;
    }

    public void setMedicationID(int MedicationID) {
        this.MedicationID = MedicationID;
    }

    public int getChartID() {
        return ChartID;
    }

    public void setChartID(int ChartID) {
        this.ChartID = ChartID;
    }

    public MedicationList(int IDMedicationList, int MedicationID, int ChartID) {
        this.IDMedicationList = IDMedicationList;
        this.MedicationID = MedicationID;
        this.ChartID = ChartID;
    }

    public MedicationList(int ChartID, int MedicationID) {
        this.ChartID = ChartID;
        this.MedicationID = MedicationID;

    }

    public MedicationList(int ChartID) {
        this.ChartID = ChartID;
    }

}
