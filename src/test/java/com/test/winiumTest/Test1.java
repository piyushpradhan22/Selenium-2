package com.test.winiumTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void myTest1() throws Exception {
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		URL url = new URL("http://localhost:9999");
		WiniumDriver driver = new WiniumDriver(url,option);
		Thread.sleep(5000);
		driver.findElement(By.name("One")).click();
		driver.findElement(By.name("Two")).click();
		driver.findElement(By.name("Three")).click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("One")).click();
		driver.findElement(By.name("Two")).click();
		driver.findElement(By.name("Three")).click();
		driver.findElement(By.name("Equals")).click();
		
		
		Thread.sleep(5000);
	}

}
