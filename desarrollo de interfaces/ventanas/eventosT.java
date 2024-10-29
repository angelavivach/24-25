package divClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class eventosT {
	private final vistaT vista;
    private final Traduccion accion;

    public eventosT(vistaT vista, Traduccion accion) {
        this.vista = vista;
        this.accion = accion;

        vista.getBtnTraducir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traducirPalabra();
            }
        });
    }

    private void traducirPalabra() {
        String palabraESP = vista.getSEspanol().getText();
        
        if (!palabraESP.isBlank()) {
            String palabraTraducida = accion.traducir(palabraESP);
            vista.getSResultado().setText(palabraTraducida);
        } else {
            JOptionPane.showMessageDialog(vista, "No hay palabra a traducir", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}