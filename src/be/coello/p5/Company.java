package be.coello.p5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Company {
	public String name;  
	public ArrayList<Client> clients;
	
	
	public Company(String name, ArrayList<Client> clients) {
		super();
		this.name = name;
		this.clients = clients;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Client> getClients() {
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + "] \nclients\n " + clients + " \n";
	} 
	
	
	
	

	public String readFile(String filemane) {
		
		File f = new File(filemane) ;
		FileReader fr = null; 
		BufferedReader br = null; 
		StringBuilder sb = new StringBuilder(); 
		String line = null; 
		
		if(f.exists()) {
			try {
				try {
					
					fr = new FileReader(f); 
					br = new BufferedReader(fr); 
					
					
					while ( (line = br.readLine()) !=null) {
						sb.append(line); 
					}
					
					
				} finally {
					br.close();
					fr.close();
					
				}
			} catch (Exception e) {
				System.err.println(e);
			}				
		}else {
			System.out.println(filemane + " no exist, check the path" );
		}		
		return sb.toString(); 
				
	}
	
	
	
	public void writeFile(String filename, ArrayList<Client> clients) throws IOException   {
			File f = new File(filename); 
			FileWriter fw = new FileWriter(f); 
			BufferedWriter bw = new BufferedWriter(fw); 
			
			if(f.exists()) {
				try {
					try {
						
						
						
						Iterator<Client> it = clients.iterator(); 
						
						while (it.hasNext()) {
							Client client = (Client) it.next();
							
							bw.write(client.toString());
							
						}
							
						
					} finally {
						// close
						bw.close();
					}
				} catch (Exception e) {
					System.err.println(e);
				}
			}else {
				System.err.println("File not exist");
				
			}

		
	}
	
	
	
	
	
	
}























