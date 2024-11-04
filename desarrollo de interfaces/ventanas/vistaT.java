package divClass;

import javax.swing.JFrame;

import java.awt.*;

import javax.swing.*;

public class vistaT extends JFrame{
	 private JTextField sEspanol;
	    private JTextField sResultado;
	    private JButton btnTraducir;

	    public vistaT() {
	        setTitle("Traductor Español - Inglés");
	        setIconImage(Toolkit.getDefaultToolkit().getImage(vistaT.class.getResource("/traductor/Google_Translate_logo.svg.png")));
	        setBounds(100, 100, 450, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        getContentPane().setLayout(null);

	        JLabel lblTitulo = new JLabel("TRADUCTOR DAM");
	        lblTitulo.setFont(new Font("Arial Unicode MS", Font.BOLD, 13));
	        lblTitulo.setForeground(new Color(128, 0, 255));
	        lblTitulo.setBounds(155, 24, 118, 30);
	        getContentPane().add(lblTitulo);

	        JLabel lblInstruccion = new JLabel("Palabra a traducir");
	        lblInstruccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblInstruccion.setBounds(48, 71, 160, 30);
	        getContentPane().add(lblInstruccion);

	        JLabel lblResultado = new JLabel("Palabra traducida");
	        lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblResultado.setBounds(48, 135, 148, 14);
	        getContentPane().add(lblResultado);

	        sEspanol = new JTextField();
	        sEspanol.setBounds(226, 78, 125, 20);
	        getContentPane().add(sEspanol);
	        sEspanol.setColumns(10);

	        sResultado = new JTextField();
	        sResultado.setEnabled(false);
	        sResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
	        sResultado.setBounds(226, 133, 125, 20);
	        getContentPane().add(sResultado);
	        sResultado.setColumns(10);

	        btnTraducir = new JButton("Traducir");
	        btnTraducir.setFont(new Font("Tahoma", Font.BOLD, 11));
	        btnTraducir.setForeground(Color.WHITE);
	        btnTraducir.setBackground(new Color(128, 128, 255));
	        btnTraducir.setBounds(155, 196, 89, 23);
	        getContentPane().add(btnTraducir);
	    }

	    public JTextField getSEspanol() {
	        return sEspanol;
	    }

	    public JTextField getSResultado() {
	        return sResultado;
	    }

	    public JButton getBtnTraducir() {
	        return btnTraducir;
	    }
	}