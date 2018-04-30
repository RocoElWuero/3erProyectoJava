/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author WUERO
 */
public class Cliente
{
//	~ paquete/Default:  Solo permite acceso a las Clases y al Paquete
	String nombre, direccion;
	//Setters
	void setNombre(String nombre) {this.nombre=nombre;}
	void setDireccion(String direccion) {this.direccion=direccion;}
	//Getters
	String getNombre() {return nombre;}
	String getDireccion() {return direccion;}
	//Contructor
	void Cliente() {}
	//Contructor Sobrecargado
	void Cliente(String nombre,String direccion)
	{
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}
}