package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testclass {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D:\\seljars\\chromedriver feb\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		
		login log=new login(driver);
		log.sendUserid();
		log.sendPass();
		log.clickOnLogin();
		log.clickOnPim();
		
		addEmployee emp=new addEmployee(driver);
		emp.clickOnAddEmp();
		emp.sendFname();
		emp.sendlname();
		
		emp.clickOnSave(wait);
	
		srchEmployee semp=new srchEmployee(driver);
		semp.clickOnSrchEmpbtn();
		semp.sendEname();
		semp.clickOnSrchbtn(wait);
		semp.verifyEmpName();
		
		//driver.quit();
				
	}

}
