package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.UsershouldBeUnableToDuplicate;
import util.Browserfactory;
@Test
public class UsershouldBeUnableToDuplicateTest {
	String duplicate = "givenPR1";
	String duplicate1 = "GivenSP1";
	WebDriver driver;

	public void usershouldBeUnableToDuplicateTest() throws InterruptedException {

		driver = Browserfactory.init();

		UsershouldBeUnableToDuplicate unableToDuplicate = PageFactory.initElements(driver,
				UsershouldBeUnableToDuplicate.class);

		unableToDuplicate.notAbleToAddDuplicate(duplicate);

		unableToDuplicate.NotDuplicateAddbotton();

		unableToDuplicate.notAbleToaddDuplicateCategory1(duplicate1);

		Thread.sleep(2000);
		
		Browserfactory.tearDown();
	}

}
