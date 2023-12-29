package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBeforeLogin {
	
	public WebDriver driver;
	public HomePageBeforeLogin (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//div[@class='inline-flex']")
	private WebElement accountbutton;
	
	@FindBy(xpath = "//div[@class='inline-flex']")
	private WebElement homeloginiconButton;
	
	@FindBy(xpath = "//div[@class='cursor-pointer pl-16']")
	private WebElement signiniconButton;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signinbutton;

	@FindBy(xpath = "//a[@class='flex justify-center pt-24 pb-16']")
	private WebElement logoutmenubutton;
	
//	getters/setters
	public WebElement getAccountbutton() {
		return accountbutton;
	}

	public WebElement getHomeloginiconButton() {
		return homeloginiconButton;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSigninbutton() {
		return signinbutton;
	}

	public WebElement getLogoutmenubutton() {
		return logoutmenubutton;
	}


	


}
