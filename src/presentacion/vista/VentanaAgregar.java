package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaAgregar extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;

	/**
	 * Create the panel.
	 */
	public VentanaAgregar() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(93, 97, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(93, 136, 46, 14);
		add(lblApellido);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(93, 175, 46, 14);
		add(lblDNI);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(210, 94, 113, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(210, 133, 113, 20);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(210, 172, 113, 20);
		add(txtDNI);
		txtDNI.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(93, 219, 89, 23);
		add(btnAceptar);

	}
}
