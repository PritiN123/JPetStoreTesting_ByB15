package com.jpetstore.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.antlr.PythonParser.return_stmt_return;

public class JPetStoreComman {

	private static WebDriver driver;
	public static WebDriver getDriver() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", ReadJpetStoreProperties.getChromeExe());
			driver=new ChromeDriver();
			return driver;
		}
		return driver;
	}
}
