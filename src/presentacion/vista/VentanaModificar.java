package presentacion.vista;

import javax.swing.JPanel;
import java.awt.List;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaModificar extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;

	/**
	 * Create the panel.
	 */
	public VentanaModificar() {
		setLayout(null);
		
		List listModificar = new List();
		listModificar.setBounds(25, 61, 403, 188);
		add(listModificar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(25, 255, 99, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(134, 255, 110, 20);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(253, 255, 99, 20);
		add(txtDNI);
		txtDNI.setColumns(10);
		
		Button btnModificar = new Button("Modificar");
		btnModificar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnModificar.setBounds(358, 255, 70, 22);
		add(btnModificar);
		
		JLabel lblSeleccioneLaPersona = new JLabel("Seleccione la persona que desesa modificar");
		lblSeleccioneLaPersona.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSeleccioneLaPersona.setBounds(26, 41, 306, 14);
		add(lblSeleccioneLaPersona);

	}

}
