package pbo_222362_moch_achmar_j_praktek.login;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;
import pbo_222362_moch_achmar_j_praktek.DatabaseConnection.DatabaseConnection;
import pbo_222362_moch_achmar_j_praktek.component.PasswordStrengthStatus;
import pbo_222362_moch_achmar_j_praktek.manager.FormsManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class SignUp extends JPanel {
    private JTextField activeTextField;
    public SignUp() {
        init();
    }

    private void init() {
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
        txtFirstName = new JTextField();
        txtLastName = new JTextField();
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        txtConfirmPassword = new JPasswordField();
        JButton cmdRegister = new JButton("Cuss langsung daftar !");
        PasswordStrengthStatus passwordStrengthStatus = new PasswordStrengthStatus();

        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "[fill,360]"));
        panel.putClientProperty(FlatClientProperties.STYLE, "arc:20;" +
                "[light]background:darken(@background,3%);" +
                "[dark]background:lighten(@background,3%)");

        txtFirstName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Depan");
        txtLastName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nama Belakang");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan nama pengguna atau email surel");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan password");
        txtConfirmPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan ulang password");
        txtPassword.putClientProperty(FlatClientProperties.STYLE,
                "showRevealButton:true");
        txtConfirmPassword.putClientProperty(FlatClientProperties.STYLE,
                "showRevealButton:true");

        cmdRegister.putClientProperty(FlatClientProperties.STYLE, "[light]background:darken(@background,10%);" +
                "[dark]background:lighten(@background,10%);" +
                "borderWidth:0;" +
                "focusWidth:0;" +
                "innerFocusWidth:0");

        JLabel lbTitle = new JLabel("Selamat datang di Welcome !");
        JLabel description = new JLabel("Silahkan daftar terlebih dahulu !");
        lbTitle.putClientProperty(FlatClientProperties.STYLE,
                "font:bold +10");
        description.putClientProperty(FlatClientProperties.STYLE, "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%)");

        passwordStrengthStatus.initPasswordField(txtPassword);

        panel.add(lbTitle);
        panel.add(description);
        panel.add(new JLabel("Nama Lengkap"), "gapy 10");
        panel.add(txtFirstName, "split 2");
        panel.add(txtLastName);
        panel.add(new JLabel("Jenis Kelamin"), "gapy 8");
        panel.add(createGenderPanel());
        panel.add(new JSeparator(), "gapy 5 5");
        panel.add(new JLabel("Nama Pengguna / Email Surel"));
        panel.add(txtUsername);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(txtPassword);
        panel.add(passwordStrengthStatus,"gapy 0");
        panel.add(new JLabel("Konfirmasi Password"), "gapy 0");
        panel.add(txtConfirmPassword);
        panel.add(cmdRegister, "gapy 20");
        panel.add(createLoginLabel(), "gapy 10");
        add(panel);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!txtFirstName.getBounds().contains(e.getPoint()) &&
                        !txtLastName.getBounds().contains(e.getPoint()) &&
                        !txtUsername.getBounds().contains(e.getPoint()) &&
                        !txtPassword.getBounds().contains(e.getPoint()) &&
                        !txtConfirmPassword.getBounds().contains(e.getPoint())) {
                    if (activeTextField != null) {
                        activeTextField.setEnabled(false);
                    }
                }
            }
        });

        class TextFieldActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isInputValid() && isPasswordConfirmationValid()) {
                    registerUser();
                }
            }
        }

        txtFirstName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                activeTextField = txtFirstName;
                txtFirstName.setEnabled(true);
            }
        });

        txtLastName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                activeTextField = txtLastName;
                txtLastName.setEnabled(true);
            }
        });

        txtUsername.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                activeTextField = txtUsername;
                txtUsername.setEnabled(true);
            }
        });

        txtPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                activeTextField = txtPassword;
                txtPassword.setEnabled(true);
            }
        });

        txtConfirmPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                activeTextField = txtConfirmPassword;
                txtConfirmPassword.setEnabled(true);
            }
        });

        txtConfirmPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isInputValid() && isPasswordConfirmationValid()) {
                    registerUser();
                }
            }
        });

        txtFirstName.addActionListener(new TextFieldActionListener());
        txtLastName.addActionListener(new TextFieldActionListener());
        txtUsername.addActionListener(new TextFieldActionListener());
        txtPassword.addActionListener(new TextFieldActionListener());

        cmdRegister.addActionListener(e -> {
            if (isInputValid() && isPasswordConfirmationValid()) {
                registerUser();
            }
        });
    }

    private boolean isInputValid() {
        if (txtFirstName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama Depan belum diisi !");
            return false;
        }
        if (txtUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username or Email belum diisi !");
            return false;
        }
        if (txtPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Password belum diisi !");
            return false;
        }
        if (txtConfirmPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Konfirmasi Password belum diisi !");
            return false;
        }
        return true;
    }

    private boolean isPasswordConfirmationValid() {
        char[] password = txtPassword.getPassword();
        char[] confirmPassword = txtConfirmPassword.getPassword();
        if (!Arrays.equals(password, confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Password tidak sama !");
            return false;
        }
        return true;
    }


    private Component createGenderPanel() {
        JPanel panel = new JPanel(new MigLayout("insets 0"));
        panel.putClientProperty(FlatClientProperties.STYLE,
                "background:null");
        jrMale = new JRadioButton("Laki - Laki");
        JRadioButton jrFemale = new JRadioButton("Perempuan");
        ButtonGroup groupGender = new ButtonGroup();
        groupGender.add(jrMale);
        groupGender.add(jrFemale);
        jrMale.setSelected(true);
        panel.add(jrMale);
        panel.add(jrFemale);
        return panel;
    }

    private Component createLoginLabel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE,
                "background:null");
        JButton cmdLogin = new JButton("<html><a href=\"#\">Langsung gass masuk !</a></html>");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE,
                "border:3,3,3,3");
        cmdLogin.setContentAreaFilled(false);
        cmdLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdLogin.addActionListener(e -> FormsManager.getInstance().showForm(new SignIn()));
        JLabel label = new JLabel("Sudah punya akun ?");
        label.putClientProperty(FlatClientProperties.STYLE, "[light]foreground:lighten(@foreground,30%);" +
                "[dark]foreground:darken(@foreground,30%)");
        panel.add(label);
        panel.add(cmdLogin);
        return panel;
    }

    private void registerUser() {
        Connection connection = DatabaseConnection.getConnection();

        if (connection != null) {
            try {
                String checkQuery = "SELECT COUNT(*) FROM users WHERE username = ? OR email = ?";
                PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
                checkStatement.setString(1, txtUsername.getText());
                checkStatement.setString(2, txtUsername.getText());

                ResultSet resultSet = checkStatement.executeQuery();
                resultSet.next();
                int count = resultSet.getInt(1);

                if (count > 0) {
                    JOptionPane.showMessageDialog(this, "Nama Pengguna / Email Surel sudah terdaftar !");
                } else {
                    String insertQuery = "INSERT INTO users (first_name, last_name, gender, username, password, email) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                    preparedStatement.setString(1, txtFirstName.getText());

                    if (txtLastName.getText().isEmpty()) {
                        preparedStatement.setNull(2, java.sql.Types.VARCHAR);
                    } else {
                        preparedStatement.setString(2, txtLastName.getText());
                    }

                    String selectedGender = jrMale.isSelected() ? "Laki - Laki" : "Perempuan";
                    preparedStatement.setString(3, selectedGender);

                    String input = txtUsername.getText();
                    if (isEmail(input)) {
                        preparedStatement.setString(6, input);
                        preparedStatement.setNull(4, java.sql.Types.VARCHAR);
                    } else {
                        preparedStatement.setString(4, input);
                        preparedStatement.setNull(6, java.sql.Types.VARCHAR);
                    }

                    String hashedPassword = hashPassword(new String(txtPassword.getPassword()));
                    preparedStatement.setString(5, hashedPassword);

                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Berhasil mendaftar! Mantap!");
                        System.out.println("Nama Lengkap: " + txtFirstName.getText() + " " + txtLastName.getText());
                        System.out.println("Jenis Kelamin: " + (jrMale.isSelected() ? "Laki - Laki" : "Perempuan"));
                        System.out.println("Nama Pengguna / Email Surel: " + txtUsername.getText());
                        System.out.println("Password: " + new String(txtPassword.getPassword()));
                        System.out.println("Konfirmasi Password: " + new String(txtConfirmPassword.getPassword()));
                        FormsManager.getInstance().showForm(new SignIn());
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal mendaftar! Aish!");
                    }

                    preparedStatement.close();
                }

                resultSet.close();
                checkStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



    private boolean isEmail(String input) {
        return input.contains("@");
    }


    private String hashPassword(String password) {
        return password;
    }

    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JRadioButton jrMale;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JPasswordField txtConfirmPassword;


}