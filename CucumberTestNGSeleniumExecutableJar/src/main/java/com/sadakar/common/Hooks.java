package com.sadakar.common;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

	@Before //Cucumber hook - runs for each scenario
	public static void setupDriver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@After //Cucumber hook - runs for each scenario
	public static void quitDriver() throws Exception {
		driver.quit();
	}

}
