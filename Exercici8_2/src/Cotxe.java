/*
 * Cotxe.java        1.0 22/09/2015
 *
 * class Cotxe
 *
 * Copyright 2015 Jordi Llonch Neira <jordill14@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Cotxe {
	private String marca;
	private String modelo;
	private int cilindrada;
	private int nCilindro;

	public Cotxe (String marca, String modelo, int cilindrada, int nCilindro) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.nCilindro = nCilindro;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getnCilindro() {
		return nCilindro;
	}
	public void setnCilindro(int nCilindro) {
		this.nCilindro = nCilindro;
	}
	public double pFiscal() {
		return (0.08 * getnCilindro() * Math.pow((getCilindrada() / getnCilindro()), 0.6));
	}
	public String toString(){
		return getMarca() + "\t" + getModelo() + "\t" + getnCilindro() + "\t" + getCilindrada() + "\t" + pFiscal();	
	}

}
