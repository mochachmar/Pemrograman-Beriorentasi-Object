package pbo_login;

import pbo_222362_moch_achmar_j_praktek.login.SignIn;
import pbo_form_mahasiswa.ClassDB;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pbo_pilih_project_java.Pilih_Project_Java_GUI;
import pbo_pilih_project_java_01.Pilih_Project_Java_GUI_01;

public class login extends javax.swing.JFrame {
    public login() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfieldformlogin = new javax.swing.JLabel();
        txtusername = new javax.swing.JLabel();
        txtfieldpassword = new javax.swing.JLabel();
        txtfieldstatus = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        login = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        pilih_status = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        txtfieldformlogin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtfieldformlogin.setText("FORM LOGIN VERIFIKASI ANGGOTA");

        txtusername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtusername.setText("USERNAME :");

        txtfieldpassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldpassword.setText("PASSWORD :");

        txtfieldstatus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldstatus.setText("STATUS      :");

        kembali.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kembali.setText("KEMBALI");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        login.setText("MASUK PAK EKO");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        pilih_status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pilih_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PILIH", "ADMINISTRATOR", "CLIENT" }));
        pilih_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilih_statusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(kembali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(txtfieldformlogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtusername)
                            .addComponent(txtfieldpassword)
                            .addComponent(txtfieldstatus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pilih_status, 0, 500, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(username))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(txtfieldformlogin)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusername)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfieldpassword)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfieldstatus)
                    .addComponent(pilih_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembali)
                    .addComponent(login))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void pilih_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilih_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilih_statusActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Berhasil keluar! Anda akan segera dialihkan!");
        SignIn signIn = new SignIn();
        signIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        if (username.getText().isEmpty() || password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lengkapi Isian", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection c = ClassDB.getConnection();
                Statement s = c.createStatement();

                // Fix the SQL query by adding '=' and fixing the quotation marks
                String sql = "SELECT * FROM MHS WHERE NIM = '" + username.getText() + "' AND JURUSAN = '" + password.getText() + "'";
                ResultSet cekData = s.executeQuery(sql);

                if (cekData.next()) {
                    String selectedStatus = (String) pilih_status.getSelectedItem();

                    if ("ADMINISTRATOR".equals(selectedStatus)) {
                        Pilih_Project_Java_GUI pilih_project = new Pilih_Project_Java_GUI();
                        pilih_project.setVisible(true);
                    } else if ("CLIENT".equals(selectedStatus)) {
                        Pilih_Project_Java_GUI_01 pilih_project = new Pilih_Project_Java_GUI_01();
                        pilih_project.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Pilih Status terlebih dahulu", "Perhatian", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Login gagal! Periksa Username dan Password Anda", "Pesan",
                            JOptionPane.WARNING_MESSAGE);
                }

                cekData.close();
                s.close();
                c.close();
                this.dispose();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton kembali;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox pilih_status;
    private javax.swing.JLabel txtfieldformlogin;
    private javax.swing.JLabel txtfieldpassword;
    private javax.swing.JLabel txtfieldstatus;
    private javax.swing.JLabel txtusername;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
