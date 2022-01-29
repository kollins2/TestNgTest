package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Browserfactory;
//Validate that a single list item could be removed using the remove button
//when a single checkbox is selected.

public class CheckBox  {
 
	@FindBy(how = How.NAME,using ="allbox")WebElement Toggle_All_Botton ;
	@FindBy(how = How.XPATH,using ="/html/body/div[3]/input[1]")WebElement Remove_Item;
	@FindBy(how = How.NAME,using = "todo[1]")WebElement Check_Single_Item;
	
	
	
	WebDriver driver;
	
	public void CheckAllBox(WebDriver drivers) {
		 this.driver= drivers;
		 
		 
	}

	public void toggleAllBotton() {
		Toggle_All_Botton.click();
		for(int i=0; i<3; i++)
	
	System.out.println(Toggle_All_Botton.isSelected()  + "Selected");	
	}
  public void removeBottomEnableWhenAllToggle() {

	  System.out.println(Remove_Item.isEnabled() +  "Enabled");
  }

  public void CheckSingleItem() {
	  Check_Single_Item.click();
	
   System.out.println(Check_Single_Item.isSelected() + "Is selected");	
   System.out.println(Remove_Item.isEnabled() +  "Enabled");
  }
	
}