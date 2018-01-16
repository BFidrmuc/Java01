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
public class Record {

    private int IDRecord;
    private Date date;
    private int PatientID;
    private String BriefStatementOfCompaint;
    private String ContactTelephoneNumber1;
    private String ContactTelephoneNumber2;
    private String MaritalStatus;
    private int NoOfDependents;
    private float Height;
    private float Weight;
    private String BloodTypeRH;
    private String Occupation;
    private float GrossAnnualIncome;
    private String VegeterianNonVegetarian;
    private String Smoker;
    private float AverageOfCigarettesDay;
    private String ConsumeAlcoholicBeverage;
    private float AverageConsumeAlcoholicBeverageDay;
    private String UseStimulants;
    private float ConsuptionOfCoffeeTeaDay;
    private float ConsumptionSoftDriksDay;
    private String RegularMeals;
    private String EatingHomeOutside;
    private String StatementOfCoplaint;
    private String HistoryOfPrevioustreatment;
    private String PhysicianHospitaltreated;
    private String Diabetic;
    private String Hypertensive;
    private String CardiacCondition;
    private String RespiratoryCondition;
    private String DigestiveCondition;
    private String OrthopedicCondition;
    private String MuscularCondition;
    private String NeurologicalCondition;
    private String KnownAllergies;
    private String KnownAdverseReactionToSpecificDrugs;
    private String MajorSurgeries;

    public Record(Date date, int PatientID, String BriefStatementOfCompaint, String ContactTelephoneNumber1, String ContactTelephoneNumber2) {
        this.date = date;
        this.PatientID = PatientID;
        this.BriefStatementOfCompaint = BriefStatementOfCompaint;
        this.ContactTelephoneNumber1 = ContactTelephoneNumber1;
        this.ContactTelephoneNumber2 = ContactTelephoneNumber2;

    }

    public Record(int PatientID,String MaritalStatus, int NoOfDependents, float Height, float Weight, String BloodTypeRH, String Occupation, float GrossAnnualIncome, String VegeterianNonVegetarian, String Smoker, float AverageOfCigarettesDay, String ConsumeAlcoholicBeverage, float AverageConsumeAlcoholicBeverageDay, String UseStimulants, float ConsuptionOfCoffeeTeaDay, float ConsumptionSoftDriksDay, String RegularMeals, String EatingHomeOutside, String StatementOfCoplaint, String HistoryOfPrevioustreatment, String PhysicianHospitaltreated, String Diabetic, String Hypertensive, String CardiacCondition, String RespiratoryCondition, String DigestiveCondition, String OrthopedicCondition, String MuscularCondition, String NeurologicalCondition, String KnownAllergies, String KnownAdverseReactionToSpecificDrugs, String MajorSurgeries) {
        this.PatientID = PatientID;
        this.MaritalStatus = MaritalStatus;
        this.NoOfDependents = NoOfDependents;
        this.Height = Height;
        this.Weight = Weight;
        this.BloodTypeRH = BloodTypeRH;
        this.Occupation = Occupation;
        this.GrossAnnualIncome = GrossAnnualIncome;
        this.VegeterianNonVegetarian = VegeterianNonVegetarian;
        this.Smoker = Smoker;
        this.AverageOfCigarettesDay = AverageOfCigarettesDay;
        this.ConsumeAlcoholicBeverage = ConsumeAlcoholicBeverage;
        this.AverageConsumeAlcoholicBeverageDay = AverageConsumeAlcoholicBeverageDay;
        this.UseStimulants = UseStimulants;
        this.ConsuptionOfCoffeeTeaDay = ConsuptionOfCoffeeTeaDay;
        this.ConsumptionSoftDriksDay = ConsumptionSoftDriksDay;
        this.RegularMeals = RegularMeals;
        this.EatingHomeOutside = EatingHomeOutside;
        this.StatementOfCoplaint = StatementOfCoplaint;
        this.HistoryOfPrevioustreatment = HistoryOfPrevioustreatment;
        this.PhysicianHospitaltreated = PhysicianHospitaltreated;
        this.Diabetic = Diabetic;
        this.Hypertensive = Hypertensive;
        this.CardiacCondition = CardiacCondition;
        this.RespiratoryCondition = RespiratoryCondition;
        this.DigestiveCondition = DigestiveCondition;
        this.OrthopedicCondition = OrthopedicCondition;
        this.MuscularCondition = MuscularCondition;
        this.NeurologicalCondition = NeurologicalCondition;
        this.KnownAllergies = KnownAllergies;
        this.KnownAdverseReactionToSpecificDrugs = KnownAdverseReactionToSpecificDrugs;
        this.MajorSurgeries = MajorSurgeries;
    }

