package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vedios {
	WebDriver driver;
	public Vedios(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='d-block' and contains(text(),'211+ Video')]") WebElement vedio;
	
	@FindBy(xpath="//a[@class='ga-recent-blogs' and contains(text(),'Selenium Tutorial – A Complete Tutorial on Seleni...')]") WebElement tutorial;
			
	public void ved() {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,500)");
		vedio.click();
	}
	public void totu() {
		tutorial.click();
	}
	
}
