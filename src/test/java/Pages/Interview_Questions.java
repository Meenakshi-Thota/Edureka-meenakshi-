package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Interview_Questions {
	WebDriver driver;
	public Interview_Questions(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='d-block' and contains(text(),'122+ Question Banks')]") WebElement interview_q;
	
	@FindBy(xpath="/html/body/section[2]/div/div/div[1]/div/div/a/img") WebElement oracle;
	
	public void Questions() {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,500)");
		interview_q.click();
	}
	public void oracle_ques() {
		oracle.click();
	}

}
