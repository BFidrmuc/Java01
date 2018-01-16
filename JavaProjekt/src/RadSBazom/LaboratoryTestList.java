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
public class LaboratoryTestList {

    private int IDLaboratoryTestList;
    private int LaboratoryTesttID;
    private int ChartID;

    public LaboratoryTestList(int IDLaboratoryTestList, int LaboratoryTestListID, int ChartID) {
        this.IDLaboratoryTestList = IDLaboratoryTestList;
        this.LaboratoryTesttID = LaboratoryTestListID;
        this.ChartID = ChartID;
    }

    public LaboratoryTestList(int ChartID, int LaboratoryTestListID) {
        this.ChartID = ChartID;
        this.LaboratoryTesttID = LaboratoryTestListID;

    }

    public LaboratoryTestList(int ChartID) {
        this.ChartID = ChartID;
    }

    public int getChartID() {
        return ChartID;
    }

    public void setChartID(int ChartID) {
        this.ChartID = ChartID;
    }

    public int getIDLaboratoryTestList() {
        return IDLaboratoryTestList;
    }

    public void setIDLaboratoryTestList(int IDLaboratoryTestList) {
        this.IDLaboratoryTestList = IDLaboratoryTestList;
    }

    public int getLaboratoryTestID() {
        return LaboratoryTesttID;
    }

    public void setLaboratoryTestID(int LaboratoryTesttID) {
        this.LaboratoryTesttID = LaboratoryTesttID;
    }

}
