package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscribe {
	WebDriver driver;
	public Subscribe(WebDriver driver) {  
		this.driver=driver;
		PageFactory.initElements(driver,this);

}
@FindBy(xpath="//button[@class='signUp_popup nav-link subscribe-btn subscribe-link ']") WebElement subs;
@FindBy(id="signupname") WebElement user;
@FindBy(xpath="//button[@class='btn btn-default btn-lg btn-block signup-btn defdisablesignup disabled']") WebElement singUP;

public void subscribe() {
	subs.click();
}
public void username(String un) {
	user.sendKeys(un);
}
public void sindUp() {
	singUP.click();
}
}
