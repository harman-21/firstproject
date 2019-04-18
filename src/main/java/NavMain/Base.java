package NavMain;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;

public class Base {
	  public static WebDriver driver;
	public WebDriver SelectBrowser() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\khasaria\\Downloads\\NavMaven\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\khasaria\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\khasaria\\Downloads\\geckodriver-v0.24.0-win64");
			driver = new FirefoxDriver();
			driver.get(url);
		}
		else
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\khasaria\\Downloads\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(url);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
		
	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\khasaria\\Downloads\\NavMaven\\screenshots\\"+result+"sc.png"));
	}
	

}
