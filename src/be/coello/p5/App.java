package be.coello.p5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) throws IOException {
		
		Person p = new Person();
		ArrayList<Client> clients = new ArrayList<>(); 
		String filename = "/home/robin/Documents/ws2019-2020/P5/data/info.csv"; 
		
		String info; 
		
		System.out.println(p);
		
		Person p2 = new Person("Robison", "Coello"); 
		
		System.out.println(p2);
		
	
		Client c  = new Client("Andres", "Perez", 1020, 0);
		Client c1 = new Client("Luis", "Van del peres", 1021, 0);
		Client c2 = new Client("Ana", "Ali", 1022, 0);
		Client c3 = new Client("Julia", "Alarcon", 1023, 50);
		
		clients.add(c); 
		clients.add(c1); 
		clients.add(c2);
		clients.add(c3);
		
		
		Company compa = new Company("ABC SPRL", clients); 
		
		info = compa.readFile(filename);
			
		compa.writeFile(filename, clients);
		

		System.out.println(compa.readFile(filename));
		
		clients.remove(c); 
		compa.writeFile(filename, clients);
		info = compa.readFile(filename);
		System.out.println(info);
		
		
		

	}
	
	
	




}
