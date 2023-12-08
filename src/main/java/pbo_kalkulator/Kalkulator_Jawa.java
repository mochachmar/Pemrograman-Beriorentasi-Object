package pbo_kalkulator;
import pbo_pilih_project_java.Pilih_Project_Java_GUI;

public class Kalkulator_Jawa extends javax.swing.JFrame {
    double angka1;
    double angka2;

    public Kalkulator_Jawa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setTitle("Kalkulator Jawa");
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtAngka1 = new javax.swing.JLabel();
        Angka1 = new javax.swing.JTextField();
        TxtAngka2 = new javax.swing.JLabel();
        Angka2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Tambah = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        Kali = new javax.swing.JButton();
        Bagi = new javax.swing.JButton();
        TxtHasil = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();
        Kembali = new javax.swing.JButton();
        Mod = new javax.swing.JButton();
        Bersihkan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("KALKULATOR JAWA");

        TxtAngka1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TxtAngka1.setText("MASUKKAN ANGKA 1 : ");

        Angka1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka1ActionPerformed(evt);
            }
        });

        TxtAngka2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TxtAngka2.setText("MASUKKAN ANGKA 2 : ");

        Angka2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("PILIH OPERATOR");

        Tambah.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tambah.setText("+");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Kurang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Kurang.setText("-");
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });

        Kali.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Kali.setText("X");
        Kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliActionPerformed(evt);
            }
        });

        Bagi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bagi.setText("/");
        Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagiActionPerformed(evt);
            }
        });

        TxtHasil.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TxtHasil.setText("HASIL");

        Hasil.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Hasil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });

        Kembali.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        Mod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Mod.setText("%");
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });

        Bersihkan.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bersihkan.setText("BERSIHKAN");
        Bersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BersihkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(315, 315, 315))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtHasil)
                        .addGap(343, 343, 343))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(TxtAngka2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(TxtAngka1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Angka1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(104, 104, 104)
                                    .addComponent(Kali, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(109, 109, 109)
                                    .addComponent(Bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(110, 110, 110)
                                    .addComponent(Mod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 55, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(187, Short.MAX_VALUE)
                    .addComponent(Bersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(160, 160, 160)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAngka1)
                    .addComponent(Angka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAngka2)
                    .addComponent(Angka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tambah)
                    .addComponent(Kurang)
                    .addComponent(Kali)
                    .addComponent(Bagi)
                    .addComponent(Mod))
                .addGap(32, 32, 32)
                .addComponent(TxtHasil)
                .addGap(18, 18, 18)
                .addComponent(Hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(510, Short.MAX_VALUE)
                    .addComponent(Bersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(269, 269, 269)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Angka1ActionPerformed

    private void Angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Angka2ActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        try {
            angka1 = Double.parseDouble(Angka1.getText());
            angka2 = Double.parseDouble(Angka2.getText());
            double hasil = angka1 + angka2;

            if (hasil == (int)hasil) {
                Hasil.setText(String.valueOf((int)hasil));
            } else {
                Hasil.setText(String.valueOf(hasil));
            }
        } catch (NumberFormatException e) {
            Hasil.setText("Yo Ndak Tau Kok Tanya Saya ! !");
    }

    }//GEN-LAST:event_TambahActionPerformed

    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed
        // TODO add your handling code here:
        try {
            angka1 = Double.parseDouble(Angka1.getText());
            angka2 = Double.parseDouble(Angka2.getText());
            double hasil = angka1 - angka2;
            if (hasil == (int)hasil) {
                Hasil.setText(String.valueOf((int)hasil));
            } else {
                Hasil.setText(String.valueOf(hasil));
            }
        } catch (NumberFormatException e) {
            Hasil.setText("Yo Ndak Tau Kok Tanya Saya ! !");
    }
    }//GEN-LAST:event_KurangActionPerformed

    private void KaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliActionPerformed
        // TODO add your handling code here:
        try {
            angka1 = Double.parseDouble(Angka1.getText());
            angka2 = Double.parseDouble(Angka2.getText());
            double hasil = angka1 * angka2;
            if (hasil == (int)hasil) {
                Hasil.setText(String.valueOf((int)hasil));
            } else {
                Hasil.setText(String.valueOf(hasil));
            }
        } catch (NumberFormatException e) {
            Hasil.setText("Yo Ndak Tau Kok Tanya Saya ! !");
    }
    }//GEN-LAST:event_KaliActionPerformed

    private void BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiActionPerformed
        // TODO add your handling code here:
        try {
            angka1 = Double.parseDouble(Angka1.getText());
            angka2 = Double.parseDouble(Angka2.getText());
            double hasil = angka1 / angka2;
            if (hasil == (int)hasil) {
                Hasil.setText(String.valueOf((int)hasil));
            } else {
                Hasil.setText(String.valueOf(hasil));
            }
        } catch (NumberFormatException e) {
            Hasil.setText("Yo Ndak Tau Kok Tanya Saya ! !");
    }
    }//GEN-LAST:event_BagiActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_HasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HasilActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        Pilih_Project_Java_GUI pilih_project = new Pilih_Project_Java_GUI();
        pilih_project.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModActionPerformed
        // TODO add your handling code here:
        try {
            angka1 = Double.parseDouble(Angka1.getText());
            angka2 = Double.parseDouble(Angka2.getText());
            double hasil = angka1 % angka2;
            if (hasil == (int)hasil) {
                Hasil.setText(String.valueOf((int)hasil));
            } else {
                Hasil.setText(String.valueOf(hasil));
            }
        } catch (NumberFormatException e) {
            Hasil.setText("Yo Ndak Tau Kok Tanya Saya ! !");
    }
    }//GEN-LAST:event_ModActionPerformed

    private void BersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BersihkanActionPerformed
        // TODO add your handling code here:
        Angka1.setText("");
        Angka2.setText("");
        Hasil.setText("");
    }//GEN-LAST:event_BersihkanActionPerformed

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator_Jawa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Angka1;
    private javax.swing.JTextField Angka2;
    private javax.swing.JButton Bagi;
    private javax.swing.JButton Bersihkan;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Kali;
    private javax.swing.JButton Kurang;
    private javax.swing.JButton Kembali;
    private javax.swing.JButton Mod;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel TxtAngka1;
    private javax.swing.JLabel TxtAngka2;
    private javax.swing.JLabel TxtHasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
