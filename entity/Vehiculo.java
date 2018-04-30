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
public class Vehiculo
{
//	~ paquete/Default:  Solo permite acceso a las Clases y al Paquete
	String placa, marca, modelo;
	//Setters
	void setPlaca(String placa) {this.placa=placa;}
	void setMarca(String marca) {this.marca=marca;}
	void setModelo(String modelo) {this.modelo=modelo;}
	//Getters
	String getPlaca() {return placa;}
	String getMarca() {return marca;}
	String getModelo() {return modelo;}
	//Contructor
	void Vehiculo() {}
	//Contructor Sobrecargado
	void Vehiculo(String placa, String marca, String modelo)
	{
		this.setPlaca(placa);
		this.setMarca(marca);
		this.setModelo(modelo);
	}
}