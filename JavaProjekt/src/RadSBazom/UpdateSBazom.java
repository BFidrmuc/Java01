/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadSBazom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Bruno-PC
 */
public class UpdateSBazom {

    public static void updatePacijenta(long IDPatient, long PermanentAddressID, long ContactID, long AddressID) {
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("UPDATE Patient set PermanentAddressID=?, ContactID=? ,AddressID=? WHERE IDPatient=?");
            pst.setLong(4, IDPatient);
            pst.setLong(1, PermanentAddressID);
            pst.setLong(2, ContactID);
            pst.setLong(3, AddressID);

            int numberOfAffectedRows = pst.executeUpdate();
            System.out.println("Broj redaka koji su pogođeni ovom izmjenom: " + numberOfAffectedRows);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void updateNextOfKin(long IDNextOfKin, long AddressID, long ContactID) {
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("UPDATE NextOfKin set AddressID=?, ContactID=? WHERE IDNextOfKin=?");
            pst.setLong(3, IDNextOfKin);
            pst.setLong(1, AddressID);
            pst.setLong(2, ContactID);

            int numberOfAffectedRows = pst.executeUpdate();
            System.out.println("Broj redaka koji su pogođeni ovom izmjenom: " + numberOfAffectedRows);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void updateRecord(Record record) {
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("UPDATE Record set MaritalStatus=?, NoOfDependents=?, Height=?, Weight=?, BloodTypeRH=?, Occupation=?, GrossAnnualIncome=?, VegetarianNonVegetarian=?, Smoker=?, AverageOfCigarettesDay=?,ConsumeAlcoholicBeverage=?, AverageConsumeAlcoholicBeverageDay=?, UseStimulants=?, ConsuptionOfCoffeeTeaDay=?, ConsumptionSoftDriksDay=?, RegularMeals=?,EatingHomeOutside=?, StatementOfCoplaint=?, HistoryOfPrevioustreatment=?, PhysicianHospitaltreated=?, Diabetic=?, Hypertensive=?, CardiacCondition=?,RespiratoryCondition=?, DigestiveCondition=?, OrthopedicCondition=?, MuscularCondition=?, NeurologicalCondition=?, KnownAllergies=?,KnownAdverseReactionToSpecificDrugs=?, MajorSurgeries=? WHERE PatientID=?");
            pst.setString(1, record.getMaritalStatus());
            pst.setInt(2, record.getNoOfDependents());
            pst.setFloat(3, record.getHeight());
            pst.setFloat(4, record.getWeight());
            pst.setString(5, record.getBloodTypeRH());
            pst.setString(6, record.getOccupation());
            pst.setFloat(7, record.getGrossAnnualIncome());
            pst.setString(8, record.getVegeterianNonVegetarian());
            pst.setString(9, record.getSmoker());
            pst.setFloat(10, record.getAverageOfCigarettesDay());
            pst.setString(11, record.getConsumeAlcoholicBeverage());
            pst.setFloat(12, record.getAverageConsumeAlcoholicBeverageDay());
            pst.setString(13, record.getUseStimulants());
            pst.setFloat(14, record.getConsuptionOfCoffeeTeaDay());
            pst.setFloat(15, record.getConsumptionSoftDriksDay());
            pst.setString(16, record.getRegularMeals());
            pst.setString(17, record.getEatingHomeOutside());
            pst.setString(18, record.getStatementOfCoplaint());
            pst.setString(19, record.getHistoryOfPrevioustreatment());
            pst.setString(20, record.getPhysicianHospitaltreated());
            pst.setString(21, record.getDiabetic());
            pst.setString(22, record.getHypertensive());
            pst.setString(23, record.getCardiacCondition());
            pst.setString(24, record.getRespiratoryCondition());
            pst.setString(25, record.getDigestiveCondition());
            pst.setString(26, record.getOrthopedicCondition());
            pst.setString(27, record.getMuscularCondition());
            pst.setString(28, record.getNeurologicalCondition());
            pst.setString(29, record.getKnownAllergies());
            pst.setString(30, record.getKnownAdverseReactionToSpecificDrugs());
            pst.setString(31, record.getMajorSurgeries());
            pst.setInt(32, record.getPatientID());

            int numberOfAffectedRows = pst.executeUpdate();
            System.out.println("Broj redaka koji su pogođeni ovom izmjenom: " + numberOfAffectedRows);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
