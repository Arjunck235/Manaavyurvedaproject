package testpackage;

import java.time.Duration;

import org.testng.annotations.Test;

import pagepackage.Manapage;

public class Manatest extends Manabaseclass {

	@Test
	public void test() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Manapage ob=new Manapage(driver);
		ob.loginbutton();
		ob.loginpage("arjunck000@gmail.com", "Mana123");
		ob.login();
		ob.search();
		ob.searchpro("Soap");
		ob.product();
		ob.addcart();
		ob.cartaddbtn();
		ob.checkout();
		ob.addresrch("Kalpathy,palakkad,kerala");
		ob.apartmnt("Geethanjali ho,House no:123");
		ob.city("Palakkad");
		ob.statevalue();
		ob.pin("678003");
		ob.phone("9048920003");
		driver.navigate().back();
		ob.cartclosebtn();
		ob.logout();
		ob.logoutpage();
	
	}
}
