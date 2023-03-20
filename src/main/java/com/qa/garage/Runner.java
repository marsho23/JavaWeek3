package com.qa.garage;
import java.util.ArrayList;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Billable;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.Plane;
import com.qa.garage.vehicle.Vehicle;

public class Runner {

	public static void main(String[] args) {
		Garage g = new Garage();

		g.addVehicle(new Car(4, "Black"));
		g.addVehicle(new Boat(0, "Blue"));
		g.addVehicle(new Bike(2, "Red"));
		g.addVehicle(new Car(3, "red"));

		Boat b1 = new Boat (0,"yellow");
		g.addVehicle(b1);
		System.out.println(g);

//		g.removeByType("car");
		g.remove(Car.class);
		System.out.println(g.toString());
		
		ArrayList<Billable> billables = new ArrayList<>();
		
		billables.add(b1);	
		billables.add(new Bike(2, "black"));
		billables.add(new Plane(6, "orange"));
		billables.add(new Car(4, "white"));



		billables.add(new Employee("a",18,"software"));
		billables.add(new Employee("b",20,"art"));
		billables.add(new Employee("c",22,"architecture"));
		
		for (Billable billable:billables) {
			System.out.println( billable.calcBill());
		}


	}

}
