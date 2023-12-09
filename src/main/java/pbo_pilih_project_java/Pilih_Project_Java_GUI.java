package pbo_pilih_project_java;

import pbo_222362_moch_achmar_j_praktek.login.SignIn;
import pbo_convert_suhu.Convert_Suhu;
import pbo_form_mahasiswa.CRUD;
import pbo_kalkulator.Kalkulator_Jawa;
import pbo_program_gaji_karyawan.program_gaji_karyawan;
import javax.swing.*;

public class Pilih_Project_Java_GUI extends javax.swing.JFrame {
    public Pilih_Project_Java_GUI() {
        initComponents();
        setLocationRelativeTo(this);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Kalkulator = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        FormMahasiswa = new javax.swing.JButton();
        Convert_Suhu = new javax.swing.JButton();
        gaji_karyawan = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LogOut = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Kalkulator_01 = new javax.swing.JMenuItem();
        Convert_Suhu_01 = new javax.swing.JMenuItem();
        FormMahasiswa_01 = new javax.swing.JMenuItem();
        gaji_karyawan_01 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pilih Project Java :");

        Kalkulator.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Kalkulator.setText("Kalkulator");
        Kalkulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KalkulatorActionPerformed(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        FormMahasiswa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FormMahasiswa.setText("Form Mahasiswa");
        FormMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormMahasiswaActionPerformed(evt);
            }
        });

        Convert_Suhu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Convert_Suhu.setText("Convert Suhu");
        Convert_Suhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Convert_SuhuActionPerformed(evt);
            }
        });

        gaji_karyawan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gaji_karyawan.setText("Hitung Gaji Karyawan");
        gaji_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaji_karyawanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gaji_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Convert_Suhu, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Kalkulator, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(107, 107, 107))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(183, 183, 183)))
                    .addComponent(FormMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(Kalkulator, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Convert_Suhu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FormMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gaji_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        LogOut.setText("Logout");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jMenu1.add(LogOut);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        Kalkulator_01.setText("Kalkulator");
        Kalkulator_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kalkulator_01ActionPerformed(evt);
            }
        });
        jMenu2.add(Kalkulator_01);

        Convert_Suhu_01.setText("Convert Suhu");
        Convert_Suhu_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Convert_Suhu_01ActionPerformed(evt);
            }
        });
        jMenu2.add(Convert_Suhu_01);

        FormMahasiswa_01.setText("Form Mahasiswa");
        FormMahasiswa_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormMahasiswa_01ActionPerformed(evt);
            }
        });
        jMenu2.add(FormMahasiswa_01);

        gaji_karyawan_01.setText("Hitung Gaji Karyawan");
        gaji_karyawan_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaji_karyawan_01ActionPerformed(evt);
            }
        });
        jMenu2.add(gaji_karyawan_01);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Utility");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KalkulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KalkulatorActionPerformed
        // TODO add your handling code here:
        Kalkulator_Jawa kalkulator = new Kalkulator_Jawa();
        kalkulator.setVisible(true);
    }//GEN-LAST:event_KalkulatorActionPerformed

    private void FormMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormMahasiswaActionPerformed
        // TODO add your handling code here:
        CRUD form_mahasiswa = new CRUD();
        form_mahasiswa.setVisible(true);
    }//GEN-LAST:event_FormMahasiswaActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Berhasil keluar! Anda akan segera dialihkan!");
        SignIn signIn = new SignIn();
        signIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void Convert_SuhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Convert_SuhuActionPerformed
        // TODO add your handling code here:
        Convert_Suhu convertsuhu = new Convert_Suhu();
        convertsuhu.setVisible(true);
    }//GEN-LAST:event_Convert_SuhuActionPerformed

    private void gaji_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaji_karyawanActionPerformed
        // TODO add your handling code here:
        program_gaji_karyawan gajiKaryawan = new program_gaji_karyawan();
        gajiKaryawan.setVisible(true);
    }//GEN-LAST:event_gaji_karyawanActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutActionPerformed

    private void Kalkulator_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kalkulator_01ActionPerformed
        // TODO add your handling code here:
        Kalkulator_Jawa kalkulator = new Kalkulator_Jawa();
        kalkulator.setVisible(true);
    }//GEN-LAST:event_Kalkulator_01ActionPerformed

    private void Convert_Suhu_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Convert_Suhu_01ActionPerformed
        // TODO add your handling code here:
        Convert_Suhu convertsuhu = new Convert_Suhu();
        convertsuhu.setVisible(true);
    }//GEN-LAST:event_Convert_Suhu_01ActionPerformed

    private void FormMahasiswa_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormMahasiswa_01ActionPerformed
        // TODO add your handling code here:
        CRUD form_mahasiswa = new CRUD();
        form_mahasiswa.setVisible(true);
    }//GEN-LAST:event_FormMahasiswa_01ActionPerformed

    private void gaji_karyawan_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaji_karyawan_01ActionPerformed
        // TODO add your handling code here:
        program_gaji_karyawan gajiKaryawan = new program_gaji_karyawan();
        gajiKaryawan.setVisible(true);
    }//GEN-LAST:event_gaji_karyawan_01ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Pilih_Project_Java_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pilih_Project_Java_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pilih_Project_Java_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pilih_Project_Java_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pilih_Project_Java_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert_Suhu;
    private javax.swing.JMenuItem Convert_Suhu_01;
    private javax.swing.JButton FormMahasiswa;
    private javax.swing.JMenuItem FormMahasiswa_01;
    private javax.swing.JButton Kalkulator;
    private javax.swing.JMenuItem Kalkulator_01;
    private javax.swing.JMenuItem LogOut;
    private javax.swing.JButton Logout;
    private javax.swing.JButton gaji_karyawan;
    private javax.swing.JMenuItem gaji_karyawan_01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
