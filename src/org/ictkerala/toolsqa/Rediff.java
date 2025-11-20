package org.ictkerala.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rediff {

	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
		WebElement name=driver.findElement(By.id("nseindex"));
		String mynse=name.getText();
		driver.switchTo().parentFrame();//switching back to parent frame from the iframe;
		
		
		System.out.println(name);

	}

}
