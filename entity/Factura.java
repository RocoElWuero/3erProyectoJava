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
public class Factura
{
//	~ paquete/Default:  Solo permite acceso a las Clases y al Paquete
	int montoFacura;
	//Setters
	void setMontoFacura(int montoFacura) {this.montoFacura=montoFacura;}
	//Getters
	int getMontoFacura() {return montoFacura;}
	//Contructor
	void Factura() {}
	//Contructor Sobrecargado
	void Factura(int montoFacura) {this.setMontoFacura(montoFacura);}
}