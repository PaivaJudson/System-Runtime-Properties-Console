package app;

import java.io.Console;
import java.util.Properties;
import java.util.Set;

public class Sistema {

	public static void main(String[] args) {
		
		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));
		
		/*
		Set<Object> pk = p.keySet();
		for(Object key: pk) {
			System.out.println(key + " "+ p.get(key));
		}
		*/
		Console c = System.console();
		
		
		System.out.println("Informe o user: ");
		String user = c.readLine();
		
		System.out.println("Informe a senha: ");
		char[] pass = c.readPassword();
		
		System.out.println("usuário =  "+user+ " pass = "+pass);

	}

}
