package org.ictkerala.toolsqa;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/browser-windows");
		WebElement Button=driver.findElement(By.id("tabButton"));
		String parentid=driver.getWindowHandle();
		Button.click();
		
		Set<String> Hlist=driver.getWindowHandles();
		
		for(String id:Hlist)
			if(!id.equals(parentid))
			{
				driver.switchTo().window(id);
				break;
			}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		

	}

}
