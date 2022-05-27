package negocio;

import java.util.List;

import entidad.Persona;

public interface PersonaNegocio {

	public boolean insert(Persona persona);
	public boolean delete(Persona persona_a_eliminar);
	public int modificar(Persona personaAnterior, Persona personaNueva);
	public List<Persona> readAll();

}
