/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojekt;

import PomocneKlase.PomocniPatientICijena;
import PomocneKlase.Validation;
import RadSBazom.Address;
import RadSBazom.Appointment;
import RadSBazom.Chart;
import RadSBazom.Checkup;
import RadSBazom.CheckupList;
import RadSBazom.Contact;

import RadSBazom.DoctorList;
import RadSBazom.LaboratoryTestList;
import RadSBazom.MedicationList;
import RadSBazom.NextOfKin;
import RadSBazom.Patient;
import RadSBazom.Record;
import RadSBazom.SelectIzBaze;
import RadSBazom.UpdateSBazom;
import RadSBazom.UpisivanjeUBazu;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Bruno-PC
 */
public class Konzola {

    Scanner in = new Scanner(System.in);
    Validation valid = new Validation();

    UpisivanjeUBazu upis = new UpisivanjeUBazu();
    UpdateSBazom upisUpdate = new UpdateSBazom();
    SelectIzBaze selectIzBaze = new SelectIzBaze();

    public void Meni() {

        System.out.println("1) Upisi MRF");
        System.out.println("2) Upisi CRF");
        System.out.println("3) Dodaj pretragu");
        System.out.println("4) Propisati lijek ");
        System.out.println("5) Dodaj pregled");
        System.out.println("6) Naruci pacijenta");
        System.out.println("7) Racun");
        System.out.println("8) Izvješće");
        System.out.println("9) Gui");

        int i = unosBrojaInt("Unesite odabir: ");

        switch (i) {
            case 1:
                prvaOpcija();
                break;
            case 2:
                drugaOpcija();
                break;
            case 3:
                trecaOpcija();
                break;
            case 4:
                cetvrtaOpcija();
                break;
            case 5:
                petaOpcija();
                break;
            case 6:
                sestaOpcija();
                break;
            case 7:
                sedmaOpcija();
                break;
            case 8:
                osmaOpcija();
                break;
            case 9:
                deveta();

                break;

            case 0:

                break;

        }

    }

    public boolean provjeraBrojeva(String provjera) {

        for (char c : provjera.toCharArray()) {
            if (!Character.isDigit(c)) {

                return false;
            }
        }
        return true;

    }

    public Date danasnjiDan() {
        return petvaranjeDatuma(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
    }

    public boolean provjeraFloata(String provjera) {
        float a;
        try {
            a = Float.parseFloat(provjera);
        } catch (Exception e) {
            return false;
        }
        return true;

    }

    public int unosIDPacijenta(String upis) {
        int IDPacijenta;
        do {
            IDPacijenta = unosBrojaInt(upis);
        } while (!valid.provjeriIDPacijenta(IDPacijenta));
        return IDPacijenta;
    }

    public float unosBrojaFloat(String upis) {

        String linija;
        do {
            System.out.println(upis);
            linija = in.next();

        } while (!provjeraFloata(linija));
        float a = Float.parseFloat(linija);
        return a;

    }

    public int unosBrojaInt(String upis) {

        String Unos;

        int unos;

        do {
            System.out.println(upis);
            Unos = in.next();
        } while (!provjeraBrojeva(Unos));
        unos = Integer.parseInt(Unos);
        in.nextLine();
        return unos;

    }

    public boolean provjeraSlova(String provjera) {
        in.nextLine();
        for (char c : provjera.toCharArray()) {
            if (Character.isDigit(c)) {

                return false;
            }
        }
        return true;

    }

    public String unosString(String upis) {
        String unos;
        do {
            System.out.println(upis);
            unos = in.next();
        } while (!provjeraSlova(unos));
        return unos;
    }

    public String unosTelefona(String upis) {
        String telefon;
        do {
            System.out.println(upis);
            telefon = in.next();
        } while (!provjeraBrojeva(telefon));

        return telefon;
    }

    public void povratanNaMeni() {

        String Vrati = null;
        Vrati = yesNo("Povratak ne meni? (Yes/No)");

        if (Vrati.equals("Yes")) {
            Meni();
        }
    }

    public String yesNo(String upit) {

        String tocan;
        do {
            System.out.println(upit);

            tocan = in.nextLine();

        } while (!"Yes".equals(tocan) && !"No".equals(tocan));

        return tocan;
    }

    public Date petvaranjeDatuma(int Godina, int Mjesec, int Dan) {

        SimpleDateFormat sdf = new SimpleDateFormat(
                "MM-dd-yyyy");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Godina);
        cal.set(Calendar.MONTH, Mjesec);
        cal.set(Calendar.DAY_OF_MONTH, Dan);

        java.sql.Date date = new java.sql.Date(cal.getTimeInMillis());
        System.out.println(sdf.format(date));
        return date;

    }

