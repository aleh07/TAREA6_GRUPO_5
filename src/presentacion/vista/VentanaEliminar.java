package presentacion.vista;

import javax.swing.JPanel;
import java.awt.List;
import java.awt.Button;
import java.awt.Label;
import java.awt.Font;

public class VentanaEliminar extends JPanel {

	/**
	 * Create the panel.
	 */
	public VentanaEliminar() {
		setLayout(null);
		
		List listEliminar = new List();
		listEliminar.setBounds(136, 74, 193, 154);
		add(listEliminar);
		
		Button btnEliminar = new Button("Eliminar");
		btnEliminar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnEliminar.setBounds(136, 234, 193, 22);
		add(btnEliminar);
		
		Label lblEliminar = new Label("Eliminar usuarios");
		lblEliminar.setFont(new Font("Dialog", Font.BOLD, 12));
		lblEliminar.setBounds(136, 48, 122, 22);
		add(lblEliminar);

	}
}
