//package Pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Webinar {
//	WebDriver driver;
//	public Webinar(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
//	@FindBy(xpath="//a[@class='nav-link set-mock-link ga-webinar-link' and contains(text(),'Webinars')]") WebElement webi;
//   
//	public void webinar() {
////		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
//		webi.click();
//	}
//}
