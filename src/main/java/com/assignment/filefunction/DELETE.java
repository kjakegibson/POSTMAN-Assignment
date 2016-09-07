package com.assignment.filefunction;

import java.io.*;
import java.net.*;


 
/**
 * @author Keith Gibson
 * @since 2016-09-07
 */


public class DELETE {
	
//	URL of the API we're connecting to
	public static String endpoint = "http://localhost:1337/employee/5";
	
//	character set used for encoding URL params
	protected static String charset = "UTF-8";

//	main
	public static void main(String[] args) {
		
		try {
			
//	Requred Parameters & Values
//			String firstName = "Keith";
//			
//			String lastName = "Gibson";
//			
//			String email = "GibsonianKekth@goodmail.fun";
//					
//			String homePhone = "410-555-9876";
//			
//			String cellPhone = "410-123-4567";
//					
//			String password = "K3ithR0llz";
//			
//			String active = "1";
//			
//			
//			String queryString = String.format("firstName=%s&lastName=%s&email=%s&homePhone=%s&cellPhone=%s&password=%s&active=%s",
//				URLEncoder.encode(firstName, charset),
//				URLEncoder.encode(lastName, charset),
//				URLEncoder.encode(email, charset),
//				URLEncoder.encode(homePhone, charset),
//				URLEncoder.encode(cellPhone, charset),
//				URLEncoder.encode(password, charset),
//				URLEncoder.encode(active, charset)
//				);
			
			URL addEmployee = new URL(endpoint + "?");
			HttpURLConnection connection = (HttpURLConnection) addEmployee.openConnection();
			connection.setRequestMethod("DELETE");
			
			if (connection.getResponseCode()!= 200) {
				throw new RuntimeException("Failed : HTTP error code : " + connection.getResponseCode());
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));
			
			while (br.readLine() != null) {
				System.out.println(br.readLine());
			}
			
			connection.disconnect();
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
