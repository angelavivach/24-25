package traductor;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import java.awt.Toolkit;

public class VentanaTraductor {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	public static void main(String[] args)  {
		
		//paletas o cambios de colores que tenemos instalados 
		UIManager.LookAndFeelInfo[] looks=UIManager.getInstalledLookAndFeels();
		
		for (int i=0;i<looks.length;i++) {
			System.out.println("Looks instalados " +looks[i].getClassName());
		}
		
	    //aplicar paleta
			try {
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		EventQueue.invokeLater(new Runnable() { //hace que sea ejecutable y lea eventos
			public void run() { //hace que arranque el hilo y vaya a la cola
				try {
					VentanaTraductor window = new VentanaTraductor(); //hace una instancia de si mismo
					window.frame.setVisible(true); //ultimo paso de lanzar ventana, si esta en false no se ve la ventana
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaTraductor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaTraductor.class.getResource("/traductor/images.png")));
		frame.getContentPane().setBackground(new Color(128, 128, 255));
		//empieza a dar valores 
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(300, 300, 650, 500); //donde y como se presenta la pantalla
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);//al ser null nos centra la ventana
		frame.getContentPane().setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(173, 154, 225, 38);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(173, 240, 225, 38);
		frame.getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(79, 147, 122, 52);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(99, 376, 145, 38);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Siguiente");
		
		//que el boton escuche eventos 
	    /*btnNewButton_1=new JButton(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//acion 
	    		frmRegistroDeDatos.getContentPane().setVisible(false);
	    	}
	    });*/
		
		btnNewButton_1.setBounds(281, 376, 145, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(79, 240, 90, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(294, 316, 30, 20);
		frame.getContentPane().add(spinner);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Segundo nombre");
		chckbxNewCheckBox.setBounds(425, 162, 136, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("Edad:");
		lblNewLabel_2.setBounds(198, 319, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
