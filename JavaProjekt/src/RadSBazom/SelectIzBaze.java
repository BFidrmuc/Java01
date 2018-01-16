/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RadSBazom;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno-PC
 */
public class SelectIzBaze {

    public static float ispisRacuna(int pacijentID) {
        Connection con = SpajanjeSBazom.noviConn();
        float UkupnaCijena = 0;

        PreparedStatement pst = null;
        float CijenaLijekova = 0;
        float CijenaLabTesta = 0;
        float CijenaConsultacija = 0;

        try {
            pst = con.prepareStatement("SELECT MedicationID, LaboratoryTestID, ConsultationID from Chart where PatientID=pacijentID order by id");

            /*     "SELECT * "+
        "FROM (Product " +
        "INNER JOIN Orders ON (Product.ItemID=Orders.ItemID)) " +
        "LEFT OUTER JOIN SupplierProduct ON (Orders.ItemID=SupplierProduct.ItemID) "+
        "WHERE Product.Reciever = 'Fred' " +
        "ORDER BY Product.ItemName"; */
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long MedicationID = rset.getLong(1);
                    CijenaLijekova = CijenaLijekova + dohvatiCijeneLijekova(MedicationID);
                    long LaboratoryTestID = rset.getLong(2);
                    CijenaLabTesta = CijenaLabTesta + dohvatiCijeneLabTesta(LaboratoryTestID);
                    long ConsultationID = rset.getLong(3);
                    CijenaConsultacija = CijenaConsultacija + dohvatiCijenekonzultacija(ConsultationID);

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        UkupnaCijena = CijenaConsultacija + CijenaLabTesta + CijenaLijekova;
        return UkupnaCijena;
    }

    public static float dohvatiIDLijekova(int ChartID) {
        float CijenaSvihLijekova = 0;

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT MedicationID from MedicationList where ChartID=?");
            pst.setLong(1, ChartID);
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long MedicationID = rset.getLong("MedicationID");
                    CijenaSvihLijekova += dohvatiCijeneLijekova(MedicationID);

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        return CijenaSvihLijekova;
    }

    public static float dohvatiCijeneLijekova(Long medID) {
        float Cijena = 0;
        if (medID == null) {
            return Cijena;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT Price from Medication where IDMedication=?");
            pst.setLong(1, medID);
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    float price = rset.getFloat("Price");
                    Cijena = price;

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        return Cijena;
    }

    public static float dohvatiIDLabTestova(int ChartID) {
        float CijenaSvihLabTestova = 0;

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT LaboratoryTestID from LaboratoryTestList where ChartID=?");
            pst.setLong(1, ChartID);
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long LabtestID = rset.getLong("LaboratoryTestID");
                    CijenaSvihLabTestova += dohvatiCijeneLabTesta(LabtestID);

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        return CijenaSvihLabTestova;
    }

    public static float dohvatiCijeneLabTesta(Long labtest) {
        float Cijena = 0;
        if (labtest == null) {
            return Cijena;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT Price from LaboratoryTest where IDLaboratoryTest=?");
            pst.setLong(1, labtest);
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    float price = rset.getFloat("Price");
                    Cijena = price;

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        return Cijena;
    }

    public static float dohvatiIDKonzultacija(int ChartID) {
        float CijenaSvihPregleda = 0;

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT CheckupID from CheckupList where ChartID=?");
            pst.setLong(1, ChartID);
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long CheckupID = rset.getLong("CheckupID");
                    CijenaSvihPregleda += dohvatiCijenekonzultacija(CheckupID);

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        return CijenaSvihPregleda;
    }

    public static float dohvatiCijenekonzultacija(Long konzultacije) {
        float Cijena = 0;
        if (konzultacije == null) {
            return Cijena;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT Price from Checkup where IDCheckup=?");
            pst.setLong(1, konzultacije);
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    float price = rset.getFloat("Price");
                    Cijena = price;

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        return Cijena;
    }

    public static long dohvatiIDNextOfKin(Long PatientID) {
        long IDNextOfKin = 0;
        if (PatientID == null) {
            return IDNextOfKin;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT NextOfKinID from Patient where IDPatient=? order by IDPatient");

            pst.setLong(1, PatientID);
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long Izvuci = rset.getLong("NextOfKinID");

                    IDNextOfKin = Izvuci;

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        return IDNextOfKin;
    }

    public static long dohvatiChartId(Long PatientID) {
        long IDChart = 0;
        if (PatientID == null) {
            return IDChart;
        }
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT IDChart from Chart where PatientID=? order by PatientID");

            pst.setLong(1, PatientID);
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long Izvuci = rset.getLong("IDChart");

                    IDChart = Izvuci;

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        return IDChart;
    }

    public static List<Long> dohvatiChartIdDanasnji() {

        List<Long> IDChart = new ArrayList<Long>();
        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("Select c.IDChart from Chart as c inner join Patient as p on c.PatientID=p.IDPatient inner join Record as r on p.IDPatient=r.PatientID where DATEDIFF(day,r.RecordDate,getdate()) = 0");

            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long Izvuci = rset.getLong("IDChart");

                    IDChart.add(Izvuci);

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        return IDChart;
    }

    public static int dohvatiBrojPacijentaKojiSuImaliKonzultacije(int opcija, Date danasnjiSQL) {
        int broj1 = 0;
        int broj2 = 0;
        int broj3 = 0;

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        LocalDate danasnji = danasnjiSQL.toLocalDate();

        try {
            pst = con.prepareStatement("SELECT DateOfChekup from Checkup");

            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    java.time.LocalDate Datum = rset.getTimestamp("DateOfChekup").toLocalDateTime().toLocalDate();
                    int razlika = (int) ((danasnji.toEpochDay() - Datum.toEpochDay())) - 2;
                    switch (opcija) {
                        case 1:
                            if (razlika == 0) {
                                broj1 += 1;

                            }
                            break;
                        case 2:
                            if (razlika <= 7) {
                                broj2 += 1;
                            }
                            break;
                        case 3:
                            if (razlika <= 30) {
                                broj3 += 1;
                            }
                            break;
                        default:
                            break;
                    }

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        switch (opcija) {
            case 1:
                return broj1;
            case 2:
                return broj2;
            case 3:
                return broj3;
            default:
                return -1;

        }
    }

    public static int dohvatiBrojStarihPacijenta(int Option, Date danasnji) {
        int BrojStarihPacijenataUDanu = 0;
        int BrojStarihPacijenataUTjednu = 0;
        int BrojStarihPacijenataUMjesecu = 0;
        String trazeno;
        switch (Option) {
            case 1:
                trazeno = "Select distinct p.OIB from Appointment as a inner join Patient as p on a.PatientID=p.IDPatient where a.Date=?";
                break;
            case 2:
                trazeno = "Select distinct p.OIB from Appointment as a inner join Patient as p on a.PatientID=p.IDPatient WHERE DATEDIFF(day,a.[date],?) <=7";
                break;
            case 3:
                trazeno = "Select distinct p.OIB from Appointment as a inner join Patient as p on a.PatientID=p.IDPatient WHERE DATEDIFF(month,a.[date],?) <=1";
                break;
            default:
                return -1;

        }

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(trazeno);
            pst.setDate(1, danasnji);

            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    switch (Option) {
                        case 1:
                            BrojStarihPacijenataUDanu += 1;
                            break;
                        case 2:
                            BrojStarihPacijenataUTjednu += 1;
                            break;
                        case 3:
                            BrojStarihPacijenataUMjesecu += 1;
                            break;
                    }

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        switch (Option) {
            case 1:
                return BrojStarihPacijenataUDanu;
            case 2:
                return BrojStarihPacijenataUTjednu;
            case 3:
                return BrojStarihPacijenataUMjesecu;
            default:
                return -1;

        }

    }

    public static int dohvatiBrojNovihPacijenta(int Option, Date danasnji) {
        int BrojStarihPacijenataUDanu = 0;
        int BrojStarihPacijenataUTjednu = 0;
        int BrojStarihPacijenataUMjesecu = 0;
        String trazeno;
        switch (Option) {
            case 1:
                trazeno = "Select distinct p.OIB, p.IDPatient, a.IDAppointment, r.RecordDate from patient as p left outer join Appointment as a on p.IDPatient=a.PatientID left outer join Record as r on p.IDPatient=r.PatientID where a.IDAppointment is null and DATEDIFF(day,r.RecordDate,?) =0";
                break;
            case 2:
                trazeno = "Select distinct p.OIB, p.IDPatient, a.IDAppointment, r.RecordDate from patient as p left outer join Appointment as a on p.IDPatient=a.PatientID left outer join Record as r on p.IDPatient=r.PatientID where a.IDAppointment is null and DATEDIFF(day,r.RecordDate,?) <=7";
                break;
            case 3:
                trazeno = "Select distinct p.OIB, p.IDPatient, a.IDAppointment, r.RecordDate from patient as p left outer join Appointment as a on p.IDPatient=a.PatientID left outer join Record as r on p.IDPatient=r.PatientID where a.IDAppointment is null and DATEDIFF(day,r.RecordDate,?)<=1";
                break;
            default:
                return -1;

        }

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(trazeno);
            pst.setDate(1, danasnji);

            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    switch (Option) {
                        case 1:
                            BrojStarihPacijenataUDanu += 1;
                            break;
                        case 2:
                            BrojStarihPacijenataUTjednu += 1;
                            break;
                        case 3:
                            BrojStarihPacijenataUMjesecu += 1;
                            break;
                    }

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);

        switch (Option) {
            case 1:
                return BrojStarihPacijenataUDanu;
            case 2:
                return BrojStarihPacijenataUTjednu;
            case 3:
                return BrojStarihPacijenataUMjesecu;
            default:
                return -1;

        }

    }

    public static Patient dohvatiImePacijentaIOIB(long IDPacijenta) {
        String FirstName = null;
        String Surname = null;
        String OIB = null;

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT FirstName,Surname,OIB from Patient where IDPatient=?");
            pst.setLong(1, IDPacijenta);
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    FirstName = rset.getString("FirstName");
                    Surname = rset.getString("Surname");
                    OIB = rset.getString("OIB");

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);
        Patient pacijent = new Patient((int) IDPacijenta, FirstName, Surname, OIB);
        return pacijent;

    }

    public static List<Long> dohvatiIDSvihpacijenta() {
        List<Long> idPatientList = new ArrayList<Long>();

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT IDPatient from Patient");
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long Izvuci = rset.getLong("IDPatient");
                    idPatientList.add(Izvuci);

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);
        return idPatientList;

    }

    public static List<Long> dohvatiIDSvihLabTestova() {
        List<Long> idLabList = new ArrayList<Long>();

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT IDLaboratoryTest from LaboratoryTest");
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long Izvuci = rset.getLong("IDLaboratoryTest");
                    idLabList.add(Izvuci);

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);
        return idLabList;
    }

    public static List<Long> dohvatiIDSvihDoktora() {
        List<Long> idDoktorList = new ArrayList<Long>();

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT IDDoctor from Doctor");
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long Izvuci = rset.getLong("IDDoctor");
                    idDoktorList.add(Izvuci);

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);
        return idDoktorList;

    }

    public static List<Long> dohvatiIDSvihLijekova() {
        List<Long> idLijekovaList = new ArrayList<Long>();

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement("SELECT IDMedication from Medication");
            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    long Izvuci = rset.getLong("IDMedication");
                    idLijekovaList.add(Izvuci);

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);
        return idLijekovaList;

    }

