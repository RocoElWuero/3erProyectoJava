/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author WUERO
 */
public class DmlUpdate
{
	
	String connector="com.mysql.jdbc.Driver",url="jdbc:mysql://127.0.0.1:3306/aseguradora",usuario="rootdos",password="12345_6789";
	Connection conexion;
	Statement statement;
	PreparedStatement preparedStatement;
	public void actualizarTodosClientes(String direccion, String nombre)
	{
		try
		{
			Class.forName(connector);
			System.out.print("\n Driver cargado...");
			conexion = DriverManager.getConnection(url,usuario,password);
			System.out.print("\n Conexión a base realizada");
			statement = conexion.createStatement();
			preparedStatement = conexion.prepareStatement("UPDATE `clientes` "
			+ "SET `direccion` = ' "+direccion+"' "
			+ "WHERE `clientes`.`nombre` = "+nombre+";");
			preparedStatement.executeUpdate();
			int renglones_afectados = preparedStatement.executeUpdate();
			System.out.print("\n Update exitoso...");
			System.out.print("\n Número de renglones actualizados: " + renglones_afectados);
		}
		catch(NullPointerException npe) {System.out.println(npe);}
		catch(ClassNotFoundException cnfe) {cnfe.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
	}
}