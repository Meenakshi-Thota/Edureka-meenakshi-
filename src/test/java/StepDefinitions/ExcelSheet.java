package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Blog_page;
import Pages.EBook;
import Pages.Excel;
 
public class ExcelSheet{
	WebDriver driver;
	@DataProvider(name = "testdata")
	public Object getData() {
		Excel utils = new Excel("C:\\Users\\THOTAS\\Documents\\sprint.xlsx");
		int rows = utils.getRowCount(0);
		Object[][] download = new Object[rows][4];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < 4; j++) {
				download[i][j] = utils.getdata(0, i + 1, j);
				System.out.println(download[i][j]);
			}
		}
		return download;
	}
	@BeforeMethod 
	public void before1() { 
	driver = new ChromeDriver();
	  driver.get("https://www.edureka.co/"); 
	  driver.manage().window().maximize();
	  Blog_page bp= new Blog_page(driver);
	  bp.blog_page();
	  
	  EBook e = new EBook(driver); 
	  e.E_Book();
	  driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
	  e.Cyber_Security(); 
	}
	  
	@Test(dataProvider = "testdata")
	//@When("I fill in the deal details with {string},{string},{string},{string},{string},{string},{string},{string}")
	public void details(String name,String email,String phoneNumber,String experience) {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  EBook eb= new EBook(driver);
		 eb.data(name,email,phoneNumber,experience);
		  eb.Download();
	}
 
}

