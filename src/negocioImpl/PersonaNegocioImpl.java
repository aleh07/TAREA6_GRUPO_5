package negocioImpl;

import java.util.List;
import javax.swing.JList;

import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl  implements PersonaNegocio{

	PersonaDao pdao = new PersonaDaoImpl();
	
	@Override
	public boolean insert(Persona persona) {
		
		boolean estado=false;
		if(persona.getNombre().trim().length()>0 && persona.getApellido().trim().length()>0)
		{
			estado=pdao.insert(persona);
		}
		return estado;
	}

	@Override
	public boolean delete(Persona persona_a_eliminar) {
		boolean estado=false;
		
		if(persona_a_eliminar.getDni()!=null )//También se puede preguntar si existe ese ID 
		{
			estado=pdao.delete(persona_a_eliminar);
		}
		return estado;
	}

	@Override
	public List<Persona> readAll() {
		return pdao.readAll();
	}

	@Override
	public int modificar(Persona personaAnterior, Persona personaNueva) {
				// >0: correcto
				// -1: primary key existente
				// -2: otro error
				int estado = -2;
				if(personaNueva.getDni().trim().length()>0 && personaNueva.getNombre().trim().length()>0 && personaNueva.getApellido().trim().length()>0) {
					estado = pdao.modificar(personaAnterior, personaNueva);
				}
				return estado;
	}

}