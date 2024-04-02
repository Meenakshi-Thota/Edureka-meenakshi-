package StepDefinitions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import Pages.Blog_page;
import Pages.EBook;
import Pages.Interview_Questions;
import Pages.Subscribe;
import Pages.Vedios;
//import Pages.Webinar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator.Implicit;

public class Edureka_Blog {
	WebDriver driver;
	@Given("user is on Edureka Home page")
	public void user_is_on_edureka_home_page() {
	    
		//driver=new ChromeDriver();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		

	}
    
	@When("user click on Blog")
	public void user_click_on_blog() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		Blog_page bg=new Blog_page(driver);
		//driver.findElement(By.xpath("//a[@class='blog_click']")).click();
		bg.blog_page();
	}

	@When("user click on BI and Visualization")
	public void user_click_on_bi_and_visualization() {
		//driver.findElement(By.xpath("//h3[@class='category-name' and contains(text(),'BI and Visualization')]")).click();
		Blog_page bi=new Blog_page(driver);
		bi.BI_visualization();
	}

	@When("user click on Pentaho BI")
	public void user_click_on_pentaho_bi() {
		//driver.findElement(By.xpath("//*[@id='category-course-blog-list-2']/section/div/div/div/div[1]/div/div[2]/a")).click();
		Blog_page pen=new Blog_page(driver);
		pen.Penthaho_BI();
	}

	@When("user click on Become a certified professional")
	public void user_click_on_become_a_certified_professional()  {
		//driver.findElement(By.xpath("/html/body/section[1]/div/div/div/a")).click();
		Blog_page cer=new Blog_page(driver);
		cer.certification();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	}

	@Then("user click on Enroll now")
	public void user_click_on_enroll_now() throws InterruptedException {
	    
		JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,650)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//i[@class='icon-down-arrow_ico']")).click();
        
        Blog_page en=new Blog_page(driver);
        en.Enroll_now();
	}

	@When("user click on Ebook")
	public void user_click_on_ebook() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    //driver.findElement(By.xpath("/html/body/header/nav/div/ul[1]/li[4]/a")).click();
	    
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,300)");
        EBook eb=new EBook(driver);
        eb.E_Book();
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	}

	@When("user click on Free Cybersecurity eBook")
	public void user_click_on_free_cybersecurity_e_book() {
//		WebElement name=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div/a/img"));
//		name.click();
		EBook cy=new EBook(driver);
		cy.Cyber_Security();
		
	}

	@When("user enters the name as {string}")
	public void user_enters_the_name_as(String name) {
	    //driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div[2]/div[2]/div[2]/div/form/div[1]/input")).sendKeys(string);
		EBook na=new EBook(driver);
		na.Name(name);
	}

	@When("user enters the email as {string}")
	public void user_enters_the_email_as(String email) {
//	    WebElement email=driver.findElement(By.xpath("//*[@id='ebookDiv']/div/form/div[2]/input"));
//	    email.sendKeys(string);
		EBook em=new EBook(driver);
		em.Email(email);
	}

	@When("user enters the phone number as {string}")
	public void user_enters_the_phone_number_as(String phoneNumber) {
	    //driver.findElement(By.xpath("//input[@class='form-control ebook_mobile_country_code phone_number_input popusrphn phone_no ebook_mobile' ]")).sendKeys(string);
		EBook phn=new EBook(driver);
		phn.Phone_Number(phoneNumber);
	}
	
	@When("user select the experience as {string}")
	public void user_select_the_experience_as(String experience) {
		EBook ex=new EBook(driver);
		ex.experience(experience);
	}

	@Then("user click on Dowload Ebook")
	public void user_click_on_dowload_ebook() {   
        //driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block submit-btn ebook_download']")).click();
		EBook dl=new EBook(driver);
		dl.Download();
	}
	
	
	

	@When("user scrolls up")
	public void user_scrolls_up() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,500)");
	}

	@When("user click on vedios")
	public void user_click_on_vedios() {
	    //driver.findElement(By.xpath("//span[@class='d-block' and contains(text(),'211+ Video')]")).click();
		Vedios vdd= new Vedios(driver);
		vdd.ved();
	}

	@When("user clicks on Selenium tutorial")
	public void user_clicks_on_selenium_tutorial() {
	    //driver.findElement(By.xpath("//a[@class='ga-recent-blogs' and contains(text(),'Selenium Tutorial – A Complete Tutorial on Seleni...')]")).click();
		Vedios vd= new Vedios(driver);
		vd.totu();
	}

	@Then("user get serise of vedios")
	public void user_get_serise_of_vedios() {		
		
	}

	@When("user scrolls down")
	public void user_scrolls_down() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,500)");
	}

	@When("user click on interview question")
	public void user_click_on_interview_question() {
	    //driver.findElement(By.xpath("//span[@class='d-block' and contains(text(),'122+ Question Banks')]")).click();
		Interview_Questions iq=new Interview_Questions(driver);
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,500)");
	    iq.Questions();
	}

	@When("user click on oracle interview questions")
	public void user_click_on_oracle_interview_questions() {
	    //driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div/a/img")).click();
		Interview_Questions iq1=new Interview_Questions(driver);
		iq1.oracle_ques();
		
	}

	@Then("user will get interview questions")
	public void user_will_get_interview_questions() {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,700)");
	}
	
	@When("user click on subscribe button")
	public void user_click_on_subscribe_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    //driver.findElement(By.xpath("//button[@class='signUp_popup nav-link subscribe-btn subscribe-link '] ")).click();
		Subscribe s1=new Subscribe(driver);
		s1.subscribe();
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String string) throws InterruptedException {
		Thread.sleep(3000);
	    //driver.findElement(By.id("signupname")).sendKeys(string);
		Subscribe s2=new Subscribe(driver);
		s2.username(string);
	}

	@Then("user click on sign up")
	public void user_click_on_sign_up() {
	   // driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block signup-btn defdisablesignup disabled']")).click();
		Subscribe s3=new Subscribe(driver);
		s3.sindUp();
	}






}
