package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPageObject {
	
WebDriver driver;
	
	public MenuPageObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
//	By Item = By.xpath("//a[@href='/en/menu/steaks-and-ribs/double-glazed-baby-back-ribs?order=1']");
	
	By Item = By.xpath("//a[@href='/en/menu/fire-grilled-and-chef-selections/double-glazed-baby-back-ribs?order=1']");
	
	public WebElement Clickitem()
	{
		return driver.findElement(Item);
	}

}
