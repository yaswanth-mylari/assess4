package pageLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class benifits {
	public WebDriver driver;
	By mb=By.cssSelector("a[title*='Member']");
	By ke=By.cssSelector("h3[class=\\\"l-margin-top \\\"]");
	public benifits(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement mb() {
		return driver.findElement(mb);
	}
	public List<WebElement> keys() {
		return driver.findElements(ke);
	}
}
