package traductor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class ejemplo1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejemplo1 window = new ejemplo1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ejemplo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 5, 5));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAzul = new JButton("Mostrar panel 1");
		btnAzul.setBounds(44, 84, 115, 23);
		panel.add(btnAzul);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(92, 35, 45, 53);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(new Color(255, 0, 128));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnRosa = new JButton("Mostrar panel 2");
		btnRosa.setBounds(51, 78, 113, 23);
		panel_2.add(btnRosa);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(94, 44, 46, 14);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setBackground(new Color(255, 128, 0));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNaranja = new JButton("Mostrar panel 3");
		btnNaranja.setBounds(54, 88, 107, 23);
		panel_1.add(btnNaranja);
		
		JLabel lblNewLabel_2 = new JLabel("2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(96, 51, 46, 24);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setVisible(false);
		panel_3.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnAmarillo = new JButton("Ocultar");
		btnAmarillo.setBounds(60, 88, 107, 23);
		panel_3.add(btnAmarillo);
		
		JLabel lblNewLabel_3 = new JLabel("3");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(104, 48, 46, 28);
		panel_3.add(lblNewLabel_3);
		
		//Dar accion a boton 
		
		btnAzul.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
				
			}
		});
		btnRosa.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);
				
			}
		});
		btnNaranja.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				
			}
		});
		btnAmarillo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				
			}
		});
		
	}
}