    public Record(int IDRecord, Date date, int PatientID, String BriefStatementOfCompaint, String ContactTelephoneNumber1, String ContactTelephoneNumber2, String MaritalStatus, int NoOfDependents, float Height, float Weight, String BloodTypeRH, String Occupation, float GrossAnnualIncome, String VegeterianNonVegetarian, String Smoker, float AverageOfCigarettesDay, String ConsumeAlcoholicBeverage, float AverageConsumeAlcoholicBeverageDay, String UseStimulants, float ConsuptionOfCoffeeTeaDay, float ConsumptionSoftDriksDay, String RegularMeals, String EatingHomeOutside, String StatementOfCoplaint, String HistoryOfPrevioustreatment, String PhysicianHospitaltreated, String Diabetic, String Hypertensive, String CardiacCondition, String RespiratoryCondition, String DigestiveCondition, String OrthopedicCondition, String MuscularCondition, String NeurologicalCondition, String KnownAllergies, String KnownAdverseReactionToSpecificDrugs, String MajorSurgeries) {
        this.IDRecord = IDRecord;
        this.date = date;
        this.PatientID = PatientID;
        this.BriefStatementOfCompaint = BriefStatementOfCompaint;
        this.ContactTelephoneNumber1 = ContactTelephoneNumber1;
        this.ContactTelephoneNumber2 = ContactTelephoneNumber2;
        this.MaritalStatus = MaritalStatus;
        this.NoOfDependents = NoOfDependents;
        this.Height = Height;
        this.Weight = Weight;
        this.BloodTypeRH = BloodTypeRH;
        this.Occupation = Occupation;
        this.GrossAnnualIncome = GrossAnnualIncome;
        this.VegeterianNonVegetarian = VegeterianNonVegetarian;
        this.Smoker = Smoker;
        this.AverageOfCigarettesDay = AverageOfCigarettesDay;
        this.ConsumeAlcoholicBeverage = ConsumeAlcoholicBeverage;
        this.AverageConsumeAlcoholicBeverageDay = AverageConsumeAlcoholicBeverageDay;
        this.UseStimulants = UseStimulants;
        this.ConsuptionOfCoffeeTeaDay = ConsuptionOfCoffeeTeaDay;
        this.ConsumptionSoftDriksDay = ConsumptionSoftDriksDay;
        this.RegularMeals = RegularMeals;
        this.EatingHomeOutside = EatingHomeOutside;
        this.StatementOfCoplaint = StatementOfCoplaint;
        this.HistoryOfPrevioustreatment = HistoryOfPrevioustreatment;
        this.PhysicianHospitaltreated = PhysicianHospitaltreated;
        this.Diabetic = Diabetic;
        this.Hypertensive = Hypertensive;
        this.CardiacCondition = CardiacCondition;
        this.RespiratoryCondition = RespiratoryCondition;
        this.DigestiveCondition = DigestiveCondition;
        this.OrthopedicCondition = OrthopedicCondition;
        this.MuscularCondition = MuscularCondition;
        this.NeurologicalCondition = NeurologicalCondition;
        this.KnownAllergies = KnownAllergies;
        this.KnownAdverseReactionToSpecificDrugs = KnownAdverseReactionToSpecificDrugs;
        this.MajorSurgeries = MajorSurgeries;
    }

