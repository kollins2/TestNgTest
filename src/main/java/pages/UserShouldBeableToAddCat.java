package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UserShouldBeableToAddCat {
//	Validate a user is able to add a category and once the category is 
//	added it should display

//	  } 

	@FindBy(how = How.NAME, using = "data")
	WebElement Add_A_Categogory;

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[2]")
	WebElement Click_Add_Botton;
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement Add_Category;

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement Click_Add_Botton2;
	@FindBy(how = How.NAME, using = "colour")
	WebElement Select_Add_Color;
	@FindBy(how = How.NAME, using = "due_month")
	WebElement Month_exist_Dropdown;

	WebDriver driver;

	public void UserAddCat(WebDriver drivers) {
		this.driver = drivers;

	}

	String enteredCategory;

	public int generateRandomNum(int i) {
		Random radom = new Random();
		int generatedNum = radom.nextInt(999);
		return generatedNum;

	}

	public void addAcategogory(String category) throws InterruptedException {

		enteredCategory = category + generateRandomNum(9999);
		Add_A_Categogory.sendKeys(enteredCategory);
		Thread.sleep(1000);
		String str = "Add_A_Categogory.sendKeys(enteredCategory))";

		System.out.println(str + "Text Entered");
	}

	public void clickAddbotton() throws InterruptedException {
		Click_Add_Botton.click();
		Thread.sleep(2000);
	}

	public void addCategory1(String categoryb) throws InterruptedException {

		Add_Category.sendKeys(categoryb + generateRandomNum(9999));
		Thread.sleep(2000);
	}

	public void clickAddbotton2() throws InterruptedException {
		Click_Add_Botton2.click();
		Thread.sleep(2000);
	}

	public void MonthexistDropdown() {
		Select selectMonthDropDown = new Select(Month_exist_Dropdown);
		List<WebElement> alloptions = selectMonthDropDown.getOptions();
		String months = " None;Jan;Feb;Mar;Apr;May;Jun;Jul;Aug;Sep;Oct;Nov;Dec";
		String[] arryMonth = months.split(",");
		for (String str : arryMonth) {
			boolean Found = false;
			for (WebElement ele : alloptions) {
				if (str.equals(ele.getText())) {

				}
				Found = true;
				System.out.println(str + ":" + "option value exist");
				break;
			}
			if (!Found) {
				System.out.println(str + "option value not exist");
			}

		}

	}

}
