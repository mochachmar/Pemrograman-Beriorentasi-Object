package pbo_splash_screen;

import pbo_222362_moch_achmar_j_praktek.main.Application;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.*;
import java.awt.*;

public class Splash_Screen extends javax.swing.JFrame {
    public Splash_Screen() {
        initComponents();
        setLocationRelativeTo(this);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Splash_Screen = new javax.swing.JLabel();
        progress_bar = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        loading = new javax.swing.JLabel();
        Creator = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Splash_Screen.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Splash_Screen.setText("Selamat Datang di Welcome");

        progress_bar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        progress_bar.setText("0%");

        loading.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loading.setText("Sedang memuat");

        Creator.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Creator.setText("Creator By Moch Achmar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(progress_bar)
                        .addGap(619, 619, 619))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Creator)
                        .addGap(632, 632, 632))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Splash_Screen)
                        .addGap(506, 506, 506))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(Splash_Screen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Creator)
                .addGap(92, 92, 92)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progress_bar)
                    .addComponent(loading))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("pbo_222362_moch_achmar_j_tugas_5.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();

        Splash_Screen loading_screen = new Splash_Screen();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });

        loading_screen.setVisible(true);

        try {
            for(int i = 0; i<=100; i++) {
                Thread.sleep(80);
                loading_screen.ProgressBar.setValue(i);
                loading_screen.progress_bar.setText(Integer.toString(i)+"%");
            }
        } catch (Exception e) {

        }

        loading_screen.dispose();
        new Application().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Creator;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel Splash_Screen;
    private javax.swing.JLabel loading;
    private javax.swing.JLabel progress_bar;
    // End of variables declaration//GEN-END:variables
}
