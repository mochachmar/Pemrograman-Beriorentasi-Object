package pbo_222362_moch_achmar_j_praktek.login;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;
import pbo_222362_moch_achmar_j_praktek.manager.FormsManager;
import javax.swing.*;
import java.awt.*;
import pbo_222362_moch_achmar_j_praktek.DatabaseConnection.DatabaseConnection;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.prefs.Preferences;
import pbo_pilih_project_java.Pilih_Project_Java_GUI;

public class SignIn extends JPanel {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JCheckBox chRememberMe;
    public SignIn() {
        init();
    }

    private void init() {
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        chRememberMe = new JCheckBox("Jangan melupakan aku");
        JButton cmdLogin = new JButton("Cuss langsung masuk !");
        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE, "arc:20;" +
                "[light]background:darken(@background,3%);" +
                "[dark]background:lighten(@background,3%)");

        txtPassword.putClientProperty(FlatClientProperties.STYLE,
                "showRevealButton:true");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, "[light]background:darken(@background,10%);" +
                "[dark]background:lighten(@background,10%);" +
                "borderWidth:0;" +
                "focusWidth:0;" +
                "innerFocusWidth:0");

        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan nama pengguna atau email surel");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan password");

        JLabel lbTitle = new JLabel("Selamat datang di Welcome !");
        JLabel description = new JLabel("Silahkan masuk terlebih dahulu !");
        lbTitle.putClientProperty(FlatClientProperties.STYLE,
                "font:bold +10");
        description.putClientProperty(FlatClientProperties.STYLE, "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%)");

        panel.add(lbTitle);
        panel.add(description);
        panel.add(new JLabel("Nama Pengguna / Email Surel"), "gapy 8");
        panel.add(txtUsername);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(txtPassword);
        panel.add(chRememberMe, "grow 0");
        panel.add(cmdLogin, "gapy 10");
        panel.add(createSignupLabel(), "gapy 10");
        add(panel);



        // Add focus listeners to text fields
        txtUsername.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtUsername.setEnabled(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txtUsername.setEnabled(false);
            }
        });

        txtPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                txtPassword.setEnabled(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
                txtPassword.setEnabled(false);
            }
        });

        txtUsername.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtUsername.setEnabled(true);
            }
        });

        txtPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtPassword.setEnabled(true);
            }
        });

        txtUsername.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        txtPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        cmdLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usernameOrEmail = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                // Validate the input
                if (usernameOrEmail.isEmpty()) {
                    JOptionPane.showMessageDialog(SignIn.this, "Silakan isi username/email !");
                } else if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(SignIn.this, "Silakan isi password !");
                } else {
                    boolean rememberMe = chRememberMe.isSelected();

                    if (login(usernameOrEmail, password)) {
                        if (rememberMe) {
                            saveLoginInfo(usernameOrEmail, password);
                        } else {
                            clearSavedLoginInfo();
                        }
                        JOptionPane.showMessageDialog(SignIn.this, "Berhasil masuk ! Anda akan segera dialihkan !");
                        Pilih_Project_Java_GUI pilih_project = new Pilih_Project_Java_GUI();
                        pilih_project.setVisible(true);
                    }
                }
            }
        });


    }

    private void saveLoginInfo(String usernameOrEmail, String password) {
        Preferences preferences = Preferences.userNodeForPackage(SignIn.class);
        preferences.put("usernameOrEmail", usernameOrEmail);
        preferences.put("password", password);
    }

    private void clearSavedLoginInfo() {
        Preferences preferences = Preferences.userNodeForPackage(SignIn.class);
        preferences.remove("usernameOrEmail");
        preferences.remove("password");
    }


    private Component createSignupLabel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE,
                "background:null");
        JButton cmdRegister = new JButton("<html><a href=\"#\">Daftar dulu ga sehh ?!</a></html>");
        cmdRegister.putClientProperty(FlatClientProperties.STYLE,
                "border:3,3,3,3");
        cmdRegister.setContentAreaFilled(false);
        cmdRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdRegister.addActionListener(e -> FormsManager.getInstance().showForm(new SignUp()));
        JLabel label = new JLabel("Belum punya akun ?");
        label.putClientProperty(FlatClientProperties.STYLE, "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%)");
        panel.add(label);
        panel.add(cmdRegister);
        return panel;
    }

    private void login() {
        String usernameOrEmail = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        if (usernameOrEmail.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silakan isi username/email !");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silakan isi password !");
        } else {
            boolean rememberMe = chRememberMe.isSelected();

            if (checkUser(usernameOrEmail, password)) {
                if (rememberMe) {
                    saveLoginInfo(usernameOrEmail, password);
                }
                JOptionPane.showMessageDialog(this, "Berhasil masuk!");
            }
        }
    }

    private boolean checkUser(String usernameOrEmail, String password) {
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            try {
                String userCheckQuery = "SELECT * FROM users WHERE username = ? OR email = ?";
                PreparedStatement userCheckStatement = connection.prepareStatement(userCheckQuery);
                userCheckStatement.setString(1, usernameOrEmail);
                userCheckStatement.setString(2, usernameOrEmail);

                ResultSet userCheckResultSet = userCheckStatement.executeQuery();

                if (userCheckResultSet.next()) {
                    String storedPassword = userCheckResultSet.getString("password");
                    if (password.equals(storedPassword)) {
                        userCheckResultSet.close();
                        userCheckStatement.close();
                        connection.close();
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(this, "Password Salah!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal masuk! Username / Email atau Password yang anda masukkan " +
                            "salah atau akun belum terdaftar !");
                }

                userCheckResultSet.close();
                userCheckStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


    private boolean login(String usernameOrEmail, String password) {
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            try {
                String query = "SELECT * FROM users WHERE (username = ? OR email = ?) AND password = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, usernameOrEmail);
                statement.setString(2, usernameOrEmail);
                statement.setString(3, password);

                ResultSet resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    resultSet.close();
                    statement.close();
                    connection.close();
                    return true;
                }

                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
