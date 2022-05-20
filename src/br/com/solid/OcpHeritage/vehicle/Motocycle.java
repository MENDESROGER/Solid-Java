package br.com.solid.OcpHeritage.vehicle;

public class Motocycle extends Vehicle {
	
	public Motocycle(String color, String year, double engine) {
		
		this.color = color;
		this.year = year;
		this.engine = engine;
		
	}
	
	public void configureMotocycle() {
		System.out.println("Criando um moto:" + year + " " + engine + "cilindradas ");
	}
	

}
 