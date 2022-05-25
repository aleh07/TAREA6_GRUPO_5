package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class VentanaPrincipal extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu mnPersonas;
	private JMenuItem Agregar;
	private JMenuItem Modificar;
	private JMenuItem Eliminar;
	private JMenuItem Listar;
	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		 menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPersonas = new JMenu("Personas");
		menuBar.add(mnPersonas);
		
		Agregar = new JMenuItem("Agregar");
		mnPersonas.add(Agregar);
		
		 Modificar = new JMenuItem("Modificar");
		mnPersonas.add(Modificar);
		
		 Eliminar = new JMenuItem("Eliminar");
		mnPersonas.add(Eliminar);
		
	   Listar = new JMenuItem("Listar");
		mnPersonas.add(Listar);
	}
		
	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenu getMnPersonas() {
		return mnPersonas;
	}

	public void setMnPersonas(JMenu mnPersonas) {
		this.mnPersonas = mnPersonas;
	}

	public JMenuItem getAgregar() {
		return Agregar;
	}

	public void setAgregar(JMenuItem agregar) {
		this.Agregar = agregar;
	}

	public JMenuItem getModificar() {
		return Modificar;
	}

	public void setModificar(JMenuItem modificar) {
		this.Modificar = modificar;
	}

	public JMenuItem getEliminar() {
		return Eliminar;
	}

	public void setEliminar(JMenuItem eliminar) {
		this.Eliminar = eliminar;
	}

	public JMenuItem getListar() {
		return Listar;
	}

	public void setListar(JMenuItem listar) {
		this.Listar = listar;
	}


}
