package Practicejenkins_Framework1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignTest 
{
	@Test
	public void createCampaignTest() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("./data.properties");
		Properties p=new Properties();
		p.load(fis);
		String Url = p.getProperty("url");
		System.out.println(Url);
		System.out.println("Campaign created");

}
}
