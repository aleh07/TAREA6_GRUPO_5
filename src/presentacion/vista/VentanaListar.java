package presentacion.vista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.omg.CORBA.PUBLIC_MEMBER;

import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;

import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class VentanaListar extends JPanel {
	
	private DefaultTableModel modelPersonas;
	private String[] nombreColumnas = {"Nombre", "Apellido", "Dni"};
	private JTable tablaPersona;
	
	public VentanaListar() {
		super();
		initialize();
	}
	
	
	
	public DefaultTableModel getModelPersonas() {
		return modelPersonas;
	}



	public String[] getNombreColumnas() {
		return nombreColumnas;
	}



	public JTable getTablaPersona() {
		return tablaPersona;
	}


	private void initialize() {
		setLayout(null);
		this.setBounds(100, 100, 630, 380);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 31, 512, 264);
		add(scrollPane);
		
		modelPersonas = new DefaultTableModel(null,nombreColumnas);
		tablaPersona = new JTable(modelPersonas);
		tablaPersona.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		tablaPersona.getColumnModel().getColumn(0).setPreferredWidth(100);
		tablaPersona.getColumnModel().getColumn(0).setResizable(false);
		tablaPersona.getColumnModel().getColumn(1).setPreferredWidth(100);
		tablaPersona.getColumnModel().getColumn(1).setResizable(false);
		tablaPersona.getColumnModel().getColumn(2).setPreferredWidth(100);
		tablaPersona.getColumnModel().getColumn(2).setResizable(false);
		tablaPersona.setEnabled(false);
		scrollPane.setViewportView(tablaPersona);
	}
	
	
	public void llenarTabla(List<Persona> personasEnTabla) {
		this.getModelPersonas().setRowCount(0); //Para vaciar la tabla
		this.getModelPersonas().setColumnCount(0);
		this.getModelPersonas().setColumnIdentifiers(this.getNombreColumnas());
		for (Persona p  : personasEnTabla)
		{
			String nombre = p.getNombre();
			String apellido = p.getApellido();
			String dni = p.getDni();
			Object[] fila = {nombre, apellido, dni};
			this.getModelPersonas().addRow(fila);
		}
	
		
		}
	
	
	
	
	
	
}
