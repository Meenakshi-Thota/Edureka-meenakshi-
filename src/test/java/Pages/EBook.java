package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EBook {
	WebDriver driver;
	public EBook(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/header/nav/div/ul[1]/li[4]/a") WebElement ebook;
	
	@FindBy(xpath="/html/body/section[2]/div/div/div[1]/div/div/a/img") WebElement cybersecurity;
	
	@FindBy(xpath="/html/body/section[2]/div/div/div/div[2]/div[2]/div[2]/div/form/div[1]/input") WebElement names;
	
	@FindBy(xpath="//*[@id='ebookDiv']/div/form/div[2]/input") WebElement eMail;

	@FindBy(xpath="//input[@class='form-control ebook_mobile_country_code phone_number_input popusrphn phone_no ebook_mobile' ]") WebElement phnum;
	
	@FindBy(xpath="//select[@class='form-control experience']") WebElement exp;
			
	@FindBy(xpath="//a[@class='btn btn-primary btn-block submit-btn ebook_download']") WebElement download;
	public void data (String name,String email,String phoneNumber,String experience) {
		names.sendKeys(name);
		eMail.sendKeys(email);
		phnum.sendKeys(phoneNumber);
		Select s1=new Select(exp);
		s1.selectByVisibleText(experience);
	}
	
	public void E_Book() {
//		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
//	    JavascriptExecutor jse=(JavascriptExecutor) driver;
//        jse.executeScript("window.scrollTo(0,300)");
		ebook.click();
	}
	public void Cyber_Security() {
		cybersecurity.click();
	}
	public void Name(String fname) {
		names.sendKeys(fname);
	}
	public void Email(String femail) {
		eMail.sendKeys(femail);
	}
	public void Phone_Number(String ph) {
		phnum.sendKeys(ph);
	}
	public void experience(String exper) {
		Select s1=new Select(exp);
		s1.selectByVisibleText(exper);
	}
	public void Download() {
		download.click();
	}
}
