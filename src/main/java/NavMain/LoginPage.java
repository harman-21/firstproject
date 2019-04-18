package NavMain;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	By email=By.cssSelector("input[name='user[email]']");
	By password =By.cssSelector("input[name='user[password]']");
	By login = By.xpath("//input[@value='Log In']");
	
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement LogIn()
	{
		return driver.findElement(login);
	}
}
