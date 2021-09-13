package pageLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dest {
	public WebDriver driver;
	By destination=By.cssSelector("input[name=\"destinationAddress.destination\"]");
	By findhotels=By.cssSelector("button[type='submit']");
	By city=By.cssSelector("div[data-postal-code=\"560001\"]");
	public WebElement destination() {
		return driver.findElement(destination);
	}
	public WebElement findhotels() {
		return driver.findElement(findhotels);
	}
	public WebElement city() {
		return driver.findElement(city);
	}
	public dest(WebDriver driver) {
		this.driver=driver;
	}
}
