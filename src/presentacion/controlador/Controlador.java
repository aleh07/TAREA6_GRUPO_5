package presentacion.controlador;

import java.awt.event.ActionListener;import java.awt.event.ActionEvent;
import java.util.ArrayList;
import negocio.PersonaNegocio;
import presentacion.vista.VentanaPrincipal;
import entidad.Persona;
public class Controlador  implements ActionListener{


	private VentanaPrincipal ventPrincipal;
	private PersonaNegocio pNeg;
	private ArrayList<Persona> personasEnTabla;
	
	public Controlador (PersonaNegocio pNeg, VentanaPrincipal ventPrincipal) {
		this.ventPrincipal = ventPrincipal;
		this.pNeg = pNeg;
	}
	
	public void inicializar()
	{
		this.ventPrincipal.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	

}
