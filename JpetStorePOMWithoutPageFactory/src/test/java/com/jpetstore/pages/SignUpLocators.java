package com.jpetstore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpLocators {

	static WebDriver driver;
	
	public SignUpLocators(WebDriver driver) {
		this.driver=driver;
	}
	
	By userId=By.xpath("//input[@name=\"username\"]");
	By password=By.xpath("//input[@name=\"password\"]");
	By conPassword=By.xpath("//*[@id=\"CenterForm\"]/form/table[1]/tbody/tr[3]/td[2]/input");
	By firstName=By.cssSelector("#CenterForm > form > table:nth-child(4) > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]");
	By LastName=By.cssSelector("#CenterForm > form > table:nth-child(4) > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=text]");
	By email=By.xpath("//*[@id=\"CenterForm\"]/form/table[2]/tbody/tr[3]/td[2]/input");
	By phone=By.xpath("//*[@id=\"CenterForm\"]/form/table[2]/tbody/tr[4]/td[2]/input");
	By address1=By.xpath("//*[@id=\"CenterForm\"]/form/table[2]/tbody/tr[5]/td[2]/input");
	By address2=By.xpath("//*[@id=\"CenterForm\"]/form/table[2]/tbody/tr[6]/td[2]/input");
	By city=By.xpath("//*[@id=\"CenterForm\"]/form/table[2]/tbody/tr[7]/td[2]/input");
	By state=By.xpath("//*[@id=\"CenterForm\"]/form/table[2]/tbody/tr[8]/td[2]/input");
	By zipCode=By.xpath("//*[@id=\"CenterForm\"]/form/table[2]/tbody/tr[9]/td[2]/input");
	By country=By.xpath("//*[@id=\"CenterForm\"]/form/table[2]/tbody/tr[10]/td[2]/input");
	By lang=By.xpath("//*[@id=\"CenterForm\"]/form/table[3]/tbody/tr[1]/td[2]/select");
	By cat=By.xpath("//*[@id=\"CenterForm\"]/form/table[3]/tbody/tr[2]/td[2]/select");
	By enableMyList=By.xpath("//*[@id=\"CenterForm\"]/form/table[3]/tbody/tr[3]/td[2]/input");
	By enableMyBanner=By.xpath("//*[@id=\"CenterForm\"]/form/table[3]/tbody/tr[4]/td[2]/input");
	By saveAccount=By.xpath("//*[@id=\"CenterForm\"]/form/div/button");
	

	public void userIdAndPassword(String user,String pass) {
		driver.findElement(userId).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
	}
	public void jPetStoreRegister1(String user,String pass,String confPass,String fn,String ln, String mail, String ph) {
		driver.findElement(userId).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(conPassword).sendKeys(confPass);
		driver.findElement(firstName).sendKeys(fn);
		driver.findElement(LastName).sendKeys(ln);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(phone).sendKeys(ph);
		
	}
	public void jPetStoreRegister2(String ad1,String ad2, String cityName,String st,String zp,String cn,String ln, String ct) {
		driver.findElement(address1).sendKeys(ad1);
		driver.findElement(address2).sendKeys(ad2);
		driver.findElement(city).sendKeys(cityName);
		driver.findElement(state).sendKeys(st);
		driver.findElement(zipCode).sendKeys(zp);
		driver.findElement(country).sendKeys(cn);
		driver.findElement(lang).sendKeys(ln);
		driver.findElement(cat).sendKeys(ct);
		driver.findElement(enableMyList).click();
		driver.findElement(enableMyBanner).click();
		driver.findElement(saveAccount).click();
		
		
	}
}
