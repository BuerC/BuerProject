package stack;
import java.util.*;
import java.io.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle("IIT001", "Jaguar", 2001);
		Vehicle v2 = new Vehicle("PIE314", "OPEL", 2009);
		Vehicle v3 = new Vehicle("TOY123", "TOYOTA", 1999);
		Vehicle_list Inv = new Vehicle_list();
		Inv.add(v1);
		Inv.add(v2);
		Inv.add(v3);
		Scanner scanner = new Scanner(System.in);
		String option;
		String Lp;
		String Brand;
		int year;
		while(true)
		{
			System.out.println("Enter 'add' to Add and 'list' to List");
			System.out.println("Enter 'save' to save and 'load' to load");
		
			option = scanner.nextLine();
			if(option.equals("add"))
			{
				System.out.println("Enter your licence number");
				Lp = scanner.nextLine();
				System.out.println("Enter your Car brand");
				Brand = scanner.nextLine();
				System.out.println("Enter the year");
				year = scanner.nextInt();
				Vehicle v4 = new Vehicle(Lp, Brand, year);
				Inv.add(v4);
			}
			else if(option.equals("list"))
			{
				Inv.list();
			}
			else if(option.equals("save"))
			{
				try
				{
					FileOutputStream fileout = new FileOutputStream("C:\\Users\\shegs\\Desktop\\Test\\Serializable.txt");	
					ObjectOutputStream out = new ObjectOutputStream(fileout);
					out.writeObject(Inv);
					out.close();
					fileout.close();
					System.out.println("Uniting the Titans");
				}
			catch(IOException i)
			{
				i.printStackTrace();
			}
		    }
			else if(option.equals("load"))
			{
				try
				{
					FileInputStream filein = new FileInputStream("C:\\Users\\shegs\\Desktop\\Test\\Serializable.txt");
					ObjectInputStream in = new ObjectInputStream(filein);
					Inv = (Vehicle_list) in.readObject();
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
					System.out.println("Employee class not found");
					c.printStackTrace();
					return;
				}
				System.out.println("Uniting the league.....");
			}
		/*Stack<Integer> s = new Stack<Integer>();
			s.push(1); s.push(2); s.push(3); s.push(4);
			for (Integer i: s) {
			System.out.println(i);
			}
			try
			{
				
				}
			}
			catch(EmptyStackException r)
			{
				System.out.println("Empty Stack");
			}
		*/
	}

	}
}
