package testpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Manabaseclass {
	ChromeDriver driver;
	String url="https://manaayurvedam.com/";
	@BeforeTest
	public void load()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	}


