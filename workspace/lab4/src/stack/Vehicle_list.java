package stack;
import java.io.*;
public class Vehicle_list implements Serializable{
	Stack<Vehicle> car = new Stack <Vehicle>();
	
	public void add(Vehicle x)
	{
		car.push(x);
	}
	public void list()
	{
		for (Vehicle i: car) {
			System.out.println(i.print());
			}

	}
}
