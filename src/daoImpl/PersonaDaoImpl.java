package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import dao.PersonaDao;
import entidad.Persona;

public class PersonaDaoImpl implements PersonaDao {
	private static final String insert = "INSERT INTO personas(dni, nombre,apellido) VALUES(?, ?, ?)";
	private static final String delete = "DELETE FROM personas WHERE dni = ?";
	private static final String modificarPersona = "UPDATE personas SET Dni = ?, Nombre = ? , Apellido = ? WHERE Dni = ? ";
	private static final String readall = "SELECT * FROM personas";
		
	public boolean insert(Persona persona)
	{
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean isInsertExitoso = false;
		try
		{
			statement = conexion.prepareStatement(insert);
			statement.setString(1, persona.getDni());
			statement.setString(2, persona.getNombre());
			statement.setString(3, persona.getApellido());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				isInsertExitoso = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return isInsertExitoso;
	}
	
	public boolean delete(Persona persona_a_eliminar)
	{
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean isdeleteExitoso = false;
		try 
		{
			statement = conexion.prepareStatement(delete);
			statement.setString(1,persona_a_eliminar.getDni());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				isdeleteExitoso = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return isdeleteExitoso;
	}
	
	public List<Persona> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; //Guarda el resultado de la query
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(readall);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				personas.add(getPersona(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return personas;
	}
	
	private Persona getPersona(ResultSet resultSet) throws SQLException
	{
		String dni = resultSet.getString("dni");
		String nombre = resultSet.getString("nombre");
		String apellido= resultSet.getString("apellido");
		return new Persona(dni, nombre, apellido);
	}
	
	public int modificar(Persona personaAnterior, Persona personaNueva)
	{
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		int resultado = -2;
		try 
		{
			//statement = conexion.prepareStatement("UPDATE personas SET Dni="+ personaNueva.getDni() +", Nombre = " + personaNueva.getNombre() + ", Apellido = " + personaNueva.getApellido() + "WHERE Dni = " + personaAnterior.getDni());
			statement = conexion.prepareStatement(modificarPersona);
			statement.setString(1, personaNueva.getDni());
			statement.setString(2, personaNueva.getNombre());
			statement.setString(3, personaNueva.getApellido());
			statement.setString(4, personaAnterior.getDni());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				resultado = 1;
			}
		}
		catch (SQLException e) 
		{
			if(e instanceof SQLIntegrityConstraintViolationException) {
				resultado = -1;
			}
			e.printStackTrace();
		}
		return resultado;
	}
}
