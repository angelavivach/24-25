package envioemails;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class fichEmail {

    private JFrame frame;
    private JTextField emailField;
    private JTextField subjectField;
    private final String filePath = "fichPrueba.txt";

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                fichEmail window = new fichEmail();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public fichEmail() {
        
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);
        
        JLabel emailLabel = new JLabel("Correo");
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        emailLabel.setBounds(74, 27, 63, 24);
        panel.add(emailLabel);
        
        JLabel subjectLabel = new JLabel("Asunto");
        subjectLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        subjectLabel.setBounds(74, 78, 84, 17);
        panel.add(subjectLabel);
        
        emailField = new JTextField();
        emailField.setBounds(157, 29, 232, 24);
        panel.add(emailField);
        
        subjectField = new JTextField();
        subjectField.setBounds(157, 76, 232, 24);
        panel.add(subjectField);
        
        JButton sendButton = new JButton("Enviar");
        sendButton.setBounds(316, 227, 73, 23);
        panel.add(sendButton);
        
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String toEmail = emailField.getText();
                String subject = subjectField.getText();
                
                if (toEmail.isEmpty() || subject.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                String message = readFileContent();
                sendEmail(toEmail, subject, message);
            }
        });
    }

    private String readFileContent() {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error al leer el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return "";
        }
    }

    private void sendEmail(String toEmail, String subject, String message) {
        final String fromEmail = "angelavivandiaz@gmail.com"; // Email de salida
        final String password = "fwyy rdfq onzn gvxb"; // Contraseña de email de salida

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

        Session session = Session.getInstance(props, auth);

        try {
        	MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new javax.mail.internet.InternetAddress(fromEmail));
            msg.setRecipients(Message.RecipientType.TO, javax.mail.internet.InternetAddress.parse(toEmail));
            msg.setSubject(subject);
            msg.setText(message);
            javax.mail.Transport.send(msg);
            JOptionPane.showMessageDialog(frame, "Email enviado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error al enviar el email: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

