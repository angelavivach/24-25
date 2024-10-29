package traductor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ejemplo2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejemplo2 window = new ejemplo2();
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
	public ejemplo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 160));
		panel.setBackground(new Color(0, 0, 255));
		frame.getContentPane().add(panel, "name_14308899256700");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(211, 91, 13, 29);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblNewLabel);
		
		JButton btnAzul_0 = new JButton("Siguiente");
		btnAzul_0.setBounds(169, 158, 89, 23);
		panel.add(btnAzul_0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setBackground(new Color(255, 0, 128));
		panel_1.setBackground(new Color(255, 0, 128));
		frame.getContentPane().add(panel_1, "name_14408301604300");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setBounds(211, 91, 13, 29);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_1);
		
		JButton btnRosa_1 = new JButton("Siguiente");
		btnRosa_1.setBounds(169, 158, 89, 23);
		panel_1.add(btnRosa_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(new Color(128, 255, 0));
		frame.getContentPane().add(panel_2, "name_14419189763000");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(211, 91, 13, 29);
		panel_2.add(lblNewLabel_2);
		
		JButton btnVerde_2 = new JButton("Siguiente");
		btnVerde_2.setBounds(169, 158, 89, 23);
		panel_2.add(btnVerde_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setVisible(false);
		panel_3.setBackground(new Color(255, 128, 0));
		frame.getContentPane().add(panel_3, "name_14472424825400");
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("3");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(211, 91, 13, 29);
		panel_3.add(lblNewLabel_3);
		
		JButton btnNaranja_3 = new JButton("Siguiente");
		btnNaranja_3.setBounds(169, 158, 89, 23);
		panel_3.add(btnNaranja_3);
		
		btnAzul_0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btnRosa_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				
			}
		});
		btnVerde_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				
			}
		});
		btnNaranja_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel.setVisible(true);
				
			}
		});
	}

}
