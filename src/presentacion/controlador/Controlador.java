package presentacion.controlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import negocio.PersonaNegocio;
import presentacion.vista.VentanaPrincipal;
import presentacion.vista.VentanaAgregar;
import presentacion.vista.VentanaEliminar;
import presentacion.vista.VentanaListar;
import presentacion.vista.VentanaModificar;
import entidad.Persona;


public class Controlador implements ActionListener{


	
	private PersonaNegocio pNeg;
	private ArrayList<Persona> personasEnTabla;
	private VentanaPrincipal ventanaPrincipal;
	private VentanaAgregar ventanaAgregar;
	private VentanaEliminar ventanaEliminar;
	private VentanaListar ventanaListar;
	private VentanaModificar ventanaModificar;
	
	public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg)
	{
		//Guardo todas las instancias que recibo en el constructor
		this.ventanaPrincipal = vista;
		this.pNeg = pNeg;
		
		//Instancio los paneles
		this.ventanaAgregar = new VentanaAgregar();
		this.ventanaEliminar = new VentanaEliminar();
		this.ventanaListar = new VentanaListar();
		this.ventanaModificar = new VentanaModificar();
		
		//Enlazo todos los eventos
		
		//Eventos menu del Frame principal llamado Ventana
		this.ventanaPrincipal.getAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
		this.ventanaPrincipal.getEliminar().addActionListener(a->EventoClickMenu_AbrirPanel_EliminarPersona(a));
		this.ventanaPrincipal.getListar().addActionListener(a->EventoClickMenu_AbrirPanel_ListarPersona(a));
		this.ventanaPrincipal.getModificar().addActionListener(a->EventoClickMenu_AbrirPanel_ModificarPersona(a));
	
		//Eventos PanelVentanaAgregar
				
			
			this.ventanaAgregar.getBtnAgregar().addActionListener(a->EventoClickBoton_AgregarPesona_PanelAgregarPersonas(a));
			
		
		
	}
	

	public void inicializar()
	{
		this.ventanaPrincipal.setVisible(true);;
	}
	
	
	
	public void  EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a)
	{		
		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(ventanaAgregar);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}

	public void  EventoClickMenu_AbrirPanel_EliminarPersona(ActionEvent a)
	{		
		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(ventanaEliminar);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	
	public void  EventoClickMenu_AbrirPanel_ListarPersona(ActionEvent a)
	{		
		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(ventanaListar);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	
	public void  EventoClickMenu_AbrirPanel_ModificarPersona(ActionEvent a)
	{		
		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(ventanaModificar);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
		
private void EventoClickBoton_AgregarPesona_PanelAgregarPersonas(ActionEvent a) {
		
		String nombre = this.ventanaAgregar.getTxtNombre().getText();
		String apellido = this.ventanaAgregar.getTxtApellido().getText();
		String dni = this.ventanaAgregar.getTxtDNI().getText();
		Persona nuevaPersona = new Persona(dni, nombre, apellido);
		
		boolean estado = pNeg.insert(nuevaPersona);
		String mensaje;
		if(estado==true)
		{
			mensaje="Persona agregada con exito";
			this.ventanaAgregar.getTxtNombre().setText("");
			this.ventanaAgregar.getTxtApellido().setText("");
			this.ventanaAgregar.getTxtDNI().setText("");
		}
		else
			mensaje="Persona no agregada, complete todos los campos";
		
		this.ventanaAgregar.mostrarMensaje(mensaje);
	
	}
	
	
	
}
