import java.io.*;
import java.util.regex.Pattern;
public class methods {
	
	File current = new File("/Users/Buertc/Desktop/lab");
	String[] directories = current.list();
	File[] actual = current.listFiles();
	public void ls()
	{
	

		for(int i=0;i<directories.length;i++)
			System.out.println(directories[i]);
	}
	
	public void ls1(String s) 
	{
		if(s.equals("-l")) 
		{
			File file = new File("/Users/Buertc/Desktop/lab");
			File[] thing = file.listFiles();
			directories = file.list();
			for(int i=0; i<thing.length;i++) {
				
				System.out.println(thing[i].length());
				
			}
			for(int i=0; i<directories.length;++i)
			{
				String[] type = directories[i].split(Pattern.quote("."));
				
				
				System.out.println(type[type.length-1]);
			}
		}
		else
		{
			System.out.println("Error wrong input");
		}
		
	}
	
	public void pwd()
	{
		File file = new File("/Users/Buertc/Desktop/lab");
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void mkdir(String s)

	{
		File newf;
		try {
			newf = new File(current.getCanonicalFile() +"/" +s);
			newf.mkdir();
			directories = current.list();
			actual = current.listFiles();
			/*boolean success =  newf.mkdir();
			if(success)
			{
				System.out.println("New directory created");
			}
			else
			{
				System.out.println("Error");
			}*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		}
		
	}

	
	public void cd(String s)
	{
		boolean f = false;	//checks if you found the directory you ask for
		for(int i=0; i<directories.length; i++)//goes thru all the files
		{
			if(directories[i].equals(s))//checks if its equal to the string u ask for
			{
				f = true;
				try
				{
					current = new File(current.getCanonicalPath() + "/" +s);//gets the current path with canonical path
					directories = current.list();
					actual = current.listFiles();
					System.out.println(current.getCanonicalPath());
				}
				catch(Exception err)
				{
					System.out.println(err);
				}
			}
		}
		if(f == false )
		{
			System.out.println("Directory DNE");
		}
	}
	public void gb()
	{
		try 
		{
			String[] p = current.getCanonicalPath().split("/"); // \\ means when see one backslash
			String np = p[0];
			for(int i=1;i<p.length-1;i++)
			{
				np += "/"; //splits up the address get rid of the last part and then reconstruct.
				np += p[i];
			}
			System.out.println(np);
			current = new File(np);
			directories = current.list();
			actual = current.listFiles();
			
		}
		catch(Exception err)
		{
			System.out.println(err);
		}
	}
}