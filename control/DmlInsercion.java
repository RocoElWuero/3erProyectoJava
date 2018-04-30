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

import java.sql.ResultSet;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


/**
 *
 * @author WUERO
 */
public class DmlInsercion
{
	String connector="com.mysql.jdbc.Driver",url="jdbc:mysql://127.0.0.1:3306/aseguradora",usuario="rootdos",password="12345_6789";
	String nombres,direcciones,costosTotales,placas,marca,modelo;
	Connection conexion;
	Statement statement;
	PreparedStatement preparedStatement;
	public void insercionClientes()
	{
		try
		{
			Class.forName(connector);
			System.out.print("\n Driver cargado...");
			conexion = DriverManager.getConnection(url,usuario,password);
			System.out.print("\n Conexión a base realizada");
			statement = conexion.createStatement();
			try
			{
				File archivo = new File("C:\\Users\\WUERO\\Desktop\\PROTECO\\Java\\3erProyecto\\Clientes.xml");
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
				Document document = documentBuilder.parse(archivo);
				System.out.print("\n Elemento raiz: "+document.getDocumentElement().getNodeName());
				NodeList listas = document.getElementsByTagName("cliente");
				for(int i=0; i<listas.getLength(); i++)
				{
					Node nodo = listas.item(i);
					System.out.print("\n Elemento: "+nodo.getNodeName());
					if(nodo.getNodeType() == Node.ELEMENT_NODE)
					{
						Element element = (Element) nodo;
						System.out.print("\n Nombre: "+element.getElementsByTagName("nombre").item(0).getTextContent());
						System.out.print("\n Direccion: "+element.getElementsByTagName("direccion").item(0).getTextContent());
						nombres = element.getElementsByTagName("nombre").item(0).getTextContent();
						direcciones = element.getElementsByTagName("direccion").item(0).getTextContent();
						preparedStatement = conexion.prepareStatement("INSERT INTO clientes(nombre,direccion) "
						+ "VALUES(' "+nombres+" ',' "+direcciones+" ');");
						preparedStatement.execute();
						System.out.print("\n Update "+(i+1)+" exitoso...");
					}
				}
			}
			catch(NullPointerException npe) {System.out.println(npe);}
			catch(Exception e) {e.printStackTrace();}
			conexion.close();
		}
		catch(NullPointerException npe) {System.out.println(npe);}
		catch(ClassNotFoundException cnfe) {cnfe.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
	}
	public void insercionFacturas()
	{
		try
		{
			Class.forName(connector);
			System.out.print("\n Driver cargado...");
			conexion = DriverManager.getConnection(url,usuario,password);
			System.out.print("\n Conexión a base realizada");
			statement = conexion.createStatement();
			try
			{
				File archivo = new File("C:\\Users\\WUERO\\Desktop\\PROTECO\\Java\\3erProyecto\\Facturas.xml");
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
				Document document = documentBuilder.parse(archivo);
				System.out.print("\n Elemento raiz: "+document.getDocumentElement().getNodeName());
				NodeList listas = document.getElementsByTagName("factura");
				for(int i=0; i<listas.getLength(); i++)
				{
					Node nodo = listas.item(i);
					System.out.print("\n Elemento: "+nodo.getNodeName());
					if(nodo.getNodeType() == Node.ELEMENT_NODE)
					{
						Element element = (Element) nodo;
						System.out.print("\n Costo total: "+element.getElementsByTagName("costo_total").item(0).getTextContent());
						costosTotales = element.getElementsByTagName("costo_total").item(0).getTextContent();
						preparedStatement = conexion.prepareStatement("INSERT INTO facturas(monto) "
						+ "VALUES(' "+costosTotales+" ');");
						preparedStatement.execute();
						System.out.print("\n Update "+(i+1)+" exitoso...");
					}
				}
			}
			catch(NullPointerException npe) {System.out.println(npe);}
			catch(Exception e) {e.printStackTrace();}
			conexion.close();
		}
		catch(NullPointerException npe) {System.out.println(npe);}
		catch(ClassNotFoundException cnfe) {cnfe.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
	}
	public void insercionVehiculos()
	{
		try
		{
			Class.forName(connector);
			System.out.print("\n Driver cargado...");
			conexion = DriverManager.getConnection(url,usuario,password);
			System.out.print("\n Conexión a base realizada");
			statement = conexion.createStatement();
			try
			{
				File archivo = new File("C:\\Users\\WUERO\\Desktop\\PROTECO\\Java\\3erProyecto\\Vehiculos.xml");
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
				Document document = documentBuilder.parse(archivo);
				System.out.print("\n Elemento raiz: "+document.getDocumentElement().getNodeName());
				NodeList listas = document.getElementsByTagName("vehiculo");
				for(int i=0; i<listas.getLength(); i++)
				{
					Node nodo = listas.item(i);
					System.out.print("\n Elemento: "+nodo.getNodeName());
					if(nodo.getNodeType() == Node.ELEMENT_NODE)
					{
						Element element = (Element) nodo;
						System.out.print("\n Placas: "+element.getElementsByTagName("placas").item(0).getTextContent());
						placas = element.getElementsByTagName("placas").item(0).getTextContent();

						System.out.print("\n Marca: "+element.getElementsByTagName("marca").item(0).getTextContent());
						marca = element.getElementsByTagName("marca").item(0).getTextContent();

						System.out.print("\n Modelo: "+element.getElementsByTagName("modelo").item(0).getTextContent());
						modelo = element.getElementsByTagName("modelo").item(0).getTextContent();

						preparedStatement = conexion.prepareStatement("INSERT INTO vehiculos(marca,placas,modelo) "
						+ "VALUES(' "+marca+" ',' "+placas+" ',' "+modelo+" ');");
						preparedStatement.execute();
						System.out.print("\n Update "+(i+1)+" exitoso...");
					}
				}
			}
			catch(NullPointerException npe) {System.out.println(npe);}
			catch(Exception e) {e.printStackTrace();}
			conexion.close();
		}
		catch(NullPointerException npe) {System.out.println(npe);}
		catch(ClassNotFoundException cnfe) {cnfe.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
	}
	public void insercionPolizas()
	{
		int dia = (int)Math.floor(Math.random()*(30-1+1)+1);
		int mes = (int)Math.floor(Math.random()*(12-1+1)+1);
		int ano = (int)Math.floor(Math.random()*(2018-1985+1)+1985);
		int dia2 = (int)Math.floor(Math.random()*(30-1+1)+1);
		int mes2 = (int)Math.floor(Math.random()*(12-1+1)+1);
		int ano2 = (int)Math.floor(Math.random()*(2018-1985+1)+1985);
		try
		{
			Class.forName(connector);
			System.out.print("\n Driver cargado...");
			conexion = DriverManager.getConnection(url,usuario,password);
			System.out.print("\n Conexión a base realizada");
			statement = conexion.createStatement();
			try
			{
				File archivo = new File("C:\\Users\\WUERO\\Desktop\\PROTECO\\Java\\3erProyecto\\Vehiculos.xml");
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
				Document document = documentBuilder.parse(archivo);
				NodeList listas = document.getElementsByTagName("vehiculo");
				for(int i=0; i<listas.getLength(); i++)
				{
					double montoPoliza=0,primaPoliza=0;
					ResultSet resultSet = statement.executeQuery("SELECT monto FROM facturas WHERE idFacturas="+i+";");
					resultSet = statement.getResultSet();
					System.out.println("\n Consulta exitosa: ");
					while (resultSet.next())
					{
						montoPoliza = ((double) (resultSet.getInt("monto"))*((6.67/12)/100));
						primaPoliza = resultSet.getInt("monto")*0.85;
					}
					Node nodo = listas.item(i);
					if(nodo.getNodeType() == Node.ELEMENT_NODE)
					{
						preparedStatement = conexion.prepareStatement("INSERT INTO polizas(costo,valorPrima,fechaApertura,fechaVencimiento) "
						+ "VALUES(' "+montoPoliza+" ',' "+primaPoliza+" ',' "+ano+"-"+mes+"-"+dia+" ',' "+ano2+"-"+mes2+"-"+dia2+" ');");
						preparedStatement.execute();
						System.out.print("\n Update "+(i+1)+" exitoso...");
					}
				}
			}
			catch(NullPointerException npe) {System.out.println(npe);}
			catch(Exception e) {e.printStackTrace();}
			conexion.close();
		}
		catch(NullPointerException npe) {System.out.println(npe);}
		catch(ClassNotFoundException cnfe) {cnfe.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
	}
}