    public void prvaOpcija() {

        System.out.println("===Upisivanje MRF-a ===");

        String FirstName = unosString("Upisite ime pacijenta: ");

        String MiddleName = unosString("Upisite drugo ime pacijenta: ");

        String Surname = unosString("Upisite prezime pacijenta: ");

        String OIB;
        do {
            System.out.println("Upisite OIB pacijenta(13 brojeva)");
            OIB = in.next();
        } while (!OIB.matches("[0-9]{13}"));

        String Spol;
        do {
            System.out.println("Upisite spol pacijenta(Male/Female)");
            Spol = in.next();
        } while (!"Male".equals(Spol) && !"Female".equals(Spol));

        int godina;
        do {

            godina = unosBrojaInt("Unesite godinu rodenja: ");

        } while (godina <= 1800 || godina >= 2017);

        int mjesec;
        do {

            mjesec = unosBrojaInt("Unesite mjesec rodenja: ");

        } while (mjesec <= 0 || mjesec >= 13);

        String Dan;
        int dan;
        do {
            dan = unosBrojaInt("Unesite dan rodenja:");
        } while (dan <= 0 || dan >= 32);

        Date datum = petvaranjeDatuma(godina, mjesec, dan);

        System.out.println("Kratka izjava o stanju: ");
        String Stanje = in.next();
        in.nextLine();

        String PrviTelefon = unosTelefona("Kontakt telefon 1 :");

        String DrugiTelefon = unosTelefona("Kontakt telefon 2 :");

        String FirstNamerodaka = unosString("Unesite ime rodaka: ");

        String MiddleNamerodaka = unosString("Unesite sredjne ime rodaka: ");

        String Surnamerodaka = unosString("Unesite prezime rodaka: ");

        String Relationship = unosString("Odnos s pacijentom: ");

        NextOfKin rodak = new NextOfKin(FirstNamerodaka, MiddleNamerodaka, Surnamerodaka, Relationship);
        long rodaka = upis.unesiNoviNextOfKin(rodak);
        Patient pacijent = new Patient(FirstName, MiddleName, Surname, Spol, datum, OIB, (int) rodaka);
        long pacijentid = upis.unesiNovogPacijenta(pacijent);

        Date danasnjidan = petvaranjeDatuma(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));

        Chart karton = new Chart((int) pacijentid);

        upis.unesiChart(karton);

        Record rekord = new Record(danasnjidan, (int) pacijentid, Stanje, PrviTelefon, DrugiTelefon);
        upis.unesiRecord(rekord);
        System.out.println("Id unesenog pacijenta je= " + pacijentid);

