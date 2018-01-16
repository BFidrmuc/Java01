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
public class Chart {

    private int IDChart;
    private int PatientID;
    private String Diagnosis;

    public Chart(int PatientID) {
        this.PatientID = PatientID;
    }

    public Chart(int IDChart, int PatientID, String Diagnosis) {
        this.IDChart = IDChart;
        this.PatientID = PatientID;
        this.Diagnosis = Diagnosis;
    }

    public Chart(int PatientID, String Diagnosis) {

        this.PatientID = PatientID;
        this.Diagnosis = Diagnosis;
    }

    public int getID() {
        return IDChart;
    }

    public void setIDChart(int IDChart) {
        this.IDChart = IDChart;

    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }


    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) throws Exception {
        if (Diagnosis.length() <= 250) {
            this.Diagnosis = Diagnosis;
        } else {
            throw new Exception("Previse znakova!");
        }

    }

    @Override
    public String toString() {
        return "Chart: ID=" + IDChart + ", PatientID=" + PatientID + ", Diagnosis=" + Diagnosis;

    }
}
