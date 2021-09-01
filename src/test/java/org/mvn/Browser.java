package org.mvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navaneetham\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exet");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}

}
