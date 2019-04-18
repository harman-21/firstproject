
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

	public class validateTitleTest extends Base{
		public Logger log = LogManager.getLogger(validateNavigationBarTest.class.getName());
	@Test
	public void Vtitle() throws IOException {
		
		driver = SelectBrowser();
		LandingPage lp= new LandingPage(driver);
		
		Assert.assertEquals(lp.Title().getText(), "FEATURED COURSES");
		log.info("validating title");
		
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
	}

	
}
