package divClases;

import java.awt.EventQueue;

public class MainT {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
            try {
                VistaT view = new VistaT();
                Traduccion accion = new Traduccion();
                new EventosT(view, accion);
                view.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

	}

}
