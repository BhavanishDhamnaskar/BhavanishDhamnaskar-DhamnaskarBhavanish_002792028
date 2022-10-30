/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.SystemAdmin;

/**
 *
 * @author DELL
 */
public class ViewEncountersPanelSystemAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ViewEncountersPanelSystemAdmin
     */
    SystemAdmin sysAdmin;
    public ViewEncountersPanelSystemAdmin(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateTable();
        populateDoctors();
        populatePatients();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();
        txtEncounterId = new javax.swing.JTextField();
        btnViewEncounters = new javax.swing.JButton();
        btnUpdateEncounters = new javax.swing.JButton();
        btnAddEncounter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEncounterDate = new javax.swing.JTextField();
        jComboBoxDoctor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPatient = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDeleteEncounter = new javax.swing.JButton();

        jLabel5.setText("Encounter Id");

        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Encounter Id", "Doctor", "Patient", "Date of Visit"
            }
        ));
        jScrollPane1.setViewportView(tblEncounters);

        btnViewEncounters.setText("View Encounter");
        btnViewEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncountersActionPerformed(evt);
            }
        });

        btnUpdateEncounters.setText("Update Encounter");
        btnUpdateEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEncountersActionPerformed(evt);
            }
        });

        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        jLabel2.setText("Doctor");

        jLabel3.setText("Patient");

        jLabel1.setText("View Encounters");

        jLabel4.setText("Date of Encounter");

        btnDeleteEncounter.setText("Delete Encounter");
        btnDeleteEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEncounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewEncounters)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateEncounters)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteEncounter)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(342, 342, 342)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtEncounterDate)
                                            .addComponent(txtEncounterId, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(btnAddEncounter)))))
                        .addGap(222, 222, 222)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewEncounters)
                    .addComponent(btnUpdateEncounters)
                    .addComponent(btnDeleteEncounter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEncounterId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4))
                    .addComponent(txtEncounterDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(btnAddEncounter)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncountersActionPerformed
        // TODO add your handling code here:

        int selectedrowIndex = tblEncounters.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        Encounter e = (Encounter) model.getValueAt(selectedrowIndex, 0);
        txtEncounterId.setText(e.getEncounterId());
        txtEncounterId.setEditable(false);
        jComboBoxDoctor.setSelectedItem(e.getDoctor());
        jComboBoxDoctor.setEditable(false);
        jComboBoxPatient.setSelectedItem(e.getPatient());
        jComboBoxPatient.setEditable(false);
        txtEncounterDate.setText(e.getDate());
        txtEncounterDate.setEditable(false);

    }//GEN-LAST:event_btnViewEncountersActionPerformed

    private void btnUpdateEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEncountersActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblEncounters.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        Encounter e = (Encounter) model.getValueAt(selectedrowIndex, 0);
        txtEncounterId.setText(e.getEncounterId());
        txtEncounterId.setEditable(false);
        jComboBoxDoctor.setSelectedItem(e.getDoctor());
        jComboBoxDoctor.setEditable(true);
        jComboBoxPatient.setSelectedItem(e.getPatient());
        jComboBoxPatient.setEditable(true);
        txtEncounterDate.setText(e.getDate());
        txtEncounterDate.setEditable(true);
    }//GEN-LAST:event_btnUpdateEncountersActionPerformed

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
        // TODO add your handling code here:
        /*
        Community c = (Community) jComboBoxHospitalCommunity.getSelectedItem();
        if(c==null || txtHospitalName.getText().length()==0 || txtHospitalPhone.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        Hospital h = sysAdmin.getHospitalDirectory().getHospital(txtHospitalId.getText());
        h.setHospitalName(String.valueOf(txtHospitalName.getText()));
        h.setPhoneNumber(String.valueOf(txtHospitalPhone.getText()));

        JOptionPane.showMessageDialog(this, "Hospital Info Updated");

        txtHospitalId.setText("");
        txtHospitalName.setText("");
        txtHospitalPhone.setText("");
        jComboBoxHospitalCommunity.setSelectedItem(null);
        populateTable();
        */
        Doctor d = (Doctor)jComboBoxDoctor.getSelectedItem();
        Patient p = (Patient)jComboBoxPatient.getSelectedItem();
        if(d==null || p==null || txtEncounterDate.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        String date = txtEncounterDate.getText();
        String dateRegex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern datePattern = Pattern.compile(dateRegex);
        Matcher matcher = datePattern.matcher(date);
        if(matcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Encounter Date: MM/DD/YYYY");
            return;
        }

        Encounter e = sysAdmin.getEncounterHistory().getEncounter(txtEncounterId.getText());
        e.setDoctor(d);
        e.setPatient(p);
        e.setDate(date);

        JOptionPane.showMessageDialog(this, "Encounter Info Updated");

        jComboBoxDoctor.setSelectedItem(null);
        jComboBoxPatient.setSelectedItem(null);
        txtEncounterDate.setText("null");

        populateTable();
    }//GEN-LAST:event_btnAddEncounterActionPerformed

    private void btnDeleteEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEncounterActionPerformed
        // TODO add your handling code here:
        /*
        int selectedrowIndex = tblHospitals.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to delete the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
        Hospital h = (Hospital) model.getValueAt(selectedrowIndex, 1);
        HospitalDirectory hd = sysAdmin.getHospitalDirectory();
        hd.deleteHospital(h);
        JOptionPane.showMessageDialog(this, "Hospital deleted");
        populateTable();
        */
        int selectedrowIndex = tblEncounters.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to delete the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        Encounter h = (Encounter) model.getValueAt(selectedrowIndex, 0);
        EncounterHistory eh = sysAdmin.getEncounterHistory();
        eh.deleteEncounter(h);
        JOptionPane.showMessageDialog(this, "Encounter deleted");
        populateTable();
        
        
        
    }//GEN-LAST:event_btnDeleteEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JButton btnDeleteEncounter;
    private javax.swing.JButton btnUpdateEncounters;
    private javax.swing.JButton btnViewEncounters;
    private javax.swing.JComboBox<Object> jComboBoxDoctor;
    private javax.swing.JComboBox<Object> jComboBoxPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEncounters;
    private javax.swing.JTextField txtEncounterDate;
    private javax.swing.JTextField txtEncounterId;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        model.setRowCount(0);
        EncounterHistory eh = sysAdmin.getEncounterHistory();
        List<Encounter> el = eh.getEncounterHistory();
        for(Encounter e : el){
            Object[] row = new Object[4];
            row[0] = e;
            row[1] = e.getDoctor();
            row[2] = e.getPatient();
            row[3] = e.getDate();
            model.addRow(row);
        }
    }

    private void populateDoctors() {
        DoctorDirectory doctor = sysAdmin.getDoctorDirectory();
        List<Doctor> dl = doctor.getDoctorDirectory();
        for(Doctor d : dl){
            jComboBoxDoctor.addItem(d);
        }
    }

    private void populatePatients() {
        PatientDirectory patient = sysAdmin.getPatientDirectory();
        List<Patient> pl = patient.getPatientDirectory();
        for(Patient p : pl){
            jComboBoxPatient.addItem(p);
        }
    }
}
