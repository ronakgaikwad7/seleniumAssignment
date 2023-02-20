package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	@FindBy(xpath="//input[@name='username']") private WebElement user;
	
	@FindBy(xpath="//input[@name='password']") private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement logbtn;
	
	@FindBy(xpath="//span[text()=\"PIM\"]")  private WebElement pim;
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  sendUserid()
	{
		user.sendKeys("Admin");
	}
	
	public void sendPass()
	{
		pass.sendKeys("admin123");
	}

	public void clickOnLogin()
	{
		logbtn.click();
	}
	
	public void clickOnPim()
	{
		pim.click();
	}

}



