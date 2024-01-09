package pbo_form_mahasiswa;

import com.formdev.flatlaf.json.ParseException;
import pbo_pilih_project_java.Pilih_Project_Java_GUI;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class CRUD extends javax.swing.JFrame {

    private DefaultTableModel model;
    String path_foto;
    public CRUD() {
        initComponents();
        setLocationRelativeTo(this);
        LoadDataMhs();
        Bersihkan();
        initializeRadioButtons();
        jTable1.getSelectionModel().addListSelectionListener(e -> tableSelectionChanged());
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDataMahasiswa = new javax.swing.JLabel();
        txtfieldnim = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
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
        txtfieldcari = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        garis_pembatas = new javax.swing.JLabel();
        foto = new javax.swing.JLabel();
        pilih_foto = new javax.swing.JButton();
        txtfieldtgllahir = new javax.swing.JLabel();
        tgl_lahir = new com.toedter.calendar.JDateChooser();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtDataMahasiswa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtDataMahasiswa.setText("DATA MAHASISWA CRUD PBO");

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

        txtfieldcari.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldcari.setText("CARI                  :");

        cari.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        garis_pembatas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        garis_pembatas.setText("_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");

        foto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foto.setText("FOTO");

        pilih_foto.setText("...");
        pilih_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilih_fotoActionPerformed(evt);
            }
        });

        txtfieldtgllahir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldtgllahir.setText("TANGGAL LAHIR   :");

        print.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        print.setText("CETAK");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtfieldnim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfieldpassword)
                                .addComponent(txtfieldgender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfieldnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtfieldjurusan)
                            .addComponent(txtfieldtgllahir))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hapus_all, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(Kembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(369, 369, 369))
                            .addComponent(tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDataMahasiswa)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(laki_laki)
                                            .addGap(18, 18, 18)
                                            .addComponent(perempuan)
                                            .addGap(18, 18, 18)
                                            .addComponent(unknown))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pilih_jurusan, javax.swing.GroupLayout.Alignment.LEADING, 0, 800, Short.MAX_VALUE)
                                            .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nim, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(18, 18, 18)
                                .addComponent(lihat_password)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pilih_foto)
                                .addGap(26, 26, 26)))))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfieldcari, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(cari))
                    .addComponent(garis_pembatas, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtDataMahasiswa)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldnim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfieldpassword)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lihat_password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfieldgender)
                            .addComponent(laki_laki)
                            .addComponent(perempuan)
                            .addComponent(unknown))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfieldjurusan)
                            .addComponent(pilih_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfieldtgllahir)
                            .addComponent(tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(247, 247, 247))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(399, 399, 399)
                                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pilih_foto)
                                    .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hapus_all, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(garis_pembatas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldcari)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
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
        if (nama.getText().equals("") || nim.getText().equals("") || pilih_jurusan.getSelectedIndex() == 0 || password.getPassword().length == 0 || tgl_lahir.getDate() == null || path_foto == null) {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else if (pilih_jurusan.getSelectedItem().toString().equals("Pilih Jurusan")) {
            JOptionPane.showMessageDialog(this, "Pilih jurusan yang valid", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else if (!isValidNIM(nim.getText())) {
            JOptionPane.showMessageDialog(this, "NIM harus berupa 6 digit angka", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection c = ClassDB.getConnection();

                String checkNIMQuery = "SELECT * FROM MHS WHERE nim = ?";
                try (PreparedStatement checkNIMPst = c.prepareStatement(checkNIMQuery)) {
                    checkNIMPst.setString(1, nim.getText());
                    ResultSet resultSet = checkNIMPst.executeQuery();

                    if (resultSet.next()) {
                        JOptionPane.showMessageDialog(this, "NIM sudah ada di database", "Perhatian", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }

                String insertQuery = "INSERT INTO MHS (nim, nama, jurusan, gender, password, foto_path, tanggal_lahir) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pst = c.prepareStatement(insertQuery)) {
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
                    pst.setString(6, path_foto);

                    // The rest of your code remains unchanged
                    java.sql.Date sqlDate = new java.sql.Date(tgl_lahir.getDate().getTime());
                    pst.setDate(7, sqlDate);

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

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        // TODO add your handling code here:
        String searchKeyword = cari.getText().trim();

        if (searchKeyword.isEmpty()) {
            LoadDataMhs();
        } else {
            searchAndLoadData(searchKeyword);
        }
    }//GEN-LAST:event_cariKeyReleased

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            String jrxmlFile = "src/main/java/Laporan/Data_Mhs.jrxml";
            Connection c = ClassDB.getConnection();
            JasperReport JRpt = JasperCompileManager.compileReport(jrxmlFile);
            JasperPrint Jprint = JasperFillManager.fillReport(JRpt, null, c);
            JasperViewer jv = new JasperViewer(Jprint, false);
            jv.setTitle("Laporan Mahasiswa");
            jv.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_printActionPerformed

    private void pilih_fotoActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("PILIH FOTO MAHASISWA");
        jfc.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "jpeg", "png"));

        if (jfc.showOpenDialog(this) == jfc.APPROVE_OPTION) {
            path_foto = jfc.getSelectedFile().toString();
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(path_foto).getImage().getScaledInstance(200, 230,
                    Image.SCALE_DEFAULT));
            foto.setIcon(imageIcon); // Set the selected photo to the display label
        }
    }

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
        model.addColumn("PASSWORD");
        model.addColumn("GENDER");
        model.addColumn("JURUSAN");
        model.addColumn("TGL LAHIR");
        model.addColumn("LOKASI FOTO");
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = pbo_form_mahasiswa.ClassDB.getConnection();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM MHS";
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                Object[] o = new Object[7];
                o[0] = r.getString("nim");
                o[1] = r.getString("nama");
                String password = r.getString("password");
                o[2] = (password != null && !password.isEmpty()) ? "[Password Protected]" : "";
                o[3] = r.getString("gender");
                o[4] = r.getString("jurusan");
                o[5] = r.getString("tanggal_lahir");
                o[6] = r.getString("foto_path");
                model.addRow(o);
            }

            for (int i = 0; i < model.getColumnCount(); i++) {
                TableColumn column = jTable1.getColumnModel().getColumn(i);
                if (i == 0) column.setPreferredWidth(80);
                if (i == 1) column.setPreferredWidth(200);
                if (i == 2) column.setPreferredWidth(150);
                if (i == 3) column.setPreferredWidth(100);
                if (i == 4) column.setPreferredWidth(150);
            }

            r.close();
            s.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }

        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private void searchAndLoadData(String searchKeyword) {
        try {
            Connection c = pbo_form_mahasiswa.ClassDB.getConnection();
            String sql = "SELECT * FROM MHS WHERE nim LIKE ? OR nama LIKE ? OR jurusan LIKE ? OR gender LIKE ? OR " +
                    "password LIKE ? OR foto_path LIKE ? OR tanggal_lahir LIKE ?";
            try (PreparedStatement pst = c.prepareStatement(sql)) {
                // Use "%" to match any characters before and after the search keyword
                pst.setString(1, "%" + searchKeyword + "%");
                pst.setString(2, "%" + searchKeyword + "%");
                pst.setString(3, "%" + searchKeyword + "%");
                pst.setString(4, "%" + searchKeyword + "%");
                pst.setString(5, "%" + searchKeyword + "%");
                pst.setString(6, "%" + searchKeyword + "%");
                pst.setString(7, "%" + searchKeyword + "%");

                ResultSet r = pst.executeQuery();

                model.getDataVector().removeAllElements();
                model.fireTableDataChanged();

                while (r.next()) {
                    Object[] o = new Object[7];
                    o[0] = r.getString("nim");
                    o[1] = r.getString("nama");
                    String password = r.getString("password");
                    o[2] = (password != null && !password.isEmpty()) ? "[Password Protected]" : "";
                    o[3] = r.getString("gender");
                    o[4] = r.getString("jurusan");
                    o[5] = r.getString("tanggal_lahir");
                    o[6] = r.getString("foto_path");
                    model.addRow(o);
                }

                for (int i = 0; i < model.getColumnCount(); i++) {
                    TableColumn column = jTable1.getColumnModel().getColumn(i);
                    if (i == 0) column.setPreferredWidth(80);
                    if (i == 1) column.setPreferredWidth(200);
                    if (i == 2) column.setPreferredWidth(150);
                    if (i == 3) column.setPreferredWidth(100);
                    if (i == 4) column.setPreferredWidth(150);
                }

                r.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
    }

    public void Bersihkan() {
        nim.setText("");
        nama.setText("");
        pilih_jurusan.setSelectedIndex(0);
        password.setText("");
        lihat_password.setSelected(false);
        password.setEchoChar('\u2022');

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(laki_laki);
        genderGroup.add(perempuan);
        genderGroup.add(unknown);
        genderGroup.clearSelection();

        tgl_lahir.setDate(null);

        foto.setIcon(null);
        foto.setText("FOTO");
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
        if (nama.getText().equals("") || nim.getText().equals("") || pilih_jurusan.getSelectedIndex() == 0 || password.getPassword().length == 0 || tgl_lahir.getDate() == null || path_foto == null) {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else if (pilih_jurusan.getSelectedItem().toString().equals("Pilih Jurusan")) {
            JOptionPane.showMessageDialog(this, "Pilih jurusan yang valid", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else if (!isValidNIM(nim.getText())) {
            JOptionPane.showMessageDialog(this, "NIM harus berupa 6 digit angka", "Perhatian", JOptionPane.WARNING_MESSAGE);
        } else {
            int selectedRowIndex = jTable1.getSelectedRow();

            if (selectedRowIndex == -1) {
                JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah", "Perhatian", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String selectedNIM = jTable1.getValueAt(selectedRowIndex, 0).toString();

            String newNIM = nim.getText();
            String newNama = nama.getText();
            String newJurusan = pilih_jurusan.getSelectedItem().toString();
            String newGender = getSelectedGender();
            String newPassword = new String(password.getPassword());

            if (newNIM.equals("") || newNama.equals("") || newJurusan.equals("") || newJurusan.equals("Pilih Jurusan") || newGender.equals("") || newPassword.equals("")) {
                JOptionPane.showMessageDialog(this, "Data belum lengkap", "Perhatian", JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                Connection c = ClassDB.getConnection();

                String checkNIMQuery = "SELECT * FROM MHS WHERE nim = ? AND nim != ?";
                try (PreparedStatement checkNIMPst = c.prepareStatement(checkNIMQuery)) {
                    checkNIMPst.setString(1, newNIM);
                    checkNIMPst.setString(2, selectedNIM);

                    ResultSet resultSet = checkNIMPst.executeQuery();

                    if (resultSet.next()) {
                        JOptionPane.showMessageDialog(this, "NIM sudah ada di database", "Perhatian", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }

                String updateQuery = "UPDATE MHS SET nim=?, nama=?, jurusan=?, gender=?, password=?, tanggal_lahir=?, foto_path=? WHERE nim=?";
                try (PreparedStatement pst = c.prepareStatement(updateQuery)) {
                    pst.setString(1, newNIM);
                    pst.setString(2, newNama);
                    pst.setString(3, newJurusan);
                    pst.setString(4, newGender);
                    pst.setString(5, newPassword);

                    java.sql.Date sqlDate = new java.sql.Date(tgl_lahir.getDate().getTime());
                    pst.setDate(6, sqlDate);

                    pst.setString(7, path_foto);

                    pst.setString(8, selectedNIM);

                    int rowsAffected = pst.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Data berhasil diubah");
                        LoadDataMhs();
                        Bersihkan();
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal mengubah data", "Perhatian", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
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
            return "";
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

    private void tableSelectionChanged() {
        int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex != -1) {
            String selectedNIM = jTable1.getValueAt(selectedRowIndex, 0).toString();
            String selectedNama = jTable1.getValueAt(selectedRowIndex, 1).toString();

            String selectedPassword = getPasswordFromDatabase(selectedNIM);

            nim.setText(selectedNIM);
            nama.setText(selectedNama);
            password.setText(selectedPassword);

            String selectedGender = jTable1.getValueAt(selectedRowIndex, 3).toString();
            if (selectedGender.equals("Laki - Laki")) {
                laki_laki.setSelected(true);
            } else if (selectedGender.equals("Perempuan")) {
                perempuan.setSelected(true);
            } else {
                unknown.setSelected(true);
            }

            String selectedJurusan = jTable1.getValueAt(selectedRowIndex, 4).toString();
            pilih_jurusan.setSelectedItem(selectedJurusan);

            String selectedDate = jTable1.getValueAt(selectedRowIndex, 5).toString();
            try {
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(selectedDate);
                tgl_lahir.setDate(date);
            } catch (ParseException e) {
            } catch (java.text.ParseException e) {
                throw new RuntimeException(e);
            }

            String path_foto = jTable1.getValueAt(selectedRowIndex, 6).toString();
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(path_foto).getImage().getScaledInstance(200, 230,
                    Image.SCALE_DEFAULT));
            foto.setIcon(imageIcon);
        }
    }

    private String getPasswordFromDatabase(String nim) {
        String password = "";

        try {
            Connection c = ClassDB.getConnection();
            String sql = "SELECT password FROM MHS WHERE nim = ?";
            try (PreparedStatement pst = c.prepareStatement(sql)) {
                pst.setString(1, nim);

                ResultSet resultSet = pst.executeQuery();
                if (resultSet.next()) {
                    password = resultSet.getString("password");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return password;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kembali;
    private javax.swing.JTextField cari;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel garis_pembatas;
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
    private javax.swing.JButton pilih_foto;
    private javax.swing.JComboBox pilih_jurusan;
    private javax.swing.JButton print;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private com.toedter.calendar.JDateChooser tgl_lahir;
    private javax.swing.JLabel txtDataMahasiswa;
    private javax.swing.JLabel txtfieldcari;
    private javax.swing.JLabel txtfieldgender;
    private javax.swing.JLabel txtfieldjurusan;
    private javax.swing.JLabel txtfieldnama;
    private javax.swing.JLabel txtfieldnim;
    private javax.swing.JLabel txtfieldpassword;
    private javax.swing.JLabel txtfieldtgllahir;
    private javax.swing.JButton ubah;
    private javax.swing.JRadioButton unknown;
    // End of variables declaration//GEN-END:variables
}
