package pageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ourbrands {
	public WebDriver driver;
	By brands=By.linkText("Our Brands");
	By jwm=By.linkText("JW Marriott");
	public ourbrands(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement jwmarriot() {
		return driver.findElement(jwm);
	}
	public WebElement brand() {
		// TODO Auto-generated method stub
		return driver.findElement(brands);
	}
}