    public static int dohvatiBrojDoktoraKojiSuRadili(int Option, Date danasnji) {

        int Broj = 0;

        String trazeno;
        switch (Option) {

            case 2:
                trazeno = "Select d.DoctorID from DoctorList as d inner join Chart as c on d.ChartID=c.IDChart inner join CheckupList as cl on c.IDChart=cl.ChartID inner join Checkup as ch on cl.CheckupID=ch.IDCheckup WHERE DATEDIFF(day,ch.DateOfChekup,?) <=7";
                break;
            case 3:
                trazeno = "Select d.DoctorID from DoctorList as d inner join Chart as c on d.ChartID=c.IDChart inner join CheckupList as cl on c.IDChart=cl.ChartID inner join Checkup as ch on cl.CheckupID=ch.IDCheckup WHERE DATEDIFF(month,ch.DateOfChekup,?) <=1";
                break;
            default:
                return -1;

        }

        Connection con = SpajanjeSBazom.noviConn();

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(trazeno);
            pst.setDate(1, danasnji);

            ResultSet rset = pst.executeQuery();
            try {
                while (rset.next()) {
                    switch (Option) {
                        case 2:
                            Broj += 1;
                            break;
                        case 3:
                            Broj += 1;
                            break;
                    }

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
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        SpajanjeSBazom.zatvoriConn(con);
        return Broj;

    }

}
