package dao;

import java.util.List;

import entidad.Persona;

public interface PersonaDao {
	public boolean insert(Persona persona);
	public boolean delete(Persona persona_a_eliminar);
	public int modificar(Persona personaAnterior, Persona personaNueva);
	public List<Persona> readAll();

}
