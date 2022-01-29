package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsershouldBeUnableToDuplicate {
	@FindBy(how = How.NAME, using = "data")
	WebElement Add_A_Categogory;

	@FindBy(how = How.XPATH,using ="/html/body/div[4]/input[2]")
	WebElement Click_Add_Botton;
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement Add_Category;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement Click_Add_Botton2;
	@FindBy(how = How.NAME, using = "colour")
	WebElement Select_Add_Color;
public void notAbleToAddDuplicate(String duplicate) throws InterruptedException {
		
		Add_A_Categogory.sendKeys(duplicate);
		Thread.sleep(1000);
    String str = "Add_A_Categogory.sendKeys(category))";
		
		System.out.println(str + "Text Entered");
	}

	public void NotDuplicateAddbotton() throws InterruptedException {
		Click_Add_Botton.click();
		Thread.sleep(1000);
	}

	public void notAbleToaddDuplicateCategory1(String duplicate1) {

		Add_Category.sendKeys(duplicate1);
	}

	public void NotclickAddbotton2() throws InterruptedException {
		Click_Add_Botton2.click();
	Thread.sleep(2000);
	}
	





}
