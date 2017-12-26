package stack;
import java.util.*;
import java.io.*;
public class Test {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1); s.push(2); s.push(3); s.push(4);
		for (Integer i: s) {
		System.out.println(i);
		}
	
		Vehicle v1 = new Vehicle("IIT001", "Jaguar", 2001);
		Vehicle v2 = new Vehicle("PIE314", "OPEL",2009);
		Vehicle v3 = new Vehicle("TOY123", "TOYOTA", 1999);
		Vehicle_list new_cars = new Vehicle_list();
		new_cars.add(v1);
		new_cars.add(v2);
		new_cars.add(v3);
		Scanner scanner = new Scanner(System.in);
		String input;
		String string;
		String Brand;
		int year;
	
		System.out.println("Enter 'add' to Add and 'list' to List");
		System.out.println("Enter 'save' to save and 'load' to load");
		
		while(true)
		{
			
		
			input = scanner.nextLine();
			if(input.equals("add"))
			{
				System.out.println("Enter your licence number");
				string = scanner.nextLine();
				System.out.println("Enter your Car brand");
				Brand = scanner.nextLine();
				System.out.println("Enter the year");
				year = scanner.nextInt();
				Vehicle v4 = new Vehicle(string, Brand, year);
				new_cars.add(v4);
			}
			else if(input.equals("list"))
			{
				new_cars.list();
			}
			else if(input.equals("save"))
			{
				try
				{
					FileOutputStream fileout = new FileOutputStream("C:\\Users\\buertc\\Desktop\\Test\\Serializable.txt");	
					ObjectOutputStream out = new ObjectOutputStream(fileout);
					out.writeObject(new_cars);
					out.close();
					fileout.close();
					System.out.println("saved");
				}
			catch(IOException i)
			{
				i.printStackTrace();
			}
		    }
			else if(input.equals("load"))
			{
				try
				{
					FileInputStream filein = new FileInputStream("C:\\Users\\buertc\\Desktop\\Test\\Serializable.txt");
					ObjectInputStream in = new ObjectInputStream(filein);
					new_cars = (Vehicle_list) in.readObject();
					in.close();
					filein.close();
				}
				catch(IOException i)
				{
					i.printStackTrace();
					return;
				}
				catch(ClassNotFoundException c)
				{
					System.out.println("class not found");
					c.printStackTrace();
					return;
				}
				System.out.println("loaded.....");
			}
		
	}

	}
}
