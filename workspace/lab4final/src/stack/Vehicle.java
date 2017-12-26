package stack;
import java.io.*;
public class Vehicle implements Serializable{
 String Licence_plate;
 String Brand;
 int year;
 
 Vehicle(String x, String y, int z)
 {
	 Licence_plate = x;
	 Brand = y;
	 year = z;
 }
 public String print()
 {
	 String x;
	 x = Licence_plate +  " "  + Brand +  " " + year;
	 return x;
 }
}
