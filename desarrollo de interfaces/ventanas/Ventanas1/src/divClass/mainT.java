package divClass;

import java.awt.EventQueue;

public class mainT {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
            try {
                vistaT view = new vistaT();
                Traduccion accion = new Traduccion();
                new eventosT(view, accion);
                view.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

	}

}
