package stack;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
 public class Stack<T>  implements Iterable<T>, Serializable{
	ArrayList<T> array;
	 public  Stack()
	 	{
		 array = new ArrayList();
	 	}
	 void push(T t)//puts  the element t on top of the stack
	 	{
		 	array.add(t);
		 	
	 	} 
	 T pop() throws EmptyStackException//returns and remove the first element of the stack
	 	{
		 
		 if(array.size()==0)
		 {
			 throw new EmptyStackException();
		 }
		 else 
		 {
			  T top_of_array = array.get(0);
			  array.remove(0);
			  return top_of_array;
		 }
		
		}
	 T top() throws EmptyStackException//returns but doenst remove the first elements on top of the stack
	 	{
		 if(array.size()==0)
		 {
			 throw new EmptyStackException();
		 }
		 else
		 {
			 T top_of_array = array.get(0);
			 return top_of_array;
		 }
		
		}
	 public Iterator<T> iterator()
	 {
		 return array.iterator();
	 }
	 int size()
	 	{
		 	return array.size();
	 	}
	 void clear()
	 	{
		 	array.clear();
		 }
	
}
