package UAT.ASK;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pagefactory.utility;

public class testLogin extends utility
{
	//utility selUtility = new utility();
	WebDriver wd = utility.startBrowser(); //"chrome", "http://192.168.1.15:8080/CVWeb/cvLgn"

	LoginPage lg = new LoginPage(wd);
	NewDocumentPage nd = new NewDocumentPage(wd);

	@BeforeMethod
	@Test
	public void lg() throws IOException 
	{
		lg.login(); 
	}
	
	@Test
	public void createpdf() throws IOException, InterruptedException 
	{
		nd.pdf();
	}
	
	@AfterMethod
	public void quit() 
	{
		wd.quit();

	}
}
