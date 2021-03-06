/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import PomocneKlase.Validation;
import RadSBazom.Checkup;
import RadSBazom.CheckupList;
import RadSBazom.DoctorList;
import RadSBazom.LaboratoryTestList;
import RadSBazom.SelectIzBaze;
import RadSBazom.UpisivanjeUBazu;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Bruno-PC
 */
public class GUIPregled extends javax.swing.JFrame {

    UpisivanjeUBazu upis = new UpisivanjeUBazu();
    SelectIzBaze selectIzBaze = new SelectIzBaze();
    Validation valid = new Validation();

    /**
     * Creates new form GUIPregled
     */
    public GUIPregled() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNazivPregleda = new javax.swing.JTextArea();
        kriviNaziv = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCijenaPregleda = new javax.swing.JTextField();
        kriviUnosCijene = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDPacijenta = new javax.swing.JTextField();
        kriviIDPacijenta = new javax.swing.JLabel();
        labelRezultat = new javax.swing.JLabel();
        buttonPregled = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIDDoktor = new javax.swing.JTextField();
        kriviDoktor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pregled");

        jLabel2.setText("Upisite nazvi pregleda: ");

        txtNazivPregleda.setColumns(20);
        txtNazivPregleda.setRows(5);
        jScrollPane1.setViewportView(txtNazivPregleda);

        jLabel3.setText("Unesite cijenu pregleda:");

        jLabel4.setText("Unesite id pacijenta kojem zelite unjesti pregled:");

        kriviIDPacijenta.setText(" ");

        labelRezultat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonPregled.setText("Dodaj pregled");
        buttonPregled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPregledActionPerformed(evt);
            }
        });

        jLabel5.setText("Unesite id doktora koji je izvrsio pregled");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(59, 59, 59)
                                .addComponent(txtIDDoktor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDPacijenta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCijenaPregleda))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kriviNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(kriviIDPacijenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addComponent(kriviUnosCijene, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(kriviDoktor, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelRezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPregled, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kriviNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCijenaPregleda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kriviUnosCijene, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIDPacijenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kriviIDPacijenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIDDoktor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kriviDoktor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(labelRezultat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonPregled, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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

    private void buttonPregledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPregledActionPerformed
        String NazivPregleda = txtNazivPregleda.getText();
        boolean nazivPregleda = true;
        if (NazivPregleda.length() > 200) {
            nazivPregleda = false;
            kriviNaziv.setText("Najvise 200 znakova!");
        }
        if (txtNazivPregleda.getText().isEmpty()) {
            nazivPregleda = false;
            kriviNaziv.setText("Prazno polje!");
        }

        String CijenaPregleda = txtCijenaPregleda.getText();
        float cijenaPregleda = 0;
        boolean cijena = true;
        try {
            cijenaPregleda = Float.parseFloat(CijenaPregleda);
        } catch (Exception e) {
            cijena = false;
            kriviUnosCijene.setText("Krivi unos");
        }
        if (txtCijenaPregleda.getText().isEmpty()) {
            cijena = false;
            kriviUnosCijene.setText("Prazno polje!");
        }

        String IDPatient = txtIDPacijenta.getText();
        int idPatient = 0;
        boolean id = true;
        try {
            idPatient = Integer.parseInt(IDPatient);
        } catch (Exception e) {
            id = false;
            kriviIDPacijenta.setText("krivi id");
        }
        if (txtIDPacijenta.getText().isEmpty()) {
            id = false;
            kriviIDPacijenta.setText("Prazno polje");
        }

        String IDDoktor = txtIDDoktor.getText();
        int iddoktor = 0;
        boolean iddok = true;
        try {
            iddoktor = Integer.parseInt(IDDoktor);
        } catch (Exception e) {
            iddok = false;
            kriviDoktor.setText("krivi id");
        }
        if (txtIDDoktor.getText().isEmpty()) {
            iddok = false;
            kriviDoktor.setText("Prazno polje");
        }

        Date Danasnjidan = petvaranjeDatuma(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DAY_OF_MONTH));

        if (id && cijena && nazivPregleda && iddok) {

            if (valid.provjeriIDDoktora(iddoktor) && valid.provjeriIDPacijenta(idPatient)) {

                Checkup Pregled = new Checkup(NazivPregleda, cijenaPregleda, Danasnjidan);
                long IDPregleda = upis.unesiCheckup(Pregled);

                long IDChart = selectIzBaze.dohvatiChartId((long) idPatient);
                CheckupList lista = new CheckupList((int) IDChart, (int) IDPregleda);
                upis.unesiCheckupList(lista);

                DoctorList listadoktora = new DoctorList((int) IDChart, iddoktor);
                upis.unesiDoctorList(listadoktora);

                labelRezultat.setText("uspjesan upis");
            } else {
                labelRezultat.setText("Nepostojeci ID");
            }

        } else {
            labelRezultat.setText("Neuspjesan upis");

        }


    }//GEN-LAST:event_buttonPregledActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPregled.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPregled.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPregled.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPregled.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPregled().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPregled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kriviDoktor;
    private javax.swing.JLabel kriviIDPacijenta;
    private javax.swing.JLabel kriviNaziv;
    private javax.swing.JLabel kriviUnosCijene;
    private javax.swing.JLabel labelRezultat;
    private javax.swing.JTextField txtCijenaPregleda;
    private javax.swing.JTextField txtIDDoktor;
    private javax.swing.JTextField txtIDPacijenta;
    private javax.swing.JTextArea txtNazivPregleda;
    // End of variables declaration//GEN-END:variables
}
