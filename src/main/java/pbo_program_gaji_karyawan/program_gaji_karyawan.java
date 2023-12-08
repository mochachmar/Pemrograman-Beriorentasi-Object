package pbo_program_gaji_karyawan;

import pbo_pilih_project_java.Pilih_Project_Java_GUI;
import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class program_gaji_karyawan extends javax.swing.JFrame {
    private double gapok, tunjangan, tunjanganAnak, pajak, totalGaji, gajiBersih;
    public program_gaji_karyawan() {
        initComponents();
        lockFields();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label_nik = new javax.swing.JLabel();
        txtfieldnik = new javax.swing.JTextField();
        txtfieldnik.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                validateNIK();
            }
        });
        label_nama = new javax.swing.JLabel();
        txtfieldnama = new javax.swing.JTextField();
        label_jumlah_anak = new javax.swing.JLabel();
        combobox_golongan = new javax.swing.JComboBox();
        label_golongan = new javax.swing.JLabel();
        txtfield_jumlah_anak = new javax.swing.JTextField();
        label_gapok = new javax.swing.JLabel();
        gaji_pokok = new javax.swing.JTextField();
        label_tunjangan = new javax.swing.JLabel();
        txtfield_tunjangan = new javax.swing.JTextField();
        label_total_gaji = new javax.swing.JLabel();
        txtfield_total_gaji = new javax.swing.JTextField();
        label_gaji_bersih = new javax.swing.JLabel();
        txtfield_gaji_bersih = new javax.swing.JTextField();
        label_tunjangan_anak = new javax.swing.JLabel();
        txtfield_tunjangan_anak = new javax.swing.JTextField();
        label_pajak = new javax.swing.JLabel();
        pajak_10_persen = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        tampil = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("PROGRAM GAJI KARYAWAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(370, 370, 370))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        label_nik.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_nik.setText("NIK                    : ");

        txtfieldnik.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldnikActionPerformed(evt);
            }
        });

        label_nama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_nama.setText("NAMA                 :");

        txtfieldnama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfieldnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldnamaActionPerformed(evt);
            }
        });

        label_jumlah_anak.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_jumlah_anak.setText("JUMLAH ANAK       : ");

        combobox_golongan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        combobox_golongan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Golongan", "A", "B", "C" }));
        combobox_golongan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_golonganActionPerformed(evt);
            }
        });

        label_golongan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_golongan.setText("GOLONGAN         :");

        txtfield_jumlah_anak.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfield_jumlah_anak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_jumlah_anakActionPerformed(evt);
            }
        });

        label_gapok.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_gapok.setText("GAPOK               : ");

        gaji_pokok.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gaji_pokok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaji_pokokActionPerformed(evt);
            }
        });

        label_tunjangan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_tunjangan.setText("TUNJANGAN        : ");

        txtfield_tunjangan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfield_tunjangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_tunjanganActionPerformed(evt);
            }
        });

        label_total_gaji.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_total_gaji.setText("TOTAL GAJI        : ");

        txtfield_total_gaji.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfield_total_gaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_total_gajiActionPerformed(evt);
            }
        });

        label_gaji_bersih.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_gaji_bersih.setText("GAJI BERSIH       : ");

        txtfield_gaji_bersih.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfield_gaji_bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_gaji_bersihActionPerformed(evt);
            }
        });

        label_tunjangan_anak.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_tunjangan_anak.setText("TUNJANGAN ANAK : ");

        txtfield_tunjangan_anak.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfield_tunjangan_anak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_tunjangan_anakActionPerformed(evt);
            }
        });

        label_pajak.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_pajak.setText("PAJAK 10%          : ");

        pajak_10_persen.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pajak_10_persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pajak_10_persenActionPerformed(evt);
            }
        });

        hitung.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hitung.setText("HITUNG");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        tampil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tampil.setText("TAMPILKAN");
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        kembali.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kembali.setText("KEMBALI");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        txt_area.setColumns(20);
        txt_area.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_area.setRows(5);
        jScrollPane2.setViewportView(txt_area);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nama)
                            .addComponent(label_nik)
                            .addComponent(label_golongan)
                            .addComponent(label_gapok)
                            .addComponent(label_tunjangan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfieldnik)
                            .addComponent(txtfieldnama)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(combobox_golongan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(gaji_pokok)
                                            .addComponent(txtfield_tunjangan))
                                        .addGap(159, 159, 159)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kembali)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label_tunjangan_anak)
                                                .addComponent(label_jumlah_anak)
                                                .addComponent(label_pajak))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(pajak_10_persen, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                                .addComponent(txtfield_jumlah_anak)
                                                .addComponent(txtfield_tunjangan_anak)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(hitung)
                                            .addGap(50, 50, 50)
                                            .addComponent(tampil)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_total_gaji)
                                    .addComponent(label_gaji_bersih))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtfield_gaji_bersih, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(txtfield_total_gaji))))
                        .addGap(0, 502, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldnik)
                    .addComponent(label_nik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfieldnama)
                    .addComponent(label_nama))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_jumlah_anak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfield_jumlah_anak))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combobox_golongan)
                        .addComponent(label_golongan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_gapok, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gaji_pokok))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_tunjangan_anak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfield_tunjangan_anak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_tunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfield_tunjangan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_pajak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pajak_10_persen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_total_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfield_total_gaji))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_gaji_bersih, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfield_gaji_bersih)
                    .addComponent(hitung)
                    .addComponent(tampil)
                    .addComponent(reset))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(kembali)))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfieldnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldnikActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtfieldnikActionPerformed

    private void txtfieldnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldnamaActionPerformed

    private void combobox_golonganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_golonganActionPerformed
        // TODO add your handling code here:
        switch (combobox_golongan.getSelectedItem().toString()) {
            case "A":
                gapok = 500000;
                tunjangan = 100000;
                break;
            case "B":
                gapok = 600000;
                tunjangan = 200000;
                break;
            case "C":
                gapok = 700000;
                tunjangan = 300000;
                break;
            default:
                gapok = 0;
                tunjangan = 0;
                break;
        }

        gaji_pokok.setText(String.valueOf(gapok));
        txtfield_tunjangan.setText(String.valueOf(tunjangan));
    }//GEN-LAST:event_combobox_golonganActionPerformed

    private void txtfield_jumlah_anakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_jumlah_anakActionPerformed
        // TODO add your handling code here:
        if (!txtfield_jumlah_anak.getText().isEmpty()) {
            int jumlahAnak = Integer.parseInt(txtfield_jumlah_anak.getText());
            tunjanganAnak = jumlahAnak * 50000;
            txtfield_tunjangan_anak.setText(String.valueOf(tunjanganAnak));

            // Memanggil fungsi perhitungan total gaji setiap kali ada perubahan
            hitungTotalGaji();
        }
    }//GEN-LAST:event_txtfield_jumlah_anakActionPerformed

    private void gaji_pokokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaji_pokokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gaji_pokokActionPerformed

    private void txtfield_tunjangan_anakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_tunjangan_anakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_tunjangan_anakActionPerformed

    private void txtfield_tunjanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_tunjanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_tunjanganActionPerformed

    private void pajak_10_persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pajak_10_persenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pajak_10_persenActionPerformed

    private void txtfield_total_gajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_total_gajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_total_gajiActionPerformed

    private void txtfield_gaji_bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_gaji_bersihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_gaji_bersihActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        if (combobox_golongan.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Pilih golongan terlebih dahulu");
        } else if (txtfield_total_gaji.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Total Gaji Belum dihitung");
        } else {
            totalGaji = Double.parseDouble(txtfield_total_gaji.getText());
            pajak = 0.1 * totalGaji;
            gajiBersih = totalGaji - pajak;

            NumberFormat formatRp = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
            txtfield_gaji_bersih.setText(formatRp.format(gajiBersih));
        }

    }//GEN-LAST:event_hitungActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        // TODO add your handling code here:
        if (isFormComplete()) {
            String result = "NIK: " + txtfieldnik.getText() +
                    "\nNama: " + txtfieldnama.getText() +
                    "\nGolongan: " + combobox_golongan.getSelectedItem() +
                    "\nGaji Pokok: Rp" + gaji_pokok.getText() +
                    "\nTunjangan: Rp" + txtfield_tunjangan.getText() +
                    "\nJumlah Anak: " + txtfield_jumlah_anak.getText() +
                    "\nTunjangan Anak: Rp" + txtfield_tunjangan_anak.getText() +
                    "\nPPN: Rp" + pajak_10_persen.getText() +
                    "\nGaji Bersih: Rp" + txtfield_gaji_bersih.getText();

            txt_area.setText(result);
        } else {
            JOptionPane.showMessageDialog(null, "Isian Belum Lengkap");
        }
    }//GEN-LAST:event_tampilActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        txtfieldnik.setText("");
        txtfieldnama.setText("");
        txtfield_jumlah_anak.setText("");
        combobox_golongan.setSelectedIndex(0);
        gaji_pokok.setText("");
        txtfield_tunjangan_anak.setText("");
        txtfield_tunjangan.setText("");
        pajak_10_persen.setText("");
        txtfield_total_gaji.setText("");
        txtfield_gaji_bersih.setText("");
        txt_area.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        Pilih_Project_Java_GUI pilih_project = new Pilih_Project_Java_GUI();
        pilih_project.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private boolean isFormComplete() {
        // Memeriksa apakah semua isian telah terisi
        return !txtfieldnik.getText().isEmpty() &&
                !txtfieldnama.getText().isEmpty() &&
                !txtfield_jumlah_anak.getText().isEmpty() &&
                combobox_golongan.getSelectedIndex() > 0 &&
                !gaji_pokok.getText().isEmpty() &&
                !txtfield_tunjangan_anak.getText().isEmpty() &&
                !txtfield_tunjangan.getText().isEmpty() &&
                !pajak_10_persen.getText().isEmpty() &&
                !txtfield_total_gaji.getText().isEmpty() &&
                !txtfield_gaji_bersih.getText().isEmpty();
    }

    private void hitungTotalGaji() {
        totalGaji = gapok + tunjangan + tunjanganAnak;
        pajak = 0.1 * totalGaji;
        txtfield_total_gaji.setText(String.valueOf(totalGaji));
        pajak_10_persen.setText(String.valueOf(pajak));
    }

    private void lockFields() {
        gaji_pokok.setEnabled(false);
        txtfield_tunjangan_anak.setEnabled(false);
        txtfield_tunjangan.setEnabled(false);
        pajak_10_persen.setEnabled(false);
        txtfield_total_gaji.setEnabled(false);
        txtfield_gaji_bersih.setEnabled(false);
    }

    private void validateNIK() {
        // Check if the NIK is a valid integer
        try {
            Integer.parseInt(txtfieldnik.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "NIK harus bilangan bulat", "NIK tidak valid !",
                    JOptionPane.ERROR_MESSAGE);
            txtfieldnik.setText(""); // Clear the field
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new program_gaji_karyawan().setVisible(true);
            }
        });
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(program_gaji_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(program_gaji_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(program_gaji_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(program_gaji_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new program_gaji_karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combobox_golongan;
    private javax.swing.JTextField gaji_pokok;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel label_gaji_bersih;
    private javax.swing.JLabel label_gapok;
    private javax.swing.JLabel label_golongan;
    private javax.swing.JLabel label_jumlah_anak;
    private javax.swing.JLabel label_nama;
    private javax.swing.JLabel label_nik;
    private javax.swing.JLabel label_pajak;
    private javax.swing.JLabel label_total_gaji;
    private javax.swing.JLabel label_tunjangan;
    private javax.swing.JLabel label_tunjangan_anak;
    private javax.swing.JTextField pajak_10_persen;
    private javax.swing.JButton reset;
    private javax.swing.JButton tampil;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txtfield_gaji_bersih;
    private javax.swing.JTextField txtfield_jumlah_anak;
    private javax.swing.JTextField txtfield_total_gaji;
    private javax.swing.JTextField txtfield_tunjangan;
    private javax.swing.JTextField txtfield_tunjangan_anak;
    private javax.swing.JTextField txtfieldnama;
    private javax.swing.JTextField txtfieldnik;
    // End of variables declaration//GEN-END:variables
}
