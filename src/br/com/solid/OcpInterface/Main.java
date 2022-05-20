package br.com.solid.OcpInterface;

import br.com.solid.OcpInterface.vehicle.Car;
import br.com.solid.OcpHeritage.vehicle.Motocycle;

public class Main {

	private static TypeVehicle typeVehicle;
	public static void main(String[] args) {
		typeVehicle = TypeVehicle.CAR;
		
		if(typeVehicle == TypeVehicle.CAR) {
			Car car = new Car("Amarelo","2001",2.0,4);
			
		} else if (typeVehicle == TypeVehicle.MOTORCYCLE){
			Motocycle motocycle = new Motocycle("Preta","2022",250);
		}
			
		

	}

}
