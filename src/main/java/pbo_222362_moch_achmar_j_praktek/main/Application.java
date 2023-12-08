package pbo_222362_moch_achmar_j_praktek.main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import pbo_222362_moch_achmar_j_praktek.login.SignIn;
import pbo_222362_moch_achmar_j_praktek.manager.FormsManager;
import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application() {
        init();
    }

    private void init() {
        setTitle("Form Login and SignUp PBO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1200, 700));
        setLocationRelativeTo(null);
        setContentPane(new SignIn());
        FormsManager.getInstance().initApplication(this);
    }

    public static void main(String[] args) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("pbo_222362_moch_achmar_j_tugas_5.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();
        EventQueue.invokeLater(() -> new Application().setVisible(true));
    }
}
