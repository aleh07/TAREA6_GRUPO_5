package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;


import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Button;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;

import entidad.Persona;

public class VentanaModificar extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	private Button btnModificar;
	private String DniSeleccionado;
	private JList<Persona> list;
	
	private DefaultListModel<Persona> modelPersonas;
	private JScrollPane scrollPane;

	/**
	 * Create the panel.
	 */
	public VentanaModificar() {
		setLayout(null);
		
modelPersonas = new DefaultListModel<Persona>();
		
		list =new JList<Persona>(modelPersonas);
		//list.setVisible(false);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				// Si se selecciono un item del JList
				if(list.getSelectedIndex() != -1) {
					Persona persona = (Persona) modelPersonas.getElementAt(list.getSelectedIndex());
					DniSeleccionado = persona.getDni();
					setTxtApellido(persona.getApellido());
					setTxtNombre(persona.getNombre());
					setTxtDni(persona.getDni());
				}
			}
		});
				
		list.setBounds(25, 61, 403, 188);
		add(list);
		
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
		
		btnModificar = new Button("Modificar");
		btnModificar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnModificar.setBounds(358, 255, 70, 22);
		add(btnModificar);
		
		JLabel lblSeleccioneLaPersona = new JLabel("Seleccione la persona que desesa modificar");
		lblSeleccioneLaPersona.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSeleccioneLaPersona.setBounds(26, 41, 306, 14);
		add(lblSeleccioneLaPersona);

	}
	
	//SETS 
	// GETS
		public JTextField getTxtDni() {
			return txtDNI;
		}
		
		 public JTextField getTxtNombre() {
			 return txtNombre;	
		}
		 
		 public JTextField getTxtApellido() {
			return txtApellido;
		}
		 
		// boton
		public Button getBtnModificar() {
			return btnModificar;
		}
		
		// list
		public String getDniSeleccionado() {
			
			return DniSeleccionado;
		}
		
		public DefaultListModel<Persona> getDefaultListModel(){
			return modelPersonas;
		}
		
		// SETS
		public void setTxtDni(String txtDni) {
			this.txtDNI.setText(txtDni);
		}
		
		 public void setTxtNombre(String txtNombre) {
			 this.txtNombre.setText(txtNombre);	
		}
		 
		 public void setTxtApellido(String txtApellido) {
			this.txtApellido.setText(txtApellido);
		}
		 
		 public DefaultListModel<Persona> getModelPersonas() 
		{
			return modelPersonas;
		}
		 
		public void llenarTabla(List<Persona> personasEnTabla) {
			this.modelPersonas.clear();
			for (int i=0; i < personasEnTabla.size(); i++)
			{
				this.getModelPersonas().add(i, personasEnTabla.get(i));
			}
		}
			
		public void mostrarMensaje(String mensaje)
			{
				JOptionPane.showMessageDialog(null, mensaje);
			}
	}	


