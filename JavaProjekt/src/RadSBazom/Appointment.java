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
public class Appointment {

    private int IDAppointment;
    private Date Date;
    private int DoctorID;
    private int PatientID;

    public Appointment(int IDAppointment, Date Date, int DoctorID, int PatientID) {
        this.IDAppointment = IDAppointment;
        this.Date = Date;
        this.DoctorID = DoctorID;
        this.PatientID = PatientID;
    }

    public Appointment(Date Date, int DoctorID, int PatientID) {
        this.Date = Date;
        this.DoctorID = DoctorID;
        this.PatientID = PatientID;
    }

    public int getIDAppointment() {
        return IDAppointment;
    }

    public void setIDAppointment(int IDAppointment) {
        this.IDAppointment = IDAppointment;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int DoctorID) {
        this.DoctorID = DoctorID;
    }

    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    @Override
    public String toString() {
        return "Appointment, id= " + IDAppointment + " Date= " + Date + " DoctorID= " + DoctorID + " PatientID= " + PatientID;
    }

}
