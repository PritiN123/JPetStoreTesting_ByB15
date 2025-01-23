package com.jpetsore.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jpetstore.pages.SignUpLocators;
import com.jpetstore.utility.JPetStoreComman;
import com.jpetstore.utility.ReadJpetStoreProperties;

public class RegistrationOfJPetStoreTests {

	WebDriver driver;
	SignUpLocators sl;
	@BeforeSuite
	public void openBrowser() {
		
		System.out.println("Start");
		 driver = JPetStoreComman.getDriver();
		 sl=new SignUpLocators(driver); 
	}
	
	@BeforeTest
	public void openJpetStoreRegisterUrl() {
		driver.get(ReadJpetStoreProperties.getJPetStoreRegistraionURl());
		driver.manage().window().maximize();
	}
	@Test
	public void fillRegisterData() {
		
		String[] register = ReadJpetStoreProperties.getRegisterDetailsValue();
		sl.jPetStoreRegister1(register[0], register[1],register[1],register[2],register[3],
				register[4],register[5]);
	}
	@Test
	public void fillRegisterData2() {
		String[] register = ReadJpetStoreProperties.getRegisterDetailsValue();
		sl.jPetStoreRegister2(register[6], register[7], register[8], register[9], 
				register[10], register[11], register[12], register[13]);
	}
	
	@AfterSuite
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
