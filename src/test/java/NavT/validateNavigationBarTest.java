package NavT;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import NavMain.Base;
import NavMain.LandingPage;
public class validateNavigationBarTest extends Base{
	public Logger log = LogManager.getLogger(validateNavigationBarTest.class.getName());
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
	}
	@Test()
	public void NavBar() throws IOException, InterruptedException {
		
		driver = SelectBrowser();
		log.info("Selected browser is getting invoked");
		log.info("website is opening");
		LandingPage lp= new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp.close2().click();
		log.info("subscribe pop up is closed");
		Assert.assertTrue(lp.NavBar().isDisplayed());
		log.info("validating if the navigation bar is displayed  on the page or not");
		
		
	}

}


