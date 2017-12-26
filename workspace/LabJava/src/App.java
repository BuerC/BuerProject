import java.io.*;
import java.util.regex.Pattern;

public class App {
	
	/*public static void ls()
	{
		File file = new File("/Users/shegs/Desktop/Test");
		String[] directories = file.list();

		for(int i=0;i<directories.length;i++)
			System.out.println(directories[i]);
	}
	
	public static void ls1(String s) 
	{
		if(s.equals("-l")) 
		{
			File file = new File("/Users/shegs/Desktop/Test");
			File[] thing = file.listFiles();
			String[] directories = file.list();
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
	
	public static void pwd()
	{
		File file = new File("/Users/shegs/Desktop/Test");
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void mkdir(String s)

	{
		File dir = new File("/Users/shegs/Desktop/Test/"+s);
		boolean success =  dir.mkdir();
		if(success)
		{
			System.out.println("New directory created");
		}
		else
		{
			System.out.println("Error");
		}
	}

	
	public static void cd(String s)
	{
		File file  = new File("/Users/shegs/Desktop/Test/"+s);
		
	}*/
	public static void main(String[] args) {
		
		methods m = new methods();
		
		File dir = new File("/Users/Buertc/Desktop/lab");
		
		boolean success = dir.mkdir();
		if(success) 
		{
			System.out.println("file created!");	
		}
		else
		{
			System.out.println("failed to create");
		}
		InputStreamReader user_input = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(user_input);
		while(true) {
		try {
			String input = bufRead.readLine();
			String[] split_space = input.split(" ");
			String user_typed = split_space[0];
			if(split_space.length>1) 
				{						
					String arguments = split_space[1];
				
				}
			if( user_typed.equals("ls") && split_space.length==1) 
				{
					m.ls();
				
				}
			else if( user_typed.equals("ls") && split_space.length>1)
				{
					m.ls1(split_space[1]);
				
				}
			else if( user_typed.equals("pwd")) 
				{
					m.pwd();
			
				}
			else if( user_typed.equals("mkdir") && split_space.length>1) 
				{
					m.mkdir(split_space[1]);
				}
			else if( user_typed.equals("cd") && split_space.length>1)
			{
				if(split_space[1].equals(".."))
				{ 
					m.gb();
				}
				else
				{
					m.cd(split_space[1]);                      
				}
			}
		
			
		
		}
		catch(IOException err) 
		{
			System.out.println("Error");
		}

	}
	}
		
}	


