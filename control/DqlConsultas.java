/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author WUERO
 */
public class DqlConsultas
{
	String connector="com.mysql.jdbc.Driver",url="jdbc:mysql://127.0.0.1:3306/aseguradora",usuario="rootdos",password="12345_6789";
	Connection conexion;
	Statement statement;
	ResultSet resultSet;
	ArrayList<String> consultas = new ArrayList<String>();
	public ArrayList consultarTodosClientes()
	{
		try
		{
			Class.forName(connector);
			System.out.print("\n Driver cargado...");
			conexion = DriverManager.getConnection(url,usuario,password);
			System.out.print("\n Conexión a base realizada");
			statement = conexion.createStatement();
			resultSet = statement.executeQuery("SELECT idClientes,nombre FROM clientes;");
			resultSet = statement.getResultSet();
			System.out.println("\n Consulta exitosa: ");
			while (resultSet.next())
			{
				String msj = "\t";
				//Imprime de las columnas de la base de datos con el getInt
				msj += "Id: " + resultSet.getInt("idClientes") + "\t";
				msj += "Nombre: " + resultSet.getString("nombre");
				System.out.println(msj);
				consultas.add(msj);
			}
			resultSet.close();
			statement.close();
			conexion.close();
		}
		catch(NullPointerException npe) {System.out.println(npe);}
		catch(ClassNotFoundException cnfe) {cnfe.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
		return consultas;
	}
	public ArrayList consultarTodasFacturas()
	{
		try
		{
			Class.forName(connector);
			System.out.print("\n Driver cargado...");
			conexion = DriverManager.getConnection(url,usuario,password);
			System.out.print("\n Conexión a base realizada");
			statement = conexion.createStatement();
			resultSet = statement.executeQuery("SELECT idFacturas,monto FROM facturas;");
			resultSet = statement.getResultSet();
			System.out.println("\n Consulta exitosa: ");
			while (resultSet.next())
			{
				String msj = "\t";
				//Imprime de las columnas de la base de datos con el getInt
				msj += "Id: " + resultSet.getInt("idFacturas") + "\t";
				msj += "Monto: " + resultSet.getString("monto");
				System.out.println(msj);
				consultas.add(msj);
			}
			resultSet.close();
			statement.close();
			conexion.close();
		}
		catch(NullPointerException npe) {System.out.println(npe);}
		catch(ClassNotFoundException cnfe) {cnfe.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
		return consultas;
	}
	public ArrayList consultarTodosNombresClientesPlacasModeloCostoVehiculo()
	{
		try
		{
			Class.forName(connector);
			System.out.print("\n Driver cargado...");
			conexion = DriverManager.getConnection(url,usuario,password);
			System.out.print("\n Conexión a base realizada");
			statement = conexion.createStatement();
			resultSet = statement.executeQuery("SELECT `clientes`.`nombre`, "
			+ "`polizas`.`costo`, "
			+ "`vehiculos`.`placas`, "
			+ "`vehiculos`.`modelo` "
			+ "FROM `clientes` , `polizas` , `vehiculos`;");
			resultSet = statement.getResultSet();
			System.out.println("\n Consulta exitosa: ");
			while (resultSet.next())
			{
				String msj = "\t";
				//Imprime de las columnas de la base de datos con el getInt
				msj += "Nombre cliente: " + resultSet.getString("nombre") + "\t";
				msj += "Placas: " + resultSet.getString("placas");
				msj += "Modelo: " + resultSet.getString("modelo");
				msj += "Costo vehiculo: " + resultSet.getString("costo");
				System.out.println(msj);
				consultas.add(msj);
			}
			resultSet.close();
			statement.close();
			conexion.close();
		}
		catch(NullPointerException npe) {System.out.println(npe);}
		catch(ClassNotFoundException cnfe) {cnfe.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
		return consultas;
	}
}