    public Record(Date date, int PatientID, String BriefStatementOfCompaint, String ContactTelephoneNumber1, String ContactTelephoneNumber2, String MaritalStatus, int NoOfDependents, float Height, float Weight, String BloodTypeRH, String Occupation, float GrossAnnualIncome, String VegeterianNonVegetarian, String Smoker, float AverageOfCigarettesDay, String ConsumeAlcoholicBeverage, float AverageConsumeAlcoholicBeverageDay, String UseStimulants, float ConsuptionOfCoffeeTeaDay, float ConsumptionSoftDriksDay, String RegularMeals, String EatingHomeOutside, String StatementOfCoplaint, String HistoryOfPrevioustreatment, String PhysicianHospitaltreated, String Diabetic, String Hypertensive, String CardiacCondition, String RespiratoryCondition, String DigestiveCondition, String OrthopedicCondition, String MuscularCondition, String NeurologicalCondition, String KnownAllergies, String KnownAdverseReactionToSpecificDrugs, String MajorSurgeries) {

        this.date = date;
        this.PatientID = PatientID;
        this.BriefStatementOfCompaint = BriefStatementOfCompaint;
        this.ContactTelephoneNumber1 = ContactTelephoneNumber1;
        this.ContactTelephoneNumber2 = ContactTelephoneNumber2;
        this.MaritalStatus = MaritalStatus;
        this.NoOfDependents = NoOfDependents;
        this.Height = Height;
        this.Weight = Weight;
        this.BloodTypeRH = BloodTypeRH;
        this.Occupation = Occupation;
        this.GrossAnnualIncome = GrossAnnualIncome;
        this.VegeterianNonVegetarian = VegeterianNonVegetarian;
        this.Smoker = Smoker;
        this.AverageOfCigarettesDay = AverageOfCigarettesDay;
        this.ConsumeAlcoholicBeverage = ConsumeAlcoholicBeverage;
        this.AverageConsumeAlcoholicBeverageDay = AverageConsumeAlcoholicBeverageDay;
        this.UseStimulants = UseStimulants;
        this.ConsuptionOfCoffeeTeaDay = ConsuptionOfCoffeeTeaDay;
        this.ConsumptionSoftDriksDay = ConsumptionSoftDriksDay;
        this.RegularMeals = RegularMeals;
        this.EatingHomeOutside = EatingHomeOutside;
        this.StatementOfCoplaint = StatementOfCoplaint;
        this.HistoryOfPrevioustreatment = HistoryOfPrevioustreatment;
        this.PhysicianHospitaltreated = PhysicianHospitaltreated;
        this.Diabetic = Diabetic;
        this.Hypertensive = Hypertensive;
        this.CardiacCondition = CardiacCondition;
        this.RespiratoryCondition = RespiratoryCondition;
        this.DigestiveCondition = DigestiveCondition;
        this.OrthopedicCondition = OrthopedicCondition;
        this.MuscularCondition = MuscularCondition;
        this.NeurologicalCondition = NeurologicalCondition;
        this.KnownAllergies = KnownAllergies;
        this.KnownAdverseReactionToSpecificDrugs = KnownAdverseReactionToSpecificDrugs;
        this.MajorSurgeries = MajorSurgeries;
    }

    public float getAverageConsumeAlcoholicBeverageDay() {
        return AverageConsumeAlcoholicBeverageDay;
    }

    public float getAverageOfCigarettesDay() {
        return AverageOfCigarettesDay;
    }

    public String getBloodTypeRH() {
        return BloodTypeRH;
    }

    public String getBriefStatementOfCompaint() {
        return BriefStatementOfCompaint;
    }

    public String getCardiacCondition() {
        return CardiacCondition;
    }

    public String getConsumeAlcoholicBeverage() {
        return ConsumeAlcoholicBeverage;
    }

    public float getConsumptionSoftDriksDay() {
        return ConsumptionSoftDriksDay;
    }

    public float getConsuptionOfCoffeeTeaDay() {
        return ConsuptionOfCoffeeTeaDay;
    }

    public String getContactTelephoneNumber1() {
        return ContactTelephoneNumber1;
    }

    public String getContactTelephoneNumber2() {
        return ContactTelephoneNumber2;
    }

    public Date getDate() {
        return date;
    }

    public String getDiabetic() {
        return Diabetic;
    }

    public String getDigestiveCondition() {
        return DigestiveCondition;
    }

    public String getEatingHomeOutside() {
        return EatingHomeOutside;
    }

    public float getGrossAnnualIncome() {
        return GrossAnnualIncome;
    }

    public float getHeight() {
        return Height;
    }

    public String getHistoryOfPrevioustreatment() {
        return HistoryOfPrevioustreatment;
    }

    public float getWeight() {
        return Weight;
    }

