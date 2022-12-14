/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Patient;
import model.PatientDirectory;
import model.SystemAdmin;

/**
 *
 * @author DELL
 */
public class PatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPanel
     */
    CardLayout cardLayoutmain;
    SystemAdmin sysAdmin;
    Patient p;
    public PatientPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        cardLayoutmain = (CardLayout)(this.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientLoginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPatientUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPatientPassword = new javax.swing.JPasswordField();
        btnDoctorLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSplitPanePatientPanel = new javax.swing.JSplitPane();
        controlPanelPatientHome = new javax.swing.JPanel();
        btnCheckDoctors = new javax.swing.JButton();
        btncheckEncounters = new javax.swing.JButton();
        btnCheckDetails = new javax.swing.JButton();
        btnBookAppointment = new javax.swing.JButton();
        viewPanelPatientHome = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        PatientLoginPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Patient Login");
        PatientLoginPanel.add(jLabel2);
        jLabel2.setBounds(309, 100, 130, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Username");
        PatientLoginPanel.add(jLabel3);
        jLabel3.setBounds(274, 196, 70, 20);
        PatientLoginPanel.add(txtPatientUsername);
        txtPatientUsername.setBounds(384, 190, 150, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        PatientLoginPanel.add(jLabel4);
        jLabel4.setBounds(280, 250, 70, 20);
        PatientLoginPanel.add(txtPatientPassword);
        txtPatientPassword.setBounds(384, 246, 150, 22);

        btnDoctorLogin.setText("Login");
        btnDoctorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorLoginActionPerformed(evt);
            }
        });
        PatientLoginPanel.add(btnDoctorLogin);
        btnDoctorLogin.setBounds(350, 322, 72, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\healthcare33.png")); // NOI18N
        PatientLoginPanel.add(jLabel1);
        jLabel1.setBounds(-10, -10, 1270, 960);

        add(PatientLoginPanel, "PatientLoginPanel");

        jSplitPanePatientPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnCheckDoctors.setText("Check Doctors");
        btnCheckDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckDoctorsActionPerformed(evt);
            }
        });

        btncheckEncounters.setText("Check Encounter");
        btncheckEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckEncountersActionPerformed(evt);
            }
        });

        btnCheckDetails.setText("Check Personal Details");
        btnCheckDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckDetailsActionPerformed(evt);
            }
        });

        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelPatientHomeLayout = new javax.swing.GroupLayout(controlPanelPatientHome);
        controlPanelPatientHome.setLayout(controlPanelPatientHomeLayout);
        controlPanelPatientHomeLayout.setHorizontalGroup(
            controlPanelPatientHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelPatientHomeLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnCheckDoctors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncheckEncounters)
                .addGap(18, 18, 18)
                .addComponent(btnCheckDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBookAppointment)
                .addContainerGap(565, Short.MAX_VALUE))
        );
        controlPanelPatientHomeLayout.setVerticalGroup(
            controlPanelPatientHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelPatientHomeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(controlPanelPatientHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckDoctors)
                    .addComponent(btncheckEncounters)
                    .addComponent(btnCheckDetails)
                    .addComponent(btnBookAppointment))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jSplitPanePatientPanel.setTopComponent(controlPanelPatientHome);

        javax.swing.GroupLayout viewPanelPatientHomeLayout = new javax.swing.GroupLayout(viewPanelPatientHome);
        viewPanelPatientHome.setLayout(viewPanelPatientHomeLayout);
        viewPanelPatientHomeLayout.setHorizontalGroup(
            viewPanelPatientHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1258, Short.MAX_VALUE)
        );
        viewPanelPatientHomeLayout.setVerticalGroup(
            viewPanelPatientHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );

        jSplitPanePatientPanel.setRightComponent(viewPanelPatientHome);

        add(jSplitPanePatientPanel, "jSplitPanePatientPanel");
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorLoginActionPerformed
        // TODO add your handling code here:

        String username = txtPatientUsername.getText();
        String password = txtPatientPassword.getText();
        boolean validate = validateLogin(username,password);
        if(validate){
            cardLayoutmain.show(this, "jSplitPanePatientPanel");
            this.p = getPatient(username);

        }

        else{
            JOptionPane.showMessageDialog(this, "Enter Valid Username and password");
            return;
        }
    }//GEN-LAST:event_btnDoctorLoginActionPerformed

    private void btnCheckDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckDoctorsActionPerformed
        // TODO add your handling code here:
        ViewDoctorsPatientPanel viewDoctorsnear = new ViewDoctorsPatientPanel(sysAdmin,p);
        jSplitPanePatientPanel.setRightComponent(viewDoctorsnear);
    }//GEN-LAST:event_btnCheckDoctorsActionPerformed

    private void btncheckEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckEncountersActionPerformed
        // TODO add your handling code here:
        CheckEncounterPatientPanel chkencounters = new CheckEncounterPatientPanel(sysAdmin,p);
        jSplitPanePatientPanel.setRightComponent(chkencounters);
        
    }//GEN-LAST:event_btncheckEncountersActionPerformed

    private void btnCheckDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckDetailsActionPerformed
        // TODO add your handling code here:
        ViewPatientPanel viewPatientPanel = new ViewPatientPanel(sysAdmin);
        jSplitPanePatientPanel.setRightComponent((viewPatientPanel));
    }//GEN-LAST:event_btnCheckDetailsActionPerformed

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
        AddEncounterPanel addEncounter = new AddEncounterPanel(sysAdmin);
        jSplitPanePatientPanel.setRightComponent(addEncounter);
    }//GEN-LAST:event_btnBookAppointmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PatientLoginPanel;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnCheckDetails;
    private javax.swing.JButton btnCheckDoctors;
    private javax.swing.JButton btnDoctorLogin;
    private javax.swing.JButton btncheckEncounters;
    private javax.swing.JPanel controlPanelPatientHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSplitPane jSplitPanePatientPanel;
    private javax.swing.JPasswordField txtPatientPassword;
    private javax.swing.JTextField txtPatientUsername;
    private javax.swing.JPanel viewPanelPatientHome;
    // End of variables declaration//GEN-END:variables

    private boolean validateLogin(String username, String password) {
        PatientDirectory pd = sysAdmin.getPatientDirectory();
        List<Patient> pl = pd.getPatientDirectory();
        for(Patient p : pl){
            if(p.getUsername().equals(username) && p.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    private Patient getPatient(String username) {
        Patient pa = new Patient();
        PatientDirectory pd = sysAdmin.getPatientDirectory();
        List<Patient> pl = pd.getPatientDirectory();
        for(Patient p : pl){
            if(p.getUsername().equals(username)){
                pa = p;
                break;
            }
        }
        return pa;
    }
}
