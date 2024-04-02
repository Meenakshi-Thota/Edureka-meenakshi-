package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Blog_page {
	WebDriver driver;
	public Blog_page(WebDriver driver) {  
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@class='blog_click']") WebElement blog;
	
	@FindBy(xpath="//h3[@class='category-name' and contains(text(),'BI and Visualization')]") WebElement visualization;
	
	@FindBy(xpath="//*[@id='category-course-blog-list-2']/section/div/div/div/div[1]/div/div[2]/a") WebElement pentaho_BI;
	
	@FindBy(xpath="/html/body/section[1]/div/div/div/a") WebElement certified;
	
	@FindBy(xpath="/html/body/section[5]/div/div[2]/div[2]/div/div[3]/a") WebElement enroll;
	
	public void blog_page() {
		blog.click();
	}
	public void BI_visualization() {
		visualization.click();
	}
	public void Penthaho_BI() {
		pentaho_BI.click();
	}
	public void certification() {
//		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		certified.click();
	}
	public void Enroll_now() throws InterruptedException {
//		JavascriptExecutor jse=(JavascriptExecutor) driver;
//        jse.executeScript("window.scrollTo(0,650)");
//        Thread.sleep(2000);
		enroll.click();
	}
	
}
