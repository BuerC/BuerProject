import Stack.Stack;
import Car.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(5);
        myStack.push(8);
        myStack.push(9);
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        Collection<Integer> c = null;
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


       /* for (int i = s.size(); i > 0; --i) {
            c.add(s.giveElement(i - 1));
        }
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it);
            it.next();
        }*/
        for (Integer i : s) {
            System.out.println(i);
        }

        boolean check = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            ArrayList<Car> garage = new ArrayList<Car>();
            while (check) {
                String input = br.readLine();
                String parts[] = input.split(" ");
                String licensPlate = null;
                String brand = null;
                String year = null;
                String part1 = parts[0];
                if (parts.length == 4) {
                    licensPlate = parts[1];
                    brand = parts[2];
                    year = parts[3];
                }

                switch (part1.toLowerCase()) {
                    case "add":
                        int yearINT = Integer.parseInt(year);
                        garage.add(new Car(licensPlate, brand, yearINT));
                        break;
                    case "list":

                        for (int i = 0; i < garage.size(); i++) {
                            Car temp = garage.get(i);
                            temp.print();
                        }
                        break;
                    case "save":
                        for (int i = 0; i < garage.size(); i++) {
                            Car temp = garage.get(i);
                            temp.save(temp.licensePlate,temp.brand,temp.year);
                        }
                        break;
                    case "load":
                        for (int i = 0; i < garage.size(); i++) {
                            Car temp = garage.get(i);
                            temp.load();
                        }
                        break;
                    default:
                        check = false;
                        System.out.println("ERRROROROR HEEELO");
                        break;


                }

            }
        } catch (IOException e) {
            System.out.println("ERRORORRORORORRORORORORORORO");
        }


    }
}