package main;

import java.awt.EventQueue;

import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.controlador.Controlador;
import presentacion.vista.VentanaPrincipal;

public class Principal {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal vista = new VentanaPrincipal();
					PersonaNegocio negocio = new PersonaNegocioImpl();
					Controlador controlador = new Controlador(negocio, vista);
					controlador.inicializar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
