package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JTable;

public class VentanaListar extends JPanel {
	private JTable tableListar;

	/**
	 * Create the panel.
	 */
	public VentanaListar() {
		setLayout(null);
		
		tableListar = new JTable();
		tableListar.setBounds(44, 91, 363, 152);
		add(tableListar);

	}
}