    public String getVegeterianNonVegetarian() {
        return VegeterianNonVegetarian;
    }

    public String getUseStimulants() {
        return UseStimulants;
    }

    public String getSmoker() {
        return Smoker;
    }

    public String getStatementOfCoplaint() {
        return StatementOfCoplaint;
    }

    public String getRespiratoryCondition() {
        return RespiratoryCondition;
    }

    public String getRegularMeals() {
        return RegularMeals;
    }


    public String getPhysicianHospitaltreated() {
        return PhysicianHospitaltreated;
    }

    public int getPatientID() {
        return PatientID;
    }

    public String getOrthopedicCondition() {
        return OrthopedicCondition;
    }

    public String getOccupation() {
        return Occupation;
    }

    public int getNoOfDependents() {
        return NoOfDependents;
    }

    public String getNeurologicalCondition() {
        return NeurologicalCondition;
    }

    public String getMuscularCondition() {
        return MuscularCondition;
    }

    public String getMaritalStatus() {
        return MaritalStatus;
    }

    public String getMajorSurgeries() {
        return MajorSurgeries;
    }

    public String getKnownAllergies() {
        return KnownAllergies;
    }

    public String getKnownAdverseReactionToSpecificDrugs() {
        return KnownAdverseReactionToSpecificDrugs;
    }

    public int getIDRecord() {
        return IDRecord;
    }

    public String getHypertensive() {
        return Hypertensive;
    }

    public void setAverageConsumeAlcoholicBeverageDay(float AverageConsumeAlcoholicBeverageDay) {
        this.AverageConsumeAlcoholicBeverageDay = AverageConsumeAlcoholicBeverageDay;
    }

    public void setAverageOfCigarettesDay(float AverageOfCigarettesDay) {
        this.AverageOfCigarettesDay = AverageOfCigarettesDay;
    }

