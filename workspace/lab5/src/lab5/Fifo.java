package lab5;
import java.io.*;
import java.util.*;
public class Fifo {
	ArrayList<String> array;
	String oldest;
	Fifo()
	{
		array = new ArrayList();
	}
	
	synchronized void put(String s) 
	{
		while(array.size()==10) {
			try {
				System.out.println("queue is currently full...please wait...");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		array.add(s);
		notify();
	}
	synchronized String get() throws IsEmpty
	{
		while(array.size()==0) {
			System.out.println("product is generating...please wait...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String a = array.get(0);
		array.remove(0);
		return a;
	}
}