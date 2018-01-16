/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PomocneKlase;

import RadSBazom.SelectIzBaze;
import static RadSBazom.SelectIzBaze.dohvatiIDSvihpacijenta;
import com.sun.org.apache.bcel.internal.generic.Select;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Bruno-PC
 */
public class Validation {

    SelectIzBaze selectIzBaze = new SelectIzBaze();

    public static boolean email_Validation(String email) {
        int l = email.length();
        int p = email.indexOf('@');

        if (l < 3 || p == -1 || p == 0 || p == l - 1) {

            return false;
        }

        return true;

        /*
        if (matcher.matches()) {
            status = true;
        }
        return status;
         */
    }

    public boolean provjeriIDPacijenta(int idPacijenta) {
        List<Long> idPatientList = new ArrayList<Long>();
        idPatientList = selectIzBaze.dohvatiIDSvihpacijenta();

        long IDPacijenta = idPacijenta;

        for (long id : idPatientList) {
            if (id == IDPacijenta) {
                return true;
            }

        }

        return false;
    }

    public boolean provjeriIDLabTesta(int idlabtest) {
        List<Long> idLabList = new ArrayList<Long>();
        idLabList = selectIzBaze.dohvatiIDSvihLabTestova();

        long IDLab = idlabtest;

        for (long id : idLabList) {
            if (id == IDLab) {
                return true;
            }

        }

        return false;

    }

    public boolean provjeriIDLijeka(int idLijeka) {
        List<Long> idLijekaList = new ArrayList<Long>();
        idLijekaList = selectIzBaze.dohvatiIDSvihLijekova();

        long IDLijek = idLijeka;

        for (long id : idLijekaList) {
            if (id == IDLijek) {
                return true;
            }

        }

        return false;

    }

    public boolean provjeriIDDoktora(int idDoktora) {
        List<Long> idDoktoraList = new ArrayList<Long>();
        idDoktoraList = selectIzBaze.dohvatiIDSvihDoktora();

        long IDDoktor = idDoktora;

        for (long id : idDoktoraList) {
            if (id == IDDoktor) {
                return true;
            }

        }

        return false;

    }
}
