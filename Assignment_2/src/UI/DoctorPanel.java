/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import model.Doctor;
import model.DoctorDirectory;
import model.SystemAdmin;
import model.VitalSigns;

/**
 *
 * @author DELL
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanel
     */
    CardLayout cardLayoutmain;
    SystemAdmin sysAdmin;
    Doctor d;
    public DoctorPanel(SystemAdmin sysAdmin) {
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

        jPanelDoctorLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDoctorUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDoctorPassword = new javax.swing.JPasswordField();
        btnDoctorLogin = new javax.swing.JButton();
        jSplitPaneDoctorPanel = new javax.swing.JSplitPane();
        controlPanelDoctor = new javax.swing.JPanel();
        btnCreateEncounter = new javax.swing.JButton();
        btnViewEncounter = new javax.swing.JButton();
        btnCreateVitalSign = new javax.swing.JButton();
        btnViewVitalSign = new javax.swing.JButton();
        viewPanelDoctor = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        jLabel2.setText("Doctor Login");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        btnDoctorLogin.setText("Login");
        btnDoctorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDoctorLoginPanelLayout = new javax.swing.GroupLayout(jPanelDoctorLoginPanel);
        jPanelDoctorLoginPanel.setLayout(jPanelDoctorLoginPanelLayout);
        jPanelDoctorLoginPanelLayout.setHorizontalGroup(
            jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel1))
                    .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jLabel2))
                    .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                                .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDoctorUsername)
                                    .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnDoctorLogin)))))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanelDoctorLoginPanelLayout.setVerticalGroup(
            jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoctorLoginPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(74, 74, 74)
                .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelDoctorLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnDoctorLogin)
                .addContainerGap(411, Short.MAX_VALUE))
        );

        add(jPanelDoctorLoginPanel, "jPanelDoctorLoginPanel");

        jSplitPaneDoctorPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnCreateEncounter.setText("Create Encounter");
        btnCreateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEncounterActionPerformed(evt);
            }
        });

        btnViewEncounter.setText("View Encounter");
        btnViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncounterActionPerformed(evt);
            }
        });

        btnCreateVitalSign.setText("Create Vital Signs");
        btnCreateVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVitalSignActionPerformed(evt);
            }
        });

        btnViewVitalSign.setText("View Vital Signs");
        btnViewVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalSignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelDoctorLayout = new javax.swing.GroupLayout(controlPanelDoctor);
        controlPanelDoctor.setLayout(controlPanelDoctorLayout);
        controlPanelDoctorLayout.setHorizontalGroup(
            controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnCreateEncounter)
                .addGap(26, 26, 26)
                .addComponent(btnViewEncounter)
                .addGap(30, 30, 30)
                .addComponent(btnCreateVitalSign)
                .addGap(18, 18, 18)
                .addComponent(btnViewVitalSign)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        controlPanelDoctorLayout.setVerticalGroup(
            controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelDoctorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(controlPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateEncounter)
                    .addComponent(btnViewEncounter)
                    .addComponent(btnCreateVitalSign)
                    .addComponent(btnViewVitalSign))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jSplitPaneDoctorPanel.setLeftComponent(controlPanelDoctor);

        javax.swing.GroupLayout viewPanelDoctorLayout = new javax.swing.GroupLayout(viewPanelDoctor);
        viewPanelDoctor.setLayout(viewPanelDoctorLayout);
        viewPanelDoctorLayout.setHorizontalGroup(
            viewPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 882, Short.MAX_VALUE)
        );
        viewPanelDoctorLayout.setVerticalGroup(
            viewPanelDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        jSplitPaneDoctorPanel.setRightComponent(viewPanelDoctor);

        add(jSplitPaneDoctorPanel, "jSplitPaneDoctorPanel");
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorLoginActionPerformed
        // TODO add your handling code here:
        
        String username = txtDoctorUsername.getText();
        String password = txtDoctorPassword.getText();
        boolean validate = validateLogin(username,password);
        if(validate){
            cardLayoutmain.show(this, "jSplitPaneDoctorPanel");
            this.d = getDoctor(username);
            
            
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Enter Valid Username and password");
            return;
        }
    }//GEN-LAST:event_btnDoctorLoginActionPerformed

    private void btnCreateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEncounterActionPerformed
        // TODO add your handling code here:
        AddEncounterPanelDoctor encounterDoctor = new AddEncounterPanelDoctor(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(encounterDoctor);
        
    }//GEN-LAST:event_btnCreateEncounterActionPerformed

    private void btnViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncounterActionPerformed
        // TODO add your handling code here:
        ViewEncounterPanelDoctor encounterDoctor = new ViewEncounterPanelDoctor(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(encounterDoctor);
    }//GEN-LAST:event_btnViewEncounterActionPerformed

    private void btnCreateVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVitalSignActionPerformed
        // TODO add your handling code here:
        CreateVitalSignsPanel createvitals = new CreateVitalSignsPanel(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(createvitals);
    }//GEN-LAST:event_btnCreateVitalSignActionPerformed

    private void btnViewVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalSignActionPerformed
        // TODO add your handling code here:
        ViewVitalSignsPanel viewVitals = new ViewVitalSignsPanel(sysAdmin,d);
        jSplitPaneDoctorPanel.setRightComponent(viewVitals);
    }//GEN-LAST:event_btnViewVitalSignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEncounter;
    private javax.swing.JButton btnCreateVitalSign;
    private javax.swing.JButton btnDoctorLogin;
    private javax.swing.JButton btnViewEncounter;
    private javax.swing.JButton btnViewVitalSign;
    private javax.swing.JPanel controlPanelDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelDoctorLoginPanel;
    private javax.swing.JSplitPane jSplitPaneDoctorPanel;
    private javax.swing.JPasswordField txtDoctorPassword;
    private javax.swing.JTextField txtDoctorUsername;
    private javax.swing.JPanel viewPanelDoctor;
    // End of variables declaration//GEN-END:variables

    private boolean validateLogin(String username, String password) {
        DoctorDirectory dd = sysAdmin.getDoctorDirectory();
        List<Doctor> dl = dd.getDoctorDirectory();
        for(Doctor d : dl){
            if(d.getUsername().equals(username) && d.getPassword().equals(password)){
                return true;
            }
        }
        return false;
        
    }

    private Doctor getDoctor(String username) {
        Doctor doc = new Doctor();
        DoctorDirectory dd = sysAdmin.getDoctorDirectory();
        List<Doctor> dl = dd.getDoctorDirectory();
        for(Doctor d : dl){
            if(d.getUsername().equals(username)){
                doc = d;
                break;
            }
        }
        return doc;
    }
    
}
