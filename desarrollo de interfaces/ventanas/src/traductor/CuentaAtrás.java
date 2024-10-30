package traductor;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.Dimension;

public class CuentaAtrás {
    private JFrame frame;
    private Timer crono; 
    private JProgressBar progressBar; // Barra de progreso
    
    int variable = 10; // Cambiar SOLO este valor para el contador
    int i = variable; // NO TOCAR

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                CuentaAtrás window = new CuentaAtrás();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public CuentaAtrás() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        

        JLabel lblNewLabel = new JLabel("CUENTA ATRÁS");
        lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        lblNewLabel.setBounds(42, 0, 382, 82);
        frame.getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("START");
        btnNewButton.setBackground(new Color(0, 255, 0));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBounds(63, 147, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JLabel lblNewLabel_1 = new JLabel("-------");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
        lblNewLabel_1.setBounds(282, 141, 119, 40);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Fin");
        lblNewLabel_2.setVisible(false);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblNewLabel_2.setBounds(187, 203, 71, 35);
        frame.getContentPane().add(lblNewLabel_2);

        // Inicialización de la barra de progreso
        progressBar = new JProgressBar(0, variable);
        progressBar.setSize(new Dimension(10, 0));
        progressBar.setStringPainted(true);
        progressBar.setBounds(63, 180, 338, 30);
        frame.getContentPane().add(progressBar);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 434, 261);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        frame.setVisible(false);
        
        JLabel lblNewLabel_3 = new JLabel("Has hecho Login");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel_3.setBounds(109, 69, 240, 36);
        panel.add(lblNewLabel_3);
        lblNewLabel_3.setVisible(false);
        

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i = variable;
                lblNewLabel_1.setText(String.valueOf(i));
                lblNewLabel_2.setVisible(false);
                lblNewLabel.setVisible(true);
                
                progressBar.setValue(0); // Reiniciar la barra de progreso
                crono.start();
            }
        });

        crono = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i--;
                lblNewLabel_1.setText(String.valueOf(i));
                progressBar.setValue(variable - i); // Actualizar la barra de progreso

                if (i <= 0) {
                    crono.stop();
                    
                    progressBar.setVisible(false); //ocultar barra cuando cargue
                    lblNewLabel_1.setVisible(false);
                    lblNewLabel_2.setVisible(false); //mostrar texto fin 
                    lblNewLabel.setVisible(false);
                    btnNewButton.setVisible(false);
                    lblNewLabel_3.setVisible(true);
                    
                }
            }   
        });
        
    }
}

