/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadSBazom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bruno-PC
 */
public class UpisivanjeUBazu {

    public static Long unesiNoviContact(Contact contact) {
        if (contact == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO Contact (TelephoneWork, TelephoneHome, Mobile, Pager, Fax, Email) values (?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, contact.getTelephoneWork());
            pst.setString(2, contact.getTelephoneHome());
            pst.setString(3, contact.getMobile());
            pst.setString(4, contact.getPager());
            pst.setString(5, contact.getFax());
            pst.setString(6, contact.getEmail());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;
    }

    public static Long unesiNoviNextOfKin(NextOfKin kin) {
        if (kin == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO NextOfKin (FirstName, MiddleName, Surname, RelationshipToOutpatient) values (?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, kin.getFirstName());
            pst.setString(2, kin.getMiddleName());
            pst.setString(3, kin.getSurname());
            pst.setString(4, kin.getRelationshipToOutpatient());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;
    }

    public static Long unesiCheckup(Checkup cons) {
        if (cons == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO Checkup (Name, Price, DateOfChekup) values (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, cons.getName());
            pst.setFloat(2, cons.getPrice());
            pst.setDate(3, cons.getDateOfcheckUp());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiNovogPacijenta(Patient pat) {
        if (pat == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO Patient (FirstName, MiddleName, Surname, Sex, DateOfBirth, OIB, NextOfKinID) values (?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, pat.getFirstName());
            pst.setString(2, pat.getMiddleName());
            pst.setString(3, pat.getSurname());
            pst.setString(4, pat.getSex());
            pst.setDate(5, pat.getDateOfBirth());
            pst.setString(6, pat.getOIB());
            pst.setInt(7, pat.getNextOfKinID());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiChart(Chart chart) {
        if (chart == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO Chart (PatientID,Diagnosis) values (?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, chart.getPatientID());
            pst.setString(2, chart.getDiagnosis());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiAddress(Address adresa) {

        if (adresa == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO Address (DoorNo, Street, Area, City, State, PINCode) values (?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, adresa.getDoorNo());
            pst.setString(2, adresa.getStreet());
            pst.setString(3, adresa.getArea());
            pst.setString(4, adresa.getCity());
            pst.setString(5, adresa.getState());
            pst.setInt(6, adresa.getPINCode());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiLaboratoryTest(LaboratoryTest labtest) {

        if (labtest == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO Address (Name, Price) values (?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, labtest.getName());
            pst.setFloat(2, labtest.getPrice());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiMedication(Medication med) {

        if (med == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO Address (Name, Price) values (?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, med.getName());
            pst.setFloat(2, med.getPrice());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiDoctor(Doctor doctor) {

        if (doctor == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO Address (Name, Surname) values (?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, doctor.getFirstName());
            pst.setString(2, doctor.getSurname());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiAppointment(Appointment appoint) {

        if (appoint == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO Appointment (Date, DoctorID, PatientID) values (?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setDate(1, appoint.getDate());
            pst.setInt(2, appoint.getDoctorID());
            pst.setInt(3, appoint.getPatientID());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiRecord(Record record) {

        if (record == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            /* pst = con.prepareStatement(
                    "INSERT INTO Record (RecordDate, PatientID, PresentAddressID, BriefStatementOfCompaint, ContactTelephoneNumber1, ContactTelephoneNumber2, "
                    + "MaritalStatus, NoOfDependents, Height, Weight, BloodTypeRH, Occupation, GrossAnnualIncome, VegetarianNonVegetarian, Smoker, AverageOfCigarettesDay, "
                    + "ConsumeAlcoholicBeverage, AverageConsumeAlcoholicBeverageDay, UseStimulants, ConsuptionOfCoffeeTeaDay, ConsumptionSoftDriksDay, RegularMeals, "
                    + "EatingHomeOutside, StatementOfCoplaint, HistoryOfPrevioustreatment, PhysicianHospitaltreated, Diabetic, Hypertensive, CardiacCondition, "
                    + "RespiratoryCondition, DigestiveCondition, OrthopedicCondition, MuscularCondition, NeurologicalCondition, KnownAllergies, "
                    + "KnownAdverseReactionToSpecificDrugs, MajorSurgeries)"
                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

           
            pst.setDate(1, record.getDate());
            pst.setInt(2, record.getPatientID());
            pst.setInt(3, record.getPresentAddressID());
            pst.setString(4, record.getBriefStatementOfCompaint());
            pst.setString(5, record.getContactTelephoneNumber1());
            pst.setString(6, record.getContactTelephoneNumber2());
            pst.setString(7, record.getMaritalStatus());
            pst.setInt(8, record.getNoOfDependents());
            pst.setFloat(9, record.getHeight());
            pst.setFloat(10, record.getWeight());
            pst.setString(11, record.getBloodTypeRH());
            pst.setString(12, record.getOccupation());
            pst.setFloat(13, record.getGrossAnnualIncome());
            pst.setString(14, record.getVegeterianNonVegetarian());
            pst.setString(15, record.getSmoker());
            pst.setFloat(16, record.getAverageOfCigarettesDay());
            pst.setString(17, record.getConsumeAlcoholicBeverage());
            pst.setFloat(18, record.getAverageConsumeAlcoholicBeverageDay());
            pst.setString(19, record.getUseStimulants());
            pst.setFloat(20, record.getConsuptionOfCoffeeTeaDay());
            pst.setFloat(21, record.getConsumptionSoftDriksDay());
            pst.setString(22, record.getRegularMeals());
            pst.setString(23, record.getEatingHomeOutside());
            pst.setString(24, record.getStatementOfCoplaint());
            pst.setString(25, record.getHistoryOfPrevioustreatment());
            pst.setString(26, record.getPhysicianHospitaltreated());
            pst.setString(27, record.getDiabetic());
            pst.setString(28, record.getHypertensive());
            pst.setString(29, record.getCardiacCondition());
            pst.setString(30, record.getRespiratoryCondition());
            pst.setString(31, record.getDigestiveCondition());
            pst.setString(32, record.getOrthopedicCondition());
            pst.setString(33, record.getMuscularCondition());
            pst.setString(34, record.getNeurologicalCondition());
            pst.setString(35, record.getKnownAllergies());
            pst.setString(36, record.getKnownAdverseReactionToSpecificDrugs());
            pst.setString(37, record.getMajorSurgeries());
             */
            pst = con.prepareStatement(
                    "INSERT INTO Record (RecordDate, PatientID,BriefStatementOfCompaint,ContactTelephoneNumber1,ContactTelephoneNumber2)"
                    + "values (?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            pst.setDate(1, record.getDate());
            pst.setInt(2, record.getPatientID());
            pst.setString(3, record.getBriefStatementOfCompaint());
            pst.setString(4, record.getContactTelephoneNumber1());
            pst.setString(5, record.getContactTelephoneNumber2());
            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiMedList(MedicationList lista) {

        if (lista == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO MedicationList (ChartID,MedicationID) values (?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, lista.getChartID());
            pst.setInt(2, lista.getMedicationID());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiLabTestList(LaboratoryTestList lista) {

        if (lista == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO LaboratoryTestList (ChartID,LaboratoryTestID) values (?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, lista.getChartID());
            pst.setInt(2, lista.getLaboratoryTestID());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiCheckupList(CheckupList lista) {

        if (lista == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO CheckupList (ChartID,CheckupID) values (?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, lista.getChartID());
            pst.setInt(2, lista.getCheckupID());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }

    public static Long unesiDoctorList(DoctorList lista) {

        if (lista == null) {
            return null;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(
                    "INSERT INTO DoctorList (ChartID,DoctorID) values (?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, lista.getChartID());
            pst.setInt(2,lista.getDoctorID());

            pst.executeUpdate();

            ResultSet rset = pst.getGeneratedKeys();

            try {
                if (rset != null && rset.next()) {
                    long noviID = rset.getLong(1);
                    return noviID;
                }
            } finally {
                try {
                    rset.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        SpajanjeSBazom.zatvoriConn(con);
        return null;

    }
}
