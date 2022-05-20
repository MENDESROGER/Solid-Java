package br.com.solid.Isp;

import br.com.solid.Isp.vehicle.Car;
import br.com.solid.Isp.vehicle.Motorcycle;
import br.com.solid.Isp.vehicle.TypeVehicle;

public class Main {
	
	private static TypeVehicle typeVehicle;
	public static void main(String[] args) {
		typeVehicle = TypeVehicle.CAR;
		
		if(typeVehicle == TypeVehicle.CAR) {
			Car car = new Car("Azul","2022",2.6,4);
			
		}else {
			Motorcycle motocycle = new Motorcycle("branca","2022",250);
		}

		
	}

}
