package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.CheckBox;
import pages.UserShouldBeableToAddCat;
import pages.UsershouldBeUnableToDuplicate;
import util.Browserfactory;

@Test
public class UserShouldBeableToAddCatTest {

	WebDriver driver;
	String category = "SelfLove";
	String categoryb = "SelfLove2";
	
	

	public void userShouldBeAbleToaddCat() throws InterruptedException {

		driver = Browserfactory.init();

		UserShouldBeableToAddCat AddCategory = PageFactory.initElements(driver, UserShouldBeableToAddCat.class);
		

		AddCategory.addAcategogory(category);
		AddCategory.clickAddbotton();
		AddCategory.addCategory1(categoryb);
		AddCategory.clickAddbotton2();

		

		AddCategory.MonthexistDropdown();

		Browserfactory.tearDown();
	}

}