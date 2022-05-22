package main;

import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.controlador.Controlador;
import presentacion.vista.VentanaPrincipal;

public class Principal {
	VentanaPrincipal vista = new VentanaPrincipal();
	PersonaNegocio negocio = new PersonaNegocioImpl();
	//Controlador controlador = new Controlador(vista, negocio);
	//controlador.;
}
