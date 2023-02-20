package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class srchEmployee {
	
	@FindBy(xpath="//a[text()=\"Employee List\"]") private WebElement srchEmp;
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]") private WebElement Ename;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement srchbtn;
	
	@FindBy(xpath="(//div[@class=\"oxd-table-cell oxd-padding-cell\"])[3]") private WebElement fnameCol;
	
	public srchEmployee(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnSrchEmpbtn()
	{
		srchEmp.click();
	}
	
	public void sendEname()
	{
		Ename.sendKeys("Ronaldo");
	}
	
	public void clickOnSrchbtn(WebDriverWait wait)
	{
		wait.until(ExpectedConditions.elementToBeClickable(srchbtn));
		srchbtn.click();
	}
	
	public void verifyEmpName()
	{
		Assert.assertEquals("Ronaldo", fnameCol.getText());
	
		
	}



}
