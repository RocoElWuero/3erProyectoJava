/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.DdlCreacion;
import control.DmlInsercion;
import control.DqlConsultas;
import border.SistemaAseguradora;

/**
 *
 * @author WUERO
 */
public class Main
{
	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args)
	{
		DdlCreacion ddlCreacion = new DdlCreacion();
		ddlCreacion.crearPolizas();
		DmlInsercion dmlInsercion = new DmlInsercion();
		dmlInsercion.insercionClientes();
		dmlInsercion.insercionFacturas();
		dmlInsercion.insercionVehiculos();
		dmlInsercion.insercionPolizas();
//		DqlConsultas dqlConsultas = new DqlConsultas();
		SistemaAseguradora sistemaAseguradora = new SistemaAseguradora();
	}
}