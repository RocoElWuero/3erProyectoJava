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
public class DdlCreacion
{
	String connector="com.mysql.jdbc.Driver",url="jdbc:mysql://127.0.0.1:3306/aseguradora",usuario="rootdos",password="12345_6789";
	Connection conexion;
	Statement statement;
	PreparedStatement preparedStatement;
	public void crearPolizas()
	{
		try
		{
			Class.forName(connector);
			System.out.print("\n Driver cargado...");
			//conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/aseguradora","rootdos","12345_6789");
			conexion = DriverManager.getConnection(url,usuario,password);
			System.out.print("\n Conexión a base realizada\n");
			statement = conexion.createStatement();
			preparedStatement = conexion.prepareStatement("CREATE TABLE polizas"
			+ "(idPolizas INT(2) NOT NULL AUTO_INCREMENT,"
			+ "costo DOUBLE(10,4) NOT NULL,"
			+ "valorPrima INT(6) NOT NULL,"
			+ "fechaApertura DATE NOT NULL,"
			+ "fechaVencimiento DATE NOT NULL,"
			+"PRIMARY KEY (`idPolizas`)) ENGINE = InnoDB;");
			preparedStatement.execute();
			preparedStatement.close();
			statement.close();
			conexion.close();
		}
		catch(NullPointerException npe) {System.out.println(npe);}
		catch(ClassNotFoundException cnfe) {cnfe.printStackTrace();}
		catch(SQLException se) {se.printStackTrace();}
	}
}