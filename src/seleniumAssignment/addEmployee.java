package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addEmployee {
	
	@FindBy(xpath="//a[text()=\"Add Employee\"]") private WebElement addEmp;
	
	@FindBy(xpath="//input[@name='firstName']") private WebElement fname;
	
	@FindBy(xpath="//input[@name='lastName']") private WebElement lname;
	
	
	@FindBy(xpath="//button[@type='submit']") private WebElement savebtn;
	
	public addEmployee(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddEmp()
	{
		addEmp.click();
	}
	
	public void sendFname()
	{
		fname.sendKeys("Ronaldo");
	}
	
	public void sendlname()
	{
		lname.sendKeys("C");
	}
	
	public void clickOnSave(WebDriverWait wait)
	{
		wait.until(ExpectedConditions.elementToBeClickable(savebtn));
		savebtn.click();
	}



}
