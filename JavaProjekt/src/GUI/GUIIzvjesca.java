/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import RadSBazom.SelectIzBaze;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javaprojekt.Konzola;

/**
 *
 * @author Bruno-PC
 */
public class GUIIzvjesca extends javax.swing.JFrame {

    Konzola kon = new Konzola();
    SelectIzBaze selectIzBaze = new SelectIzBaze();

    /**
     * Creates new form GUIIzvjesca
     */
    public GUIIzvjesca() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        druga = new javax.swing.JLabel();
        treca = new javax.swing.JLabel();
        cetvrta = new javax.swing.JLabel();
        peta = new javax.swing.JLabel();
        sesta = new javax.swing.JLabel();
        sedma = new javax.swing.JLabel();
        osma = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        prva = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IZVJESCA");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Dnevno");
        getContentPane().add(jLabel1, new java.awt.GridBagConstraints());

        jLabel2.setText("Tjedno");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Mjesecno");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipady = 20;
        getContentPane().add(druga, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipady = 20;
        getContentPane().add(treca, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipady = 20;
        getContentPane().add(cetvrta, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.ipady = 20;
        getContentPane().add(peta, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.ipady = 20;
        getContentPane().add(sesta, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.ipady = 20;
        getContentPane().add(sedma, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.ipady = 20;
        getContentPane().add(osma, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(prva, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipady = 20;
        getContentPane().add(jPanel1, gridBagConstraints);

        jButton1.setText("Dnevno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Tjedno");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setText("Mjesecno");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jButton3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Date danasnjidan = kon.danasnjiDan();
        int BrojPacijenata;
        BrojPacijenata = selectIzBaze.dohvatiBrojPacijentaKojiSuImaliKonzultacije(1, danasnjidan);
        prva.setText("Broj pacijenta koji su primljeni kod doktora danas" + BrojPacijenata);

        int broj = selectIzBaze.dohvatiBrojStarihPacijenta(1, danasnjidan);
        if (broj == -1) {
            druga.setText("Broj starih pacijenata : 0");

        } else {
            druga.setText("Broj starih pacijenata : " + broj);
        }

        int brojj = selectIzBaze.dohvatiBrojNovihPacijenta(1, danasnjidan);
        if (brojj == -1) {
            treca.setText("Broj novih pacijenata: 0");

        } else {
            treca.setText("Broj novih pacijenata: " + brojj);
        }

        cetvrta.setText("Ispis svih naplativih usluga");
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
        peta.setText("Cijena prodanih lijekova danas: " + CijaneLijekova);
        sesta.setText("Cijena provedenih medicinskih testova danas: : " + CijenaLab);
        sedma.setText("Cijena pregleda danas: " + CijenaKon);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Date danasnjidan = kon.danasnjiDan();

        int broj = selectIzBaze.dohvatiBrojStarihPacijenta(2, danasnjidan);
        if (broj == -1) {
            druga.setText("Broj starih pacijenata : 0");

        } else {
            druga.setText("Broj starih pacijenata : " + broj);
        }

        int brojj = selectIzBaze.dohvatiBrojNovihPacijenta(2, danasnjidan);
        if (brojj == -1) {
            treca.setText("Broj novih pacijenata: 0");

        } else {
            treca.setText("Broj novih pacijenata: " + brojj);
        }

        int BrojPacijenata = selectIzBaze.dohvatiBrojPacijentaKojiSuImaliKonzultacije(2, danasnjidan);
        int BrojDoktora = selectIzBaze.dohvatiBrojDoktoraKojiSuRadili(2, danasnjidan);
        if (BrojDoktora == 0) {
            cetvrta.setText("Ovaj tjedan niti jedan doktor nije radio.");
        } else {
            int BrojPacijenataLijecenihOdStraneDoktora = BrojPacijenata / (BrojDoktora * 7);
            cetvrta.setText("Prosjecni broj pacijenata lijecen on strane doktora: " + BrojPacijenataLijecenihOdStraneDoktora);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Date danasnjidan = kon.danasnjiDan();

        int broj = selectIzBaze.dohvatiBrojStarihPacijenta(3, danasnjidan);
        if (broj == -1) {
            druga.setText("Broj starih pacijenata : 0");

        } else {
            druga.setText("Broj starih pacijenata : " + broj);
        }

        int brojj = selectIzBaze.dohvatiBrojNovihPacijenta(3, danasnjidan);
        if (brojj == -1) {
            treca.setText("Broj novih pacijenata: 0");

        } else {
            treca.setText("Broj novih pacijenata: " + brojj);
        }

        int BrojPacijenata = selectIzBaze.dohvatiBrojPacijentaKojiSuImaliKonzultacije(3, danasnjidan);
        int BrojDoktora = selectIzBaze.dohvatiBrojDoktoraKojiSuRadili(3, danasnjidan);
        if (BrojDoktora == 0) {
            cetvrta.setText("Ovaj mjesec niti jedan doktor nije radio");
        } else {
            int BrojPacijenataLijecenihOdStraneDoktora = BrojPacijenata / (BrojDoktora * 31);
            cetvrta.setText("Prosjecni broj pacijenata lijecen on strane doktora: " + BrojPacijenataLijecenihOdStraneDoktora);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIIzvjesca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIIzvjesca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIIzvjesca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIIzvjesca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIIzvjesca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cetvrta;
    private javax.swing.JLabel druga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel osma;
    private javax.swing.JLabel peta;
    private javax.swing.JLabel prva;
    private javax.swing.JLabel sedma;
    private javax.swing.JLabel sesta;
    private javax.swing.JLabel treca;
    // End of variables declaration//GEN-END:variables
}