    public void setBloodTypeRH(String BloodTypeRH) throws Exception {
        if (BloodTypeRH.length() <= 50) {
            this.BloodTypeRH = BloodTypeRH;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setBriefStatementOfCompaint(String BriefStatementOfCompaint) throws Exception {
        if (BriefStatementOfCompaint.length() <= 200) {
            this.BriefStatementOfCompaint = BriefStatementOfCompaint;
        } else {
            throw new Exception("Najvise 200 znakova.");
        }
    }

    public void setCardiacCondition(String CardiacCondition) throws Exception {
        if (CardiacCondition.length() <= 50) {
            this.CardiacCondition = CardiacCondition;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setConsumeAlcoholicBeverage(String ConsumeAlcoholicBeverage) throws Exception {
        if (ConsumeAlcoholicBeverage.length() <= 50) {
            this.ConsumeAlcoholicBeverage = ConsumeAlcoholicBeverage;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setConsumptionSoftDriksDay(float ConsumptionSoftDriksDay) {
        this.ConsumptionSoftDriksDay = ConsumptionSoftDriksDay;
    }

    public void setConsuptionOfCoffeeTeaDay(float ConsuptionOfCoffeeTeaDay) {
        this.ConsuptionOfCoffeeTeaDay = ConsuptionOfCoffeeTeaDay;
    }

    public void setContactTelephoneNumber1(String ContactTelephoneNumber1) throws Exception {
        if (ContactTelephoneNumber1.length() <= 50) {
            this.ContactTelephoneNumber1 = ContactTelephoneNumber1;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setContactTelephoneNumber2(String ContactTelephoneNumber2) throws Exception {
        if (ContactTelephoneNumber2.length() <= 50) {
            this.ContactTelephoneNumber2 = ContactTelephoneNumber2;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDiabetic(String Diabetic) throws Exception {
        if (Diabetic.length() <= 50) {
            this.Diabetic = Diabetic;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setDigestiveCondition(String DigestiveCondition) throws Exception {
        if (DigestiveCondition.length() <= 50) {
            this.DigestiveCondition = DigestiveCondition;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setEatingHomeOutside(String EatingHomeOutside) throws Exception {
        if (EatingHomeOutside.length() <= 50) {
            this.EatingHomeOutside = EatingHomeOutside;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setGrossAnnualIncome(float GrossAnnualIncome) {
        this.GrossAnnualIncome = GrossAnnualIncome;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }

    public void setHistoryOfPrevioustreatment(String HistoryOfPrevioustreatment) throws Exception {
        if (HistoryOfPrevioustreatment.length() <= 200) {
            this.HistoryOfPrevioustreatment = HistoryOfPrevioustreatment;
        } else {
            throw new Exception("Najvise 200 znakova.");
        }
    }

    public void setHypertensive(String Hypertensive) throws Exception {
        if (Hypertensive.length() <= 50) {
            this.Hypertensive = Hypertensive;
        } else {
            throw new Exception("Najvise 200 znakova.");
        }
    }

    public void setIDRecord(int IDRecord) {
        this.IDRecord = IDRecord;
    }

    public void setKnownAdverseReactionToSpecificDrugs(String KnownAdverseReactionToSpecificDrugs) throws Exception {
        if (KnownAdverseReactionToSpecificDrugs.length() <= 200) {
            this.KnownAdverseReactionToSpecificDrugs = KnownAdverseReactionToSpecificDrugs;
        } else {
            throw new Exception("Najvise 200 znakova.");
        }
    }

    public void setKnownAllergies(String KnownAllergies) throws Exception {
        if (KnownAllergies.length() <= 200) {
            this.KnownAllergies = KnownAllergies;
        } else {
            throw new Exception("Najvise 200 znakova.");
        }
    }

    public void setMajorSurgeries(String MajorSurgeries) throws Exception {
        if (MajorSurgeries.length() <= 200) {
            this.MajorSurgeries = MajorSurgeries;
        } else {
            throw new Exception("Najvise 200 znakova.");
        }
    }

    public void setMaritalStatus(String MaritalStatus) throws Exception {
        if (MaritalStatus.length() <= 50) {
            this.MaritalStatus = MaritalStatus;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setMuscularCondition(String MuscularCondition) throws Exception {
        if (MuscularCondition.length() <= 50) {
            this.MuscularCondition = MuscularCondition;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setNeurologicalCondition(String NeurologicalCondition) throws Exception {
        if (NeurologicalCondition.length() <= 50) {
            this.NeurologicalCondition = NeurologicalCondition;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setNoOfDependents(int NoOfDependents) {
        this.NoOfDependents = NoOfDependents;
    }

    public void setOccupation(String Occupation) throws Exception {
        if (Occupation.length() <= 50) {
            this.Occupation = Occupation;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setOrthopedicCondition(String OrthopedicCondition) throws Exception {
        if (OrthopedicCondition.length() <= 50) {
            this.OrthopedicCondition = OrthopedicCondition;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public void setPhysicianHospitaltreated(String PhysicianHospitaltreated) throws Exception {
        if (PhysicianHospitaltreated.length() <= 200) {
            this.PhysicianHospitaltreated = PhysicianHospitaltreated;
        } else {
            throw new Exception("Najvise 200 znakova.");
        }
    }


    public void setRegularMeals(String RegularMeals) throws Exception {
        if (RegularMeals.length() <= 100) {
            this.RegularMeals = RegularMeals;
        } else {
            throw new Exception("Najvise 100 znakova.");
        }
    }

    public void setRespiratoryCondition(String RespiratoryCondition) throws Exception {
        if (RespiratoryCondition.length() <= 50) {
            this.RespiratoryCondition = RespiratoryCondition;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setSmoker(String Smoker) throws Exception {
        if (Smoker.length() <= 50) {
            this.Smoker = Smoker;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setStatementOfCoplaint(String StatementOfCoplaint) throws Exception {
        if (StatementOfCoplaint.length() <= 200) {
            this.StatementOfCoplaint = StatementOfCoplaint;
        } else {
            throw new Exception("Najvise 200 znakova.");
        }
    }

    public void setUseStimulants(String UseStimulants) throws Exception {
        if (UseStimulants.length() <= 50) {
            this.UseStimulants = UseStimulants;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setVegeterianNonVegetarian(String VegeterianNonVegetarian) throws Exception {
        if (VegeterianNonVegetarian.length() <= 50) {
            this.VegeterianNonVegetarian = VegeterianNonVegetarian;
        } else {
            throw new Exception("Najvise 50 znakova.");
        }
    }

    public void setWeight(float Weight) {
        this.Weight = Weight;
    }

    @Override
    public String toString() {
        return "Rijesi to";
    }

}
