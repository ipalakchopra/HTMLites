import java.util.*;
import java.net.*;
import java.io.*;

public class url_verify{
	
	public static void main(String[] args) {
		
		try{    
			URL url = new URL("shorturl.at/enHTV");    
			System.out.println("Protocol: " + url.getProtocol());  
			System.out.println("Host Name: " + url.getHost()); 
			System.out.println("Port Number: " + url.getPort());   
			System.out.println("File Name: " + url.getFile());    
		}  
		
		catch(Exception e){  
		    System.out.println(e);}    
		}    

	
}
