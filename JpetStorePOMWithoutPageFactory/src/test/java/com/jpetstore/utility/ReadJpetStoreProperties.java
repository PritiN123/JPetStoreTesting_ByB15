package com.jpetstore.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.python.antlr.PythonParser.return_stmt_return;

public class ReadJpetStoreProperties {

	private static Properties findFile() {
		try{
			FileInputStream file=
					new FileInputStream(
							"C:\\Users\\Admin\\eclipse-workspace\\Automation Testing\\JpetStorePOMWithoutPageFactory\\src\\test\\resources\\Jpetstore.properties");
			Properties prop=new Properties();
			prop.load(file);
			return prop;
		}catch (IOException e) {
				e.printStackTrace();
				return null;
		}
	}
	
	public static String getChromeExe() {
		Properties properties = findFile();
		return  properties.getProperty("chrome.exe");
		
	}
	public static String getJPetStoreRegistraionURl() {
		Properties properties = findFile();
		return  properties.getProperty("jpetstore.url");
		
	}
	
	public static String[] getLoginDetailsValue() {
		String []details=new String[2];
		Properties properties = findFile();
		details[0]= properties.getProperty("jpetstore.username");
		details[1] = properties.getProperty("jpetstore.password");
		return details;
	}
	public static String[] getRegisterDetailsValue() {
		Properties properties = findFile();
		String []reg= {properties.getProperty("jpetstore.username"),
				properties.getProperty("jpetstore.password"),
				properties.getProperty("jpetstore.firstname"),
				properties.getProperty("jpetstore.lastname"),
				properties.getProperty("jpetstore.email"),
				properties.getProperty("jpetstore.phone"),
				properties.getProperty("jpetstore.address1"),
				properties.getProperty("jpetstore.address2"),
				properties.getProperty("jpetstore.city"),
				properties.getProperty("jpetstore.state"),
				properties.getProperty("jpetstore.zipcode"),
				properties.getProperty("jpetstore.country"),
				properties.getProperty("jpetstore.language"),
				properties.getProperty("jpetstore.catagory"),
				};
		return reg;
	}
}
