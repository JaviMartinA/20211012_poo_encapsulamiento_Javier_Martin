package com.primero;

public class Coche {
	private int id;
	private String marca;
	private float precio;
	public Coche(int id, String marca, float precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}//cierra clase
