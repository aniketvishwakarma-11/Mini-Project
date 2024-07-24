import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

        // Create a panel for the logo and text
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.WHITE);
        logoPanel.setLayout(new BorderLayout());

        // Load the logo image
        ImageIcon logoIcon = new ImageIcon("logo.png");
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        // Text below the logo
        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.WHITE);
        textPanel.setLayout(new BorderLayout(0, 10)); // Adjust vertical gap

        JLabel collegeNameLabel = new JLabel("Vasantdada Patil Pratishthan's College of Engineering & Visual Arts", JLabel.CENTER);
        collegeNameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        collegeNameLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); // Add space above the text

        JLabel mottoLabel = new JLabel("Empowering with Knowledge", JLabel.CENTER);
        mottoLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        mottoLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0)); // Add space below the text

        textPanel.add(mottoLabel, BorderLayout.NORTH);
        textPanel.add(collegeNameLabel, BorderLayout.SOUTH);

        // Add logo and text panel to the logo panel
        logoPanel.add(logoLabel, BorderLayout.CENTER);
        logoPanel.add(textPanel, BorderLayout.SOUTH);

        // Create a panel for the login form
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridBagLayout());
        loginPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Email label and text field
        JLabel emailLabel = new JLabel("Email");
        JTextField emailField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(emailLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        loginPanel.add(emailField, gbc);

        // Password label and text field
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 0;
        gbc.gridy = 1;
        loginPanel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        loginPanel.add(passwordField, gbc);

        // Sign in button
        JButton signInButton = new JButton("Sign In");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginPanel.add(signInButton, gbc);

        // Forgot password link
        JButton forgotPasswordButton = new JButton("Forgot password?");
        forgotPasswordButton.setBorderPainted(false);
        forgotPasswordButton.setOpaque(false);
        forgotPasswordButton.setBackground(Color.WHITE);
        forgotPasswordButton.setForeground(Color.BLUE.darker());
        forgotPasswordButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gbc.gridy = 3;
        loginPanel.add(forgotPasswordButton, gbc);

        // Teacher and Admin login links
        JButton teacherLoginButton = new JButton("Teacher Login");
        JButton adminLoginButton = new JButton("Admin Login");
        teacherLoginButton.setBorderPainted(false);
        teacherLoginButton.setOpaque(false);
        teacherLoginButton.setBackground(Color.WHITE);
        teacherLoginButton.setForeground(Color.BLUE.darker());
        teacherLoginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        adminLoginButton.setBorderPainted(false);
        adminLoginButton.setOpaque(false);
        adminLoginButton.setBackground(Color.WHITE);
        adminLoginButton.setForeground(Color.BLUE.darker());
        adminLoginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        gbc.gridy = 4;
        loginPanel.add(teacherLoginButton, gbc);
        gbc.gridy = 5;
        loginPanel.add(adminLoginButton, gbc);

        // Add action listeners for buttons
        signInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                // Handle sign in action here
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            }
        });

        // Split the frame into two columns
        frame.setLayout(new GridLayout(1, 2));
        frame.add(logoPanel);
        frame.add(loginPanel);

        frame.setVisible(true);
    }
}
