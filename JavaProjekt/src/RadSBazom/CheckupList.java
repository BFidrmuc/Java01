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
public class CheckupList {

    private int IDCheckupList;
    private int CheckupID;
    private int ChartID;

    public CheckupList(int IDCheckupList, int CheckupID, int ChartID) {
        this.IDCheckupList = IDCheckupList;
        this.CheckupID = CheckupID;
        this.ChartID = ChartID;
    }

    public CheckupList(int ChartID, int CheckupID) {
        this.ChartID = ChartID;
        this.CheckupID = CheckupID;

    }

    public CheckupList(int ChartID) {
        this.ChartID = ChartID;
    }

    public int getChartID() {
        return ChartID;
    }

    public void setChartID(int ChartID) {
        this.ChartID = ChartID;
    }

    public int getCheckupID() {
        return CheckupID;
    }

    public void setCheckupID(int CheckupID) {
        this.CheckupID = CheckupID;
    }

    public int getIDCheckupList() {
        return IDCheckupList;
    }

    public void setIDCheckupList(int IDCheckupList) {
        this.IDCheckupList = IDCheckupList;
    }

}
