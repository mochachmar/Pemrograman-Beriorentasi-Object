package pbo_form_mahasiswa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.*;

import pbo_pilih_project_java.Pilih_Project_Java_GUI;

public class CRUD extends javax.swing.JFrame {
    private DefaultTableModel model;
    public CRUD() {
        initComponents();
        setLocationRelativeTo(this);
        LoadDataMhs();
        Bersihkan();
        initializeRadioButtons();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDataMahasiswa = new javax.swing.JLabel();
        txtfieldnim = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        nim.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                isValidNIM();
            }
        });
        txtfieldnama = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        txtfieldjurusan = new javax.swing.JLabel();
        pilih_jurusan = new javax.swing.JComboBox();
        simpan = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        hapus_all = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtfieldgender = new javax.swing.JLabel();
        txtfieldpassword = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        laki_laki = new javax.swing.JRadioButton();
        unknown = new javax.swing.JRadioButton();
        ubah = new javax.swing.JButton();
        lihat_password = new javax.swing.JCheckBox();
        perempuan = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDataMahasiswa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtDataMahasiswa.setText("DATA MAHASISWA");

        txtfieldnim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldnim.setText("NIM                    :");

        nim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });

        txtfieldnama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldnama.setText("NAMA                  :");

        nama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        txtfieldjurusan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldjurusan.setText("JURUSAN             :");

        pilih_jurusan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pilih_jurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Jurusan", "Teknik Informatika", "Sistem Informasi", "Manajemen Informatika", "Bisnis Digital", "Kewirausahaan", "Rekayasa Perangkat Lunak" }));
        pilih_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilih_jurusanActionPerformed(evt);
            }
        });

        simpan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        hapus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        hapus_all.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hapus_all.setText("HAPUS SEMUA");
        hapus_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_allActionPerformed(evt);
            }
        });

        Kembali.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtfieldgender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldgender.setText("JENIS KELAMIN     :");

        txtfieldpassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldpassword.setText("PASSWORD          :");

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        laki_laki.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        laki_laki.setText(" Laki-Laki");
        laki_laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laki_lakiActionPerformed(evt);
            }
        });

        unknown.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        unknown.setText(" Tidak Diketahui");
        unknown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unknownActionPerformed(evt);
            }
        });

        ubah.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ubah.setText("UBAH");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        lihat_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lihat_password.setText(" Show Password");
        lihat_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihat_passwordActionPerformed(evt);
            }
        });

        perempuan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        perempuan.setText(" Perempuan");
        perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hapus_all, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addGap(148, 148, 148))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtfieldnim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfieldpassword)
                                .addComponent(txtfieldgender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfieldnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtfieldjurusan))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pilih_jurusan, 0, 590, Short.MAX_VALUE)
                                .addComponent(txtDataMahasiswa)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(password)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lihat_password))
                                .addComponent(nim, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                                .addComponent(nama))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(laki_laki)
                                .addGap(27, 27, 27)
                                .addComponent(perempuan)
                                .addGap(18, 18, 18)
                                .addComponent(unknown)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtDataMahasiswa)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfieldnim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfieldnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lihat_password, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtfieldpassword)
                        .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldgender)
                    .addComponent(laki_laki)
                    .addComponent(unknown)
                    .addComponent(perempuan))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtfieldjurusan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pilih_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapus_all, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed
        // TODO add your handling code here:
        String nimValue = nim.getText().trim();

        if (!nimValue.matches("\\d{6}")) {
            JOptionPane.showMessageDialog(this, "NIM harus berupa 6 digit angka", "Perhatian", JOptionPane.WARNING_MESSAGE);
            nim.setText(""); // Clear the NIM field
            return;
        }

        try {
            int nimIntValue = Integer.parseInt(nimValue);

            if (nimValue.length() == 6) {
            } else {
                JOptionPane.showMessageDialog(this, "NIM harus berupa 6 digit bilangan bulat", "Perhatian", JOptionPane.WARNING_MESSAGE);
                nim.setText("");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "NIM harus berupa bilangan bulat", "Perhatian", JOptionPane.WARNING_MESSAGE);
            nim.setText("");
        }
    }//GEN-LAST:event_nimActionPerformed


    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void pilih_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilih_jurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilih_jurusanActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        ClassDB.getConnection();
        if (nama.getText().equals("") || nim.getText().equals("") || pilih_jurusan.getSelectedIndex() == 0 || password.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else if (pilih_jurusan.getSelectedItem().toString().equals("Pilih Jurusan")) {
            JOptionPane.showMessageDialog(this, "Pilih jurusan yang valid", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else if (pilih_jurusan.getSelectedItem().toString().equals("Pilih Jurusan")) {
            JOptionPane.showMessageDialog(this, "Pilih jurusan yang valid", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else if (!isValidNIM(nim.getText())) {
            JOptionPane.showMessageDialog(this, "NIM harus berupa 6 digit angka", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection c = ClassDB.getConnection();
                String sql = "INSERT INTO MHS (nim, nama, jurusan, gender, password) VALUES (?, ?, ?, ?, ?)";

                try (PreparedStatement pst = c.prepareStatement(sql)) {
                    pst.setString(1, nim.getText());
                    pst.setString(2, nama.getText());
                    pst.setString(3, pilih_jurusan.getSelectedItem().toString());

                    if (laki_laki.isSelected()) {
                        pst.setString(4, "Laki - Laki");
                    } else if (perempuan.isSelected()) {
                        pst.setString(4, "Perempuan");
                    } else {
                        pst.setString(4, "Tidak Diketahui");
                    }

                    pst.setString(5, new String(password.getPassword()));

                    int rowsAffected = pst.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                        LoadDataMhs();
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal menyimpan data", "Perhatian", JOptionPane.ERROR_MESSAGE);
                    }
                }

                Bersihkan();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Bersihkan();
    }//GEN-LAST:event_resetActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus", "Perhatian", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String selectedNIM = jTable1.getValueAt(selectedRowIndex, 0).toString();

        hapusData(selectedNIM);
    }//GEN-LAST:event_hapusActionPerformed

    private void hapus_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_allActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus semua data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection c = ClassDB.getConnection();
                Statement st = c.createStatement();

                String sql = "DELETE FROM MHS";
                int rowsAffected = st.executeUpdate(sql);

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Semua data berhasil dihapus");
                    LoadDataMhs();
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus data", "Perhatian", JOptionPane.ERROR_MESSAGE);
                }

                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }//GEN-LAST:event_hapus_allActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        Pilih_Project_Java_GUI pilih_project = new Pilih_Project_Java_GUI();
        pilih_project.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void lihat_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihat_passwordActionPerformed
        // TODO add your handling code here:
        if (lihat_password.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_lihat_passwordActionPerformed

    private void initializeRadioButtons() {
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(laki_laki);
        genderGroup.add(perempuan);
        genderGroup.add(unknown);
    }

    private void laki_lakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laki_lakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laki_lakiActionPerformed

    private void perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuanActionPerformed

    private void unknownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unknownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unknownActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        ubah_data();
    }//GEN-LAST:event_ubahActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    public void LoadDataMhs() {
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("NIM");
        model.addColumn("NAMA");
        model.addColumn("PASSWORD");  // Add password column
        model.addColumn("GENDER");  // Add gender column
        model.addColumn("JURUSAN");
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = pbo_form_mahasiswa.ClassDB.getConnection();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM MHS";
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                Object[] o = new Object[5];
                o[0] = r.getString("nim");
                o[1] = r.getString("nama");
                String password = r.getString("password");
                o[2] = (password != null && !password.isEmpty()) ? "****" : "";

                o[3] = r.getString("gender");
                o[4] = r.getString("jurusan");
                model.addRow(o);
            }

            for (int i = 0; i < model.getColumnCount(); i++) {
                TableColumn column = jTable1.getColumnModel().getColumn(i);
                if (i == 0) column.setPreferredWidth(80);
                if (i == 1) column.setPreferredWidth(200);
                if (i == 2) column.setPreferredWidth(150);
            }

            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }



    public void Bersihkan() {
        nim.setText("");
        nama.setText("");
        pilih_jurusan.setSelectedIndex(0);
        password.setText("");
        lihat_password.setSelected(false); // Unselect the "Show Password" checkbox
        password.setEchoChar('\u2022'); // Reset password visibility

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(laki_laki);
        genderGroup.add(perempuan);
        genderGroup.add(unknown);
        genderGroup.clearSelection();
    }


    private void hapusData(String nim) {
        try {
            Connection c = ClassDB.getConnection();
            Statement st = c.createStatement();

            String sql = "DELETE FROM MHS WHERE nim = '" + nim + "'";
            st.executeUpdate(sql);

            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            LoadDataMhs();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void ubah_data() {
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah", "Perhatian", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String selectedNIM = jTable1.getValueAt(selectedRowIndex, 0).toString();

        String newNIM = nim.getText();
        String newNama = nama.getText();
        String newJurusan = pilih_jurusan.getSelectedItem().toString();
        String newGender = getSelectedGender(); // Assuming you have a method to get the selected gender
        String newPassword = new String(password.getPassword()); // Assuming you have a JPasswordField named passwordField

        if (newNIM.equals("") || newNama.equals("") || newJurusan.equals("") || newJurusan.equals("Pilih Jurusan") || newGender.equals("") || newPassword.equals("")) {
            JOptionPane.showMessageDialog(this, "Data belum lengkap", "Perhatian", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            Connection c = ClassDB.getConnection();
            Statement st = c.createStatement();

            String sql = "UPDATE MHS SET nim='" + newNIM + "', nama='" + newNama + "', jurusan='" + newJurusan + "', gender='" + newGender + "', password='" + newPassword + "' WHERE nim='" + selectedNIM + "'";
            st.executeUpdate(sql);

            JOptionPane.showMessageDialog(this, "Data berhasil diubah");
            LoadDataMhs();
            Bersihkan();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getSelectedGender() {
        if (laki_laki.isSelected()) {
            return "Laki - Laki";
        } else if (perempuan.isSelected()) {
            return "Perempuan";
        } else if (unknown.isSelected()) {
            return "Tidak Diketahui";
        } else {
            return ""; // Handle the case when no radio button is selected
        }
    }

    private boolean isValidNIM(String nim) {
        try {
            int nimValue = Integer.parseInt(nim);
            return nim.length() == 6;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isValidNIM() {
        return nim.getText().length() == 6;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali;
    private javax.swing.JButton hapus;
    private javax.swing.JButton hapus_all;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton laki_laki;
    private javax.swing.JCheckBox lihat_password;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JComboBox pilih_jurusan;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JLabel txtDataMahasiswa;
    private javax.swing.JLabel txtfieldgender;
    private javax.swing.JLabel txtfieldjurusan;
    private javax.swing.JLabel txtfieldnama;
    private javax.swing.JLabel txtfieldnim;
    private javax.swing.JLabel txtfieldpassword;
    private javax.swing.JButton ubah;
    private javax.swing.JRadioButton unknown;
    // End of variables declaration//GEN-END:variables
}
