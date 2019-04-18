package NavMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navigation = By.cssSelector(".nav.navbar-nav.navbar-right");
	
	By close = By.cssSelector("div[class*='sumome-react-wysiwyg-close-button']");
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	public WebElement close2()
	{
		return driver.findElement(close);
	}
	public WebElement SignIn()
	{
		return driver.findElement(signin);
	}
	
	public WebElement Title()
	{
		return driver.findElement(title);
	}
	public WebElement NavBar()
	{
		return driver.findElement(navigation);
	}
	
}
