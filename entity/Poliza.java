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
public class Poliza
{
//	String fechaApertura, fechaVencimiento;
	int costoPoliza, valorPrima;
	//Setters
	void setCostoPoliza(int costoPoliza) {this.costoPoliza=costoPoliza;}
	void setValorPrima(int valorPrima) {this.valorPrima=valorPrima;}
	//Getters
	int getCostoPoliza() {return costoPoliza;}
	int getValorPrima() {return valorPrima;}
	//Contructor
	void Poliza() {}
	//Contructor Sobrecargado
	void Poliza(int costoPoliza, int valorPrima)
	{
		this.setCostoPoliza(costoPoliza);
		this.setValorPrima(valorPrima);
	}
}