package test;

import java.awt.Checkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.CheckBox;
import util.Browserfactory;


public class CheckAllBoxTest {

    WebDriver driver;
	
    public void userShouldBeAbleToCheckBox() {
    
    driver =Browserfactory.init();

	CheckBox checkbox = PageFactory.initElements(driver, CheckBox.class);
	checkbox.toggleAllBotton();
	checkbox.removeBottomEnableWhenAllToggle();
	checkbox.CheckSingleItem();

    }

}
