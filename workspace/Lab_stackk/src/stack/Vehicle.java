package stack;
import java.io.*;
@SuppressWarnings("serial")
public class Vehicle implements Serializable{
 String Licence;
 String Brand;
 int year;
 
 Vehicle(String x, String y, int z)
 {
	 Licence = x;
	 Brand = y;
	 year = z;
 }
 public String print()
 {
	 String x;
	 x = Licence +  " "  + Brand +  " " + year;
	 return x;
 }
}