        povratanNaMeni();

    }

    private long unosAdrese() {

        int KucniBroj = unosBrojaInt("Broj kuce");
        String NazivUlice = unosString("Upisite naziv ulice");
        String NazivKvarta = unosString("Unesite naziv kvarta");
        String NazivGrada = unosString("Unesite naziv grada");
        String NazivDrzave = unosString("Unesite naziv drzave");
        int PostanskiBroj = unosBrojaInt("Unesite postanski broj");
        Address Adresa = new Address(KucniBroj, NazivUlice, NazivKvarta, NazivGrada, NazivDrzave, PostanskiBroj);
        long Address = upis.unesiAddress(Adresa);
        return Address;
    }

    private long unesiKontakt() {

        String BrojTelefonaPosao = unosTelefona("Broj telefona(Posao):");
        String Kucni = unosTelefona("Broj telefona(kucni)");
        String BrojMobitela = unosTelefona("Broj mobitela: ");
        String Pager = unosTelefona("Pager: ");
        String Fax = unosTelefona("Broj faksa: ");

        String Mail;
        do {
            in.nextLine();
            System.out.println("Unesite mail: ");
            Mail = in.next();
        } while (!valid.email_Validation(Mail));
        in.nextLine();

        Contact Kontakt = new Contact(BrojTelefonaPosao, Kucni, BrojMobitela, Pager, Fax, Mail);
        long KontaktID = upis.unesiNoviContact(Kontakt);
        return KontaktID;
    }

    private void drugaOpcija() {

        System.out.println("===Upisivanje CRF-a ===");

        int IDPacijenta = unosIDPacijenta("unesite id pacijenta kojem unosite CRF");

        System.out.println("=Unesite trenutnu adresu=");
        long TrenutnaAdresaPacijenta = unosAdrese();

        System.out.println("=Unesite stalnu adresu=");
        long StalnaAdresaPacijenta = unosAdrese();

        System.out.println("=Unesite kontakt=");
        long KontaktPacijentaID = unesiKontakt();

        upisUpdate.updatePacijenta(IDPacijenta, StalnaAdresaPacijenta, KontaktPacijentaID, TrenutnaAdresaPacijenta);

        long IDrodaka = selectIzBaze.dohvatiIDNextOfKin((long) IDPacijenta);

        System.out.println("=Unesite adresu rodaka=");
        long AdresaRodaka = unosAdrese();

        System.out.println("Unesite kontakt rodaka=");
        long KontaktRodaka = unesiKontakt();

        upisUpdate.updateNextOfKin(IDrodaka, AdresaRodaka, KontaktRodaka);

        String MaritalStatus = unosString("Unesite bracni status:");

        int NOOfDependents = unosBrojaInt("Unesite broj ljudi koje uzdrzavate: ");

        float Height = unosBrojaFloat("Unesite visinu: ");

        float Weight = unosBrojaFloat("Unesite tezinu");
        in.nextLine();

        System.out.println("Unesite krvnu grupu");
        String BloodType = in.nextLine();

        String Occupation = unosString("unesite zanimanje: ");

        float GrossAnnualincome = unosBrojaFloat("Unesite bruto godisnji prihod");
        in.nextLine();
        String Vegeterian = yesNo("Vegeterijanac (Yes/No)");

        String Smoker = yesNo("Pusac (Yes/No)");

        float NoOfCigarettes = 0;
        if ("Yes".equals(Smoker)) {
            NoOfCigarettes = unosBrojaFloat("Unesite prosjecan broj cigarete koje zapalite u danu:");
        }

        String Alkohol = yesNo("Pijete li alkohol (Yes/No)");

        float NoAlcohol = 0;
        if ("Yes".equals(Alkohol)) {
            NoAlcohol = unosBrojaFloat("Unesite prosjecan broj cigarete koje zapalite u danu:");
        }

        String Stimulants = unosString("Unesite stimulanse ako ih uzimate");

        float KavaCaj = unosBrojaFloat("Unesite koliko kava/caja popijete dnevno:");

        float SoftDrinks = unosBrojaFloat("Unesite koliko bezalkoholnih pica popijete dnevno:");
        in.nextLine();
        String Meals = yesNo("imate redovne obroke dorucak/rucak/veceru (Yes/No)");

        String EatOutHome;
        do {
            System.out.println("Jedete li vani ili doma pretezno (Home/Out)");
            EatOutHome = in.next();
        } while (!"Home".equals(EatOutHome) && !"Out".equals(EatOutHome));

        String StatmentOfComplaint = unosString("Zalbe, bolovi:");

        String History = unosString("Povijest prijasnjih tretmana: ");

        String Treated = unosString("Doktor/Bolnica u kojoj ste bili prethodno: ");

        String Diabetic = yesNo("Jeste li diabeticar?(Yes/No)");

        String Hypertensive = yesNo("Jeste li hipertenzivni?(Yes/No)");

        String CardiacCondition = unosString("Kakvo vam je stanje srca?");

        String RespiratoryCondition = unosString("Kakvo vam je stanje disnih puteva?");

        String DigestiveCondition = unosString("Stanje probavnog sustava: ");

        String OrthopedicCondition = unosString("Ortopedsko stanje: ");

        String MuscularCondition = unosString("Stanje misica: ");

        String NeurologicalCondition = unosString("Mentalno stanje");

        String KnownAllergies = unosString("Alergije: ");

        String Reaction = unosString("Reakcije na specificne lijekove: ");

        String MajorSurgeries = unosString("Prijasnje operacije: ");

        Record recZaupdate = new Record(IDPacijenta, MaritalStatus, NOOfDependents, Height, Weight, BloodType, Occupation, GrossAnnualincome, Vegeterian, Smoker, NoOfCigarettes, Alkohol, NoAlcohol, Stimulants, KavaCaj, SoftDrinks, Meals, EatOutHome, StatmentOfComplaint, History, Treated, Diabetic, Hypertensive, CardiacCondition, RespiratoryCondition, DigestiveCondition, OrthopedicCondition, MuscularCondition, NeurologicalCondition, KnownAllergies, Reaction, MajorSurgeries);
        upisUpdate.updateRecord(recZaupdate);
        povratanNaMeni();

    }

    private void trecaOpcija() {

        System.out.println("==Dodaj pretragu==");
        int IDPretrage;
        do {
            IDPretrage = unosBrojaInt("Unesite ID pretrage");
        } while (!valid.provjeriIDLabTesta(IDPretrage));

        int IDPacijenta = unosIDPacijenta("Unesite id pacijenta kojem zelite dodati pretragu: ");

        long IDChart = selectIzBaze.dohvatiChartId((long) IDPacijenta);
        LaboratoryTestList lista = new LaboratoryTestList((int) IDChart, IDPretrage);
        upis.unesiLabTestList(lista);
        povratanNaMeni();

    }

    private void cetvrtaOpcija() {
        System.out.println("==Unosenje lijekova==");

        int IDPacijenta = unosIDPacijenta("Unesite ID pacijenta kojem zelite propisti lijek");

        int IDLijeka;
        do {
            IDLijeka = unosBrojaInt("Unesite ID lijeka: ");
        } while (!valid.provjeriIDLijeka(IDLijeka));

        long IDChart = selectIzBaze.dohvatiChartId((long) IDPacijenta);
        MedicationList lista = new MedicationList((int) IDChart, IDLijeka);
        upis.unesiMedList(lista);
        povratanNaMeni();
    }

    private void petaOpcija() {
        System.out.println("==Unosenje pregleda==");

        String NazivPregleda = unosString("Upisite naziv pregleda:");

        Float Cijena = unosBrojaFloat("Unesite cijenu pregleda: ");
        Date Danasnjidan = danasnjiDan();

        Checkup Pregled = new Checkup(NazivPregleda, Cijena, Danasnjidan);
        long IDPregleda = upis.unesiCheckup(Pregled);

        int IDPacijenta = unosIDPacijenta("Unesite ID pacijenta kojem zelite zapisati pregled");

        long IDChart = selectIzBaze.dohvatiChartId((long) IDPacijenta);
        CheckupList lista = new CheckupList((int) IDChart, (int) IDPregleda);
        upis.unesiCheckupList(lista);
        int IDDoktora;
        do {
            IDDoktora = unosBrojaInt("Unesite ID doktora koji je izvršio pregled:");
        } while (!valid.provjeriIDDoktora(IDDoktora));

        DoctorList listadoktora = new DoctorList((int) IDChart, IDDoktora);
        upis.unesiDoctorList(listadoktora);
        povratanNaMeni();
    }

    private void sestaOpcija() {

        System.out.println("==Narucite pacijenta==");
        System.out.println("=Unesite datum=");
        Date danasnjidan = danasnjiDan();
        Date datum;
        do {

            int godina;
            do {

                godina = unosBrojaInt("Unesite godinu: ");

            } while (godina < 2017);
            int mjesec;
            do {

                mjesec = unosBrojaInt("Unesite mjesec: ");
            } while (mjesec <= 0 || mjesec >= 13);
            int dan;
            do {

                dan = unosBrojaInt("Unesite dan: ");
            } while (dan <= 0 || dan >= 32);

            datum = petvaranjeDatuma(godina, mjesec, dan);
        } while (danasnjidan.compareTo(datum) > 0);

        int IDDoktora;
        do {
            IDDoktora = unosBrojaInt("Unesite ID doktora kod kojeg narucujete pacijenta: ");
        } while (valid.provjeriIDDoktora(IDDoktora));

        int IDpacijenta = unosIDPacijenta("Unesite ID pacijenta");

        Appointment app = new Appointment(datum, IDDoktora, IDpacijenta);
        upis.unesiAppointment(app);
        povratanNaMeni();

    }

    private void sedmaOpcija() {
        System.out.println("==Ispis racun==");
        int IDPacijenta = unosIDPacijenta("Unesite ID pacijenta za kojeg zelite ispisati racun:");
        long IDChart = selectIzBaze.dohvatiChartId((long) IDPacijenta);
        float CijaneLijekova = 0;
        float CijenaLab = 0;
        float CijenaKon = 0;
        CijaneLijekova = selectIzBaze.dohvatiIDLijekova((int) IDChart);
        CijenaLab = selectIzBaze.dohvatiIDLabTestova((int) IDChart);
        CijenaKon = selectIzBaze.dohvatiIDKonzultacija((int) IDChart);
        System.out.println("Ukupna cijana lijekova je=" + CijaneLijekova);
        System.out.println("Ukupna cijana pretraga je=" + CijenaLab);
        System.out.println("Ukupna cijana konzultacija/pretraga je=" + CijenaKon);
        float UkupnaCijena = CijaneLijekova + CijenaLab + CijenaKon;
        System.out.println("Ukupna cijana =" + UkupnaCijena);
        povratanNaMeni();

    }

    public void brojPacijenataVidenihOdStraneDoktora(int opcija) {
        Date danasnjidan = danasnjiDan();

        int BrojPacijenata;
        BrojPacijenata = selectIzBaze.dohvatiBrojPacijentaKojiSuImaliKonzultacije(opcija, danasnjidan);
        System.out.println(BrojPacijenata);

    }

    public void brojStarijPacijenata(int Opcija) {
        Date danasnjidan = danasnjiDan();
        int broj = selectIzBaze.dohvatiBrojStarihPacijenta(Opcija, danasnjidan);
        if (broj == -1) {
            System.out.println(0);

        } else {
            System.out.println(broj);
        }

    }

    public void brojNovihPacijenata(int Opcija) {
        Date danasnjidan = danasnjiDan();
        int broj = selectIzBaze.dohvatiBrojNovihPacijenta(Opcija, danasnjidan);
        if (broj == -1) {
            System.out.println(0);

        } else {
            System.out.println(broj);
        }

    }

    public void ispisSvihNaplativihUsluga() {
        /*
        List<PomocniPatientICijena> pacijentICijena = new ArrayList<PomocniPatientICijena>();

        List<Long> idPatientList = new ArrayList<Long>();
        idPatientList = selectIzBaze.dohvatiIDSvihpacijenta();
        for (Long i : idPatientList) {
            long IDChart = selectIzBaze.dohvatiChartIdDanasnji();
            Patient ImePacijenta;
            ImePacijenta = selectIzBaze.dohvatiImePacijentaIOIB(i);

            float CijaneLijekova = 0;
            float CijenaLab = 0;
            float CijenaKon = 0;
            CijaneLijekova = selectIzBaze.dohvatiIDLijekova((int) IDChart);
            CijenaLab = selectIzBaze.dohvatiIDLabTestova((int) IDChart);
            CijenaKon = selectIzBaze.dohvatiIDKonzultacija((int) IDChart);
            PomocniPatientICijena Pomocni = new PomocniPatientICijena(ImePacijenta, CijaneLijekova, CijenaLab, CijenaKon);
            pacijentICijena.add(Pomocni);

        }
         */
        List<Long> IDChart = new ArrayList<Long>();
        IDChart = selectIzBaze.dohvatiChartIdDanasnji();
        float CijaneLijekova = 0;
        float CijenaLab = 0;
        float CijenaKon = 0;

        for (long i : IDChart) {

            CijaneLijekova += selectIzBaze.dohvatiIDLijekova((int) i);
            CijenaLab += selectIzBaze.dohvatiIDLabTestova((int) i);
            CijenaKon += selectIzBaze.dohvatiIDKonzultacija((int) i);

        }
        System.out.println("Cijena prodanih lijekova danas: " + CijaneLijekova);
        System.out.println("Cijena provedenih medicinskih testova danas: : " + CijenaLab);
        System.out.println("Cijena pregleda danas: " + CijenaKon);

    }

    private void dailyReport(int opcija) {
        System.out.println("Broj pacijenta koji su primljeni kod doktora danas");
        brojPacijenataVidenihOdStraneDoktora(opcija);
        System.out.println("Broj starih pacijenata : ");
        brojStarijPacijenata(opcija);
        System.out.println("Broj novih pacijenata: ");
        brojNovihPacijenata(opcija);
        System.out.println("Ispis svih naplativih usluga");
        ispisSvihNaplativihUsluga();

    }

    private void weeklyReport(int opcija) {

        System.out.println("Broj starih pacijenata: ");
        brojStarijPacijenata(opcija);
        System.out.println("Broj novih pacijenata: ");
        brojNovihPacijenata(opcija);

        Date danasnjidan = danasnjiDan();
        int BrojPacijenata = selectIzBaze.dohvatiBrojPacijentaKojiSuImaliKonzultacije(opcija, danasnjidan);
        int BrojDoktora = selectIzBaze.dohvatiBrojDoktoraKojiSuRadili(opcija, danasnjidan);
        if (BrojDoktora == 0) {
            System.out.println("ovaj tjedan niti jedan doktor nije radio");
        } else {
            int BrojPacijenataLijecenihOdStraneDoktora = BrojPacijenata / (BrojDoktora * 7);
            System.out.println("Prosjecni broj pacijenata lijecen on strane doktora: " + BrojPacijenataLijecenihOdStraneDoktora);
        }
    }

    private void monthlyReport(int opcija) {

        System.out.println("Broj starih pacijenata: ");
        brojStarijPacijenata(opcija);
        System.out.println("Broj novih pacijenata: ");
        brojNovihPacijenata(opcija);

        Date danasnjidan = danasnjiDan();
        int BrojPacijenata = selectIzBaze.dohvatiBrojPacijentaKojiSuImaliKonzultacije(opcija, danasnjidan);
        int BrojDoktora = selectIzBaze.dohvatiBrojDoktoraKojiSuRadili(opcija, danasnjidan);
        if (BrojDoktora == 0) {
            System.out.println("Ovaj mjesec niti jedan doktor nije radio");
        } else {
            int BrojPacijenataLijecenihOdStraneDoktora = BrojPacijenata / (BrojDoktora * 7);
            System.out.println("Prosjecni broj pacijenata lijecen on strane doktora: " + BrojPacijenataLijecenihOdStraneDoktora);
        }

    }

    private void osmaOpcija() {
        System.out.println("1) Dnevno izvjesce");
        System.out.println("2) Tjedno izvjesce");
        System.out.println("3) Mjesecno izvjesce");
        System.out.println("4) Meni");

        int i = unosBrojaInt("Unesite vas odabir: ");

        switch (i) {
            case 1:
                dailyReport(1);
                break;
            case 2:
                weeklyReport(2);

                break;
            case 3:
                monthlyReport(3);

                break;

            case 4:
                povratanNaMeni();
                break;
            default:
                break;

        }
    }

    private void deveta() {
        GUI.GUIGlavni.pokreniMeni();
    }

}
