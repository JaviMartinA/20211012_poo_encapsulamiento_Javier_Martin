package com.segundo;

import com.primero.Coche;

public class Comprar_ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1=new Coche(1, "Seat", 20000.50f);
		Coche coche2=new Coche(2, "Peugeot", 25000.25f);
		Coche coche3=new Coche(3, "BMW", 30125.75f);
		Coche coche4=new Coche(4, "Audi", 40000f);
		float precioBMW=coche3.getPrecio();
		System.out.println("El precio del tercer coche es "+precioBMW + " euros");
	}

}//cierra